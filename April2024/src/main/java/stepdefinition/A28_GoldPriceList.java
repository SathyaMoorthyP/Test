package stepdefinition;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A28_GoldPriceList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Gold Price In Chennai Today", Keys.ENTER);
		driver.findElement(By.xpath("//cite[text()='https://www.livechennai.com']")).click();
//		List<WebElement> allPrice = driver.findElements(By.xpath("//table[contains(@class,'striped gold-rates')]//tbody/tr/td[4]"));
	//	List<WebElement> allDate = driver.findElements(By.xpath("//table[contains(@class,'striped gold-rates')]//tbody/tr/td[1]"));
		
		
		
			List<WebElement> size2 = driver.findElements(By.xpath("//table[contains(@class,'striped gold-rates')]//tbody/tr[1]/td"));
			int one = size2.size();
			List<WebElement> size3 = driver.findElements(By.xpath("//table[contains(@class,'striped gold-rates')]//tbody/tr/td[1]"));
			int two = size3.size();
			System.out.println(two);
			System.out.println(one);
			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= 5; j++) {
					WebElement findElement = driver.findElement(By.xpath("//table[contains(@class,'striped gold-rates')]//tbody/tr["+i+"]/td["+j+"]"));
					String text = findElement.getText();
					System.out.println(text);
				}
			}	
//		
//		Map<String, Integer> all = new HashMap<String, Integer>();
//		
//		//List<Integer> price = new ArrayList<Integer>();
//		
//		for (int i = 0; i < allPrice.size(); i++) {
//			
//				WebElement webElement = allPrice.get(i);
//				String text = webElement.getText().replace(",", "");
//				int pri = Integer.parseInt(text);
//				all.put(null, pri);
//				System.out.println(pri);
//		}
//		
//		for (int j = 0; j < allDate.size(); j++) {
//				WebElement webElement1 = allDate.get(j);
//				String date = webElement1.getText();		
//				all.put(date, null);
//				System.err.println(date);
//			}
//		
//		
//		//System.out.println("Least price for the Gold is : " + price.get(0));
//		System.out.println(all);
	}
}