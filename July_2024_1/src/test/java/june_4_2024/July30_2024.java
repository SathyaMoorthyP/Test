package june_4_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class July30_2024 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml;jsessionid=node01vi0ndytm22chq1wzbb5cor0e5109697.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr[1]/td[1]")).getText();
		System.out.println(text);
		
		List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr/td[1]"));
		int rows = findElements2.size();
		System.out.println("The Number of Rows " + rows);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr[1]/td"));
		int column = findElements.size();
		System.out.println("The Number of Columns " +column);	

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= column; j++) {
					WebElement findElement = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr[" +i+ "]/td[" +j+ "]"));
					String text2 = findElement.getText();
					System.out.println(text2);
			}			
		}
	}

}
