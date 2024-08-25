import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assisgmnet_Web_Table {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/table.xhtml;jsessionid=node01l0x6q58ir9sl1fkq9oxwahyrc423646.node0");
		
		List<WebElement> element = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr[8]/td[2]"));
		for (WebElement ele : element) {
						System.out.println(ele.getText());
		}
	
	}

}
