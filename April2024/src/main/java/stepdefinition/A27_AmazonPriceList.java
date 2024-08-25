package stepdefinition;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A27_AmazonPriceList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phone"+ Keys.ENTER);
		List<WebElement> allPriceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> priceList = new ArrayList<Integer>();
		
		for (int i = 0; i < allPriceList.size(); i++) {
			WebElement webElement = allPriceList.get(i);
			String text = webElement.getText().replace(",", "");
			System.out.println(text);
			int price = Integer.parseInt(text);
			priceList.add(price);
		}
		Collections.sort(priceList);
		System.out.println(priceList);
		System.out.println("Least value is" + priceList.get(0));
		driver.close();	
	}
}
