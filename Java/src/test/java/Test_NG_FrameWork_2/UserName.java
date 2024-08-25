package Test_NG_FrameWork_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserName {

public WebDriver driver;
// 
// public void driver(WebDriver driver) {
//	 this.driver = driver;
//	 
// }
	
	@Test
	public void userName() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement user = driver.findElement(By.xpath("//*[@placeholder='Email address or phone number']"));
		user.sendKeys("Username");
		Thread.sleep(2000);
	
	}
	
//	@Test(dependsOnMethods = "userName")
//	public void passowrd() {
//		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("PASSWORD");
//	}
}
