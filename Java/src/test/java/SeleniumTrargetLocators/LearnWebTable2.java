package SeleniumTrargetLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.FieldResolver.ForElementMatcher;

public class LearnWebTable2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml;jsessionid=node01lafsdfora6s3h39f21imh0lm418801.node0#");
		driver.manage().window().maximize();
		
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']/tbody/tr/td[1]"));
		int size = eles.size();
 		
		for (int i = 1; i <= size; i++) {
			String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']/tbody/tr[" +i+ "]/td[1]")).getText();
			System.out.println(text);
		}
	
	}
		
}
 