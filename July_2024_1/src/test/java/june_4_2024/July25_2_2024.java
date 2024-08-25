package june_4_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class July25_2_2024 {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.leafground.com/select.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement allOptions = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
			Select sa = new Select(allOptions);
			List<WebElement> options = sa.getOptions();
			for (int i = 0; i < options.size(); i++) {
					 WebElement webElement = options.get(i);
					 System.out.println(webElement.getText());
			}	}	

}
