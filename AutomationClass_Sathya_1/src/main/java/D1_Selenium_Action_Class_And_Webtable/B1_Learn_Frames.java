package D1_Selenium_Action_Class_And_Webtable;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class B1_Learn_Frames {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//switch to frame by index - priority 3
		//driver.switchTo().frame(0);
		
		//switch to frame by name or id - priority 2
		//driver.switchTo().frame("frame2");
		
		//switch to frame by webelement - priority 1
		WebElement elem = driver.findElement(By.xpath("//h5[contains(text(),'Inside Nested frame')]/following-sibling::iframe"));
		driver.switchTo().frame(elem);
		
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click(); 
		
		//switch out of the all frames
		driver.switchTo().defaultContent();
		
		//come out of only one frame
		driver.switchTo().parentFrame();
		
	}
	
}
