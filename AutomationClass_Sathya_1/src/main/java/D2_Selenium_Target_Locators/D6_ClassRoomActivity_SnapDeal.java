package D2_Selenium_Target_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D6_ClassRoomActivity_SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 WebElement mens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		 WebElement shirts = driver.findElement(By.xpath("//span[text()='Shirts']"));
		 
		 Actions builder = new Actions(driver);
		 builder.moveToElement(mens)
		 		.pause(Duration.ofSeconds(2))
		 		.click(shirts)
		 		.perform();
		 
		 Thread.sleep(2000);
		 
		 WebElement firstshirt = driver.findElement(By.xpath("//div[@class='product-tuple-image ']"));
		 builder.moveToElement(firstshirt).perform();
		 
		 driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
	}

}
