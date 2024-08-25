package Test_NG_Frame_Work_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon extends Base_Class{
	
	@Test
	public void amazon() {
//		WebDriverManager.chromedriver().setup();		
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Jeans");
		search.sendKeys(Keys.ENTER);
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();	
    
	}
}
