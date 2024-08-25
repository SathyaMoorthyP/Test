package march14;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameClassRoomActivity {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("__disable-notifications");
		options.addArguments("__incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//div[@id='iframewrapper']/iframe"));
		driver.switchTo().frame(element);
		WebElement ele2 = driver.findElement(By.xpath("//button[text()='Try it']"));
		ele2.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Sathya");
		alert.accept();
		String text = driver.findElement(By.xpath("//p[contains(text(),'Hello Sathya')]")).getText();
		if(text.contains("Sathya")) {
			System.out.println("Successfull");
		}
		else {
			System.out.println("Unsuccessful");
		}
	}
}
