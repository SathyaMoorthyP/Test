package E2_TestNG_Framework_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B1_Learn_Parameter_CreateLead_BaseClass {
			
	public ChromeDriver driver;

	@Parameters({"url", "username", "password" })
	@BeforeMethod
	public void preCondition(@Optional ("http://leaftaps.com/opentaps/control/main") String url, String username, String Password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.className("decorativeSubmit")).click();	
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
