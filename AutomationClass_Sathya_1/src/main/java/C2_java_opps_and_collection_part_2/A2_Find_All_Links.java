package C2_java_opps_and_collection_part_2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class A2_Find_All_Links {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='grid formgrid']/div/a"));
		
		for (int i = 0; i < allLinks.size(); i++) {
			WebElement webElement = allLinks.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
	}

}
