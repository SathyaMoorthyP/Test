package B1_selenium_basics_1;
// 2nd

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B1_LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//setup the browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://www.leafground.com/select.xhtml");
		
		//Maximize the browser window
		driver.manage().window().maximize();

		//Find Tag Name
		//WebElement eleTool = driver.findElement(By.className("ui-selectonemenu"));
		WebElement eleTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		
		//create object for Select class
		Select dropdown = new Select(eleTool);
		
		//choose option 1.Index 2.visibleText 3.vakueAttribute
//		dropdown.selectByIndex(1);
//		dropdown.selectByVisibleText("Puppeteer");
		
		
		//To get the value selected in the dropDown
		WebElement ele = dropdown.getFirstSelectedOption();
	    System.out.println(ele.getText());
		
	    List<WebElement> options = dropdown.getOptions();
	    
	    for (WebElement option : options) {
			String text = option.getText();
			System.out.println(text);
		}
	    
	    
//	    for (int i = 0; i < options.size(); i++) {
//			WebElement element = options.get(i);
//			String text2 = element.getText();
//			System.out.println(text2);
//		}
	    
//		}
	}

}
