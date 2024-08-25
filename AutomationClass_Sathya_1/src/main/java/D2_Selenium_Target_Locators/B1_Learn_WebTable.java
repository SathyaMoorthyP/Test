package D2_Selenium_Target_Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B1_Learn_WebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml;jsessionid=node0dcfr9nqrnsteyolfwj01k2gc499697.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		
		//Example : 1
		//Grandparent to Grand child tag name
		WebElement first = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr[1]/td[1]"));
		String text = first.getText();
		System.err.println(text);
		
		//Example : 2
		for (int i = 1; i <= 10; i++) {
			WebElement text1 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr[" +i+ "]/td[1]"));
			String text2 = text1.getText();
		System.out.println(text2);
		}

		//Example : 3
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr[\" +i+ \"]/td[1]"));
		for (WebElement element : elements) {
			String text3 = element.getText();
			System.err.println(text3);
		}
		
		//Example : 4 
		List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr[1]/td"));
		int size = elements2.size();
		for (int i = 1; i <= size; i++) {
			WebElement findElement = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr[1]/td["+i+"]"));
			String text3 = findElement.getText();
			System.out.println(text3);
		}
		
		
		//Example : 5 to get all the row details
		List<WebElement> elements3 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr/td[1]"));
		int size1 = elements3.size();
		for (int i = 1; i <= size1; i++) {
			for (int j = 1; j <= 6; j++) {
				WebElement findElement = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr[" +i+"]/td["+j+"]"));
				String text3 = findElement.getText();
				System.err.println(text3);				
			}
		}
		
		
		//Example : 6 to get all the row details, by size(i, j)
				List<WebElement> elements4 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr/td[1]"));
				int size2 = elements4.size();
				List<WebElement> elements5 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr[1]/td"));
				int size3 = elements5.size();
				for (int i = 1; i <= size2; i++) {
					for (int j = 1; j <= size3; j++) {
						WebElement findElement = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tbody/tr[" +i+ "]/td[" +j+ "]"));
						String text4 = findElement.getText();
						System.out.println(text4);				
					}
				}
    }
}
