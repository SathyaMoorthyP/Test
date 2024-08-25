package D2_Selenium_Target_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D1_LearnMouseOver {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gclid=CjwKCAjwg4SpBhAKEiwAdyLwvNqqeQXPnY95O0t3KiQlpgzvAnf6L5oIXkAyb3VfDm4b2U6M1KTGbRoCqBwQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 WebElement eleMen = driver.findElement(By.xpath("//a[text()='Men']/parent::div[@class='desktop-navLink']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(eleMen).perform();
		
	}

}
