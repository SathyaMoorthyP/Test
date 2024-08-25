package newly_executed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moremethods {
	public WebDriver driver;
	
//	@BeforeMethod
//	public void openBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.youtube.com/");
//		driver.manage().window().maximize();
//	}
	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("Jawan Tamil Trailer");
		search.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//a[@id='video-title']")).click();
//		driver.findElement(By.xpath("//*[@id='title-wrapper']//yt-icon/following-sibling::yt-formatted-string")).click();
		driver.findElement(By.xpath("(//*[@id='title-wrapper']//yt-icon/following-sibling::yt-formatted-string)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@aria-label='I understand and wish to proceed']")).click();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		driver.navigate().back();
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.click();
		search.clear();
		search.sendKeys("Jailer Tamil Trailer");
		search.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//a[@id='video-title']")).click();
//		driver.findElement(By.xpath("//*[@id='title-wrapper']//yt-icon/following-sibling::yt-formatted-string")).click();
		driver.findElement(By.xpath("(//*[@id='title-wrapper']//yt-icon/following-sibling::yt-formatted-string)[1]")).click();
		Thread.sleep(3000);
//		driver1.findElement(By.xpath("//*[@aria-label='I understand and wish to proceed']")).click();
		Thread.sleep(5000);
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
