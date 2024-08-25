package AutomationFB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginFB {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.id("email")).sendKeys("saathyamoorthy@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("Australia@123");
		//driver.findElement(By.name("loginbutton")).click();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//driver.findElement.(By.name("firstname").sendkeys("james");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Test1");
//		reg_email__
		driver.findElement(By.name("lastname")).sendKeys("Test2");
		driver.findElement(By.name("reg_email__")).sendKeys("Test@test.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Test@test.com");
		//reg_passwd__
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456456");
		WebElement days = driver.findElement(By.id("day"));
		Select sel = new Select(days);
		sel.selectByVisibleText("31");
		
		WebElement months = driver.findElement(By.id("month"));
		Select selmonth = new Select(months);
		selmonth.selectByVisibleText("Mar");
		
	WebElement years = driver.findElement(By.id("year"));
	Select selyear = new Select(years); 
		//WebElement years = driver.findElement(By.id("year"));
		//Select selyear = new Select(years);
		selyear.selectByVisibleText("1998");
		//selyear.selectByVisibleText("1987");
		
		WebElement gender = driver.findElement(By.cssSelector("input[value='1']"));
		gender.click();
//		driver.findElement(By.name("birthday_day")).sendKeys("7");
	//	driver.findElement(By.name("birthday_month")).sendKeys("Nov");
		//driver.findElement(By.name("birthday_year")).sendKeys("1999");
		// driver.manage().window().minimize();
		// driver.manage().window().fullscreen();
		// driver.manage().window().minimize();
		// driver.quit();
		
		
	}
}
