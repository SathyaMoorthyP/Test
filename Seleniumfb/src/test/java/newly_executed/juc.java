package newly_executed;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class juc(){
	
	@Test
	public voidd args () {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
			search.sendKeys("Jawan Tamil Trailer");
			search.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//a[@id='video-title']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@aria-label='I understand and wish to proceed']")).click();
		
}	
}
