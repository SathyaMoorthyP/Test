package jan24_2024;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Jan21_2024.PrintOddNumbers;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class LearnWebTable extends PrintOddNumbers {

	int a = 10;
	static String name = "Test";

	public void methodA() {
		int a = 20;
		int b = 5;
		System.out.println(a + b);
	}

	public static void methodB() {
		int a = 7;
		String name = "India";
		System.out.println(name);
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr[1]/td[1]")).getText();
		System.out.println(text);
		
		List<WebElement> set1 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr/td[1]"));
		int size = set1.size();
		List<WebElement> set2 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr[1]/td"));
		int size2 = set2.size();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size2; j++) {
			WebElement findElement = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr["+i+"]/td["+j+"]"));
			String text2 = findElement.getText();
			System.out.println(text2);
			}
		}
//		 WebDriver driver = new ChromeDriver(); 
//		 driver.get("https://leafground.com/table.xhtml"); 
//		 driver.manage().window().maximize(); 
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
//		 String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tr[1]/td[1]")).getText(); 
//		 System.out.println(text); 
//
//		 List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tr/td[1]"));
//		 int size = findElements.size();
//		 
//		 List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tr[1]/td"));
//		 int size2 = findElements2.size();
//		 
//		 for (int i = 1; i <= size; i++) {
//			 for (int j = 1; j <= size2; j++) {			
//			WebElement findElement = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tr["+i+"]/td["+j+"]"));
//			String text2 = findElement.getText();
//			System.out.println(text2);
//		}
//	}
		 
//		 List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table[@role='grid']//tr/td[1]"));
//		 for (WebElement webElement : findElements) {
//			System.err.println(webElement.getText());
//		}
	}
}
