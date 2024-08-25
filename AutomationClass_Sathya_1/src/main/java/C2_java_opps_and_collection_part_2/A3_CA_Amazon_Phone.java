package C2_java_opps_and_collection_part_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3_CA_Amazon_Phone {
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phone", Keys.ENTER);
		List<WebElement> allMobileElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> priceList = new ArrayList<Integer>(); 
		
		for (WebElement eachMobileElement : allMobileElements) {
			System.out.println(eachMobileElement.getText());
			String text = eachMobileElement.getText().replace(",",""); //.replace("₹", "") 
			int price = Integer.parseInt(text);
			priceList.add(price);
		}
		
		Collections.sort(priceList);
		System.out.println("Least price is " + priceList.get(0)); 
	}
}
