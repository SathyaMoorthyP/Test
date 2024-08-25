import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LearnMouseOver {
	
	public WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		WebElement jean = driver.findElement(By.xpath("//a[text()='Jeans']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men)
		.moveToElement(jean)
		.click()
		.perform();
		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		
//		String pageSource = driver.getPageSource();
//		System.err.println(pageSource);
		
	}

}
