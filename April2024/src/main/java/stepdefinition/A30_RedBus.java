package stepdefinition;

import java.time.Duration;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A30_RedBus {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);	
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='From']/preceding-sibling::*")).sendKeys("Chennai"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='To']/preceding-sibling::*")).sendKeys("Namakkal"+Keys.ENTER);
		//driver.findElement(By.xpath("//*[text()='Date']")).click();
		driver.findElement(By.xpath("//div[@class='labelCalendarContainer']/i")).click();
		driver.findElement(By.xpath("//span[text()='25']")).click();		
		//tr[@class='rb-monthHeader']/td[2]
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
	}
}

