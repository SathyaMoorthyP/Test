package SeleniumTrargetLocators;

import java.time.Duration;

import org.apache.commons.lang3.time.DurationUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//select multile items , continuously ????????????????????????????????????????????????????

public class AdvancedUserInteraction_5_SelectMultile {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		WebElement framess = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(framess);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 6']/following-sibling::li"));

		Actions builder = new Actions(driver);
		//builder.clickAndHold(item1).moveToElement(item7).release().build().perform();
		//builder.dragAndDrop(item1, item7).perform();
		builder.keyDown(Keys.CONTROL)
		.click(item1)
		.click(item3)
		.click(item7)
		.keyUp(Keys.CONTROL)
		.perform();
	}

}
