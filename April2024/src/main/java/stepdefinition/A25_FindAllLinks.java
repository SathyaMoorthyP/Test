package stepdefinition;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A25_FindAllLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='grid formgrid']/div"));
//		for (int i = 0; i < allLinks.size(); i++) {
//			WebElement links = allLinks.get(i);
//			String text = links.getText();
//			System.out.println(text);
//		}
		for (WebElement link : allLinks) {
			String text = link.getText();
			System.out.println(text);	
		}
		driver.close();
		}	
	}