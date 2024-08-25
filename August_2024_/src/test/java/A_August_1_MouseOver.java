import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_August_1_MouseOver {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(findElement).perform();
		WebElement findElement2 = driver.findElement(By.xpath("//a[contains(@href,'/men-jeans')]"));
		Actions builder2 = new Actions(driver);
		builder2.sendKeys("hellow").perform();
		builder2.moveToElement(findElement2).click().perform();
		
	}

}
