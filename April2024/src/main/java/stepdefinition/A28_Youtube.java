package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A28_Youtube {
	
	public static void main(String[]args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("SDET-QA" + Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'Manual Testing(Full Course)')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Manual Software Testing Training Part-5')]")).click();
		
		
	}
}
