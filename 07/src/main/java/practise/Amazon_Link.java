package practise;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Link {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("IPhone", Keys.ENTER);
		List<WebElement> allMobileElements = driver.findElements(By.xpath("//*[@class='a-price-whole']"));
		
		List<Integer> priceList = new ArrayList<Integer>();
		
		for (WebElement allMobileElement : allMobileElements) {
			String text = allMobileElement.getText().replace(",", "");
			System.out.println(text);
			int price = Integer.parseInt(text);
			priceList.add(price);
		}
		
		Collections.sort(priceList);
		System.out.println(priceList);
	}

}
