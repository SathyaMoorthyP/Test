package june_4_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class July25_2024 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='grid formgrid']"));
		for (int i = 0; i < allLinks.size(); i++) {
					WebElement webElement = allLinks.get(i);
								String text = webElement.getText();
								System.out.println(text);
		}
	}
}
