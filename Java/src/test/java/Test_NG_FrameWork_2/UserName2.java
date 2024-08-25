package Test_NG_FrameWork_2;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserName2 {

	public WebDriver driver;
	
	@Test
	public void userName() throws InterruptedException, TimeoutException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement user = driver.findElement(By.xpath("//*[@placeholder='Email address or phone number']"));
		user.sendKeys("Username");
		Thread.sleep(2000);
//		throw new NoSuchElementException();
		throw new TimeoutException();
//		//throw new NullPointerException();
//		throw new RuntimeException();
//		throw new NoAlertPresentException();
//		throw new NoSuchWindowException(null);

	}
	//dependsOnMethods = "userName"
	@Test(dependsOnMethods = "userName")
	public void passowrd() {
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("PASSWORD");
	}
}
