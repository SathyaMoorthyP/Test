package Test_NG_Frame_Work_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void maximizeBrowser() throws InterruptedException {
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void waitTime() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
