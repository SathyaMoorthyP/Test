package SeleniumTrargetLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//myntra website, mouse over, click

public class AdvancedUserInteraction_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement men = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[@href='/shop/men']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(men).perform();
		
	}

}
