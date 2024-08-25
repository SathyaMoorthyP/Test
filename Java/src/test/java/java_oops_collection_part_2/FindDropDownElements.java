package java_oops_collection_part_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindDropDownElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/select.xhtml;jsessionid=node047rsbsi22o5ak2cpfrq9n3at361750.node0");
		
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.xpath("//select[contains(@style,'overflow-wrap')]"));
		
		Select select = new Select(dropDown);
		
		List<WebElement> options = select.getOptions();
		
		for (WebElement opt : options) {
			System.out.println(opt.getText());
			
		}
		
		//Select class -> to import ctrl+shift+O
		//Select select = new Select(dropDown);
		//List<WebElement> options = select.getOptions();
		
		//for (WebElement allOptions : options) {
			//System.out.println(allOptions.getText());
		}
		
	}


