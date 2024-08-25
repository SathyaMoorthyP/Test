package feb14_2024;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//amazon class room activity on price list
public class amazon {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
//		WebElement ch = 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phone",Keys.ENTER);
		//ch.
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> price = new ArrayList<Integer>();
		
		for (WebElement eachMobileElement : priceList) {
			System.out.println(eachMobileElement.getText());
			String replace = eachMobileElement.getText().replace(",","");
			int pri = Integer.parseInt(replace);
			price.add(pri);
		}
		Collections.sort(price);
		System.err.println(price);
	}
}
