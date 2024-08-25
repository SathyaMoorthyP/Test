package newly_executed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_fb {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		WebElement phoneno = driver.findElement(By.xpath("//input[@id='email']"));
		phoneno.sendKeys("9500100608");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("sathya71192");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(7000);
		options.addArguments("--disable-notifications");
		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search Facebook']"));
		search.sendKeys("Narayanan Nanban");
		search.sendKeys(Keys.ENTER);
		
		
	}
	
}
