package feb28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAmazonPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		1.using pixcel
//		js.executeScript("window.scrollBy(0,1000)", "");
//		js.executeScript("window.scrollBy(0,-700)", "");
		
		//2.scrolling the webpage until we find the webelement
		WebElement ess = driver.findElement(By.xpath("//div[contains(text(),'India')]"));
		js.executeScript("arguments[0].scrollIntoView();", ess);

		//3.Sroll down to the webpage
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
	
	}
}
