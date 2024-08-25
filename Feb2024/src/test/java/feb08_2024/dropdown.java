package feb08_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[text()='Element']/preceding-sibling::*[contains(@class,'layout-menuitem')]")).click();
		driver.findElement(By.xpath("//li[contains(@id,'dropdown')]")).click();
		WebElement clickDrop = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select select  = new Select(clickDrop);
		//select.selectByIndex(1);
		//select.selectByValue("Selenium");
		select.deselectByVisibleText("Selenium");
//		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
//		System.err.println(allSelectedOptions);
		
	}
}
