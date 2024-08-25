package SeleniumTrargetLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.RawMatcher.ForElementMatchers;

public class LearnWebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/table.xhtml;jsessionid=node01lafsdfora6s3h39f21imh0lm418801.node0#");
		
		driver.manage().window().maximize();
		
		//xpath grandparent to grandchild //from table 
		String nn = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']/tbody/tr[1]/td[1]")).getText();
		System.out.println(nn);
		
		for (int i = 1; i <= 10; i++) {
				
			String nn1 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(nn1);
			}
	
	}
}	 
	

