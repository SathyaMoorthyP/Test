package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A23_DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement eleTool = driver.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']/parent::div//select"));
		Select dropdown = new Select(eleTool);
		//dropdown.selectByIndex(1);
		dropdown.selectByVisibleText("Puppeteer");
		//dropdown.selectByValue(Puppeter);
		
	}
}
