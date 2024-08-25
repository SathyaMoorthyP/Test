package Test_NG_FrameWork_2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		}
	
	@AfterMethod
	public void closeBroser() {
		driver.close();
	}
	
	
}
