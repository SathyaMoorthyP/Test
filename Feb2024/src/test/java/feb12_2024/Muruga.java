package feb12_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Muruga {
	
	public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement firstElement = driver.findElement(By.xpath("//div[@class='YacQv']/following-sibling::textarea"));
		firstElement.sendKeys("Murugan"+Keys.ENTER);
		driver.findElement(By.xpath("//div[@jsname='bVqjv']/span[text()='Images']")).click();	
	}
}
