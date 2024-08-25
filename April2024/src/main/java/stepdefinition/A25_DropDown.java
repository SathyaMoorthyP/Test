package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A25_DropDown {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement tool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select tools = new Select(tool);
		List<WebElement> options = tools.getOptions();
//		for (WebElement option : options) {
//			String text = option.getText();
//			System.out.println(text);
//		}
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);	
		}
		driver.close();	
	}

}
