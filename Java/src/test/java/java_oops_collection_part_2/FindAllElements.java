package java_oops_collection_part_2;

//import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllElements {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/link.xhtml;jsessionid=node019jg068o43vk4q7oi4dd9wpju352938.node0");
		
		driver.manage().window().maximize();
		
		//Grandparent to Grandchild xpath , how he found ? also why should we do ctrl 2 l
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='card']//a"));
		
		//why length to size with () ? how args.length; to allLinks.size() 
		
//		for (WebElement check : allLinks) {
//			
//			String text = check.getText();
//			
//		}
		for (int i = 0; i < allLinks.size(); i++) {
		
		// why do ctrl , 2 - L
			
		WebElement linkk = allLinks.get(i);
				
		String text = linkk.getText(); 
			
		System.out.println(text);
		
		}
		}
	}
