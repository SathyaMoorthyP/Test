package java_oops_collection_part_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_Activity_Flipkart_PriceList {
	
	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/?ef_id=4275d081028b1888f7d8b43d98f5cc2b:G:s&s_kwcid=AL!739!10!76484920232330!76485137405439&semcmpid=sem_F1167BY7_Brand_adcenter");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("mobile",Keys.ENTER);
		
		List<WebElement> allmobileelements = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));

		List<Integer> pricelist = new ArrayList<Integer>();
		
		for (WebElement eachmobileelements : allmobileelements) {
			
			//eachmobileelements.getText();
			
			String pie = eachmobileelements.getText().replace(",","").replace("₹", "");
			
			int pie2 = Integer.parseInt(pie);
			
			pricelist.add(pie2);
		}
		
		System.out.println(pricelist);
		}
	
		}
		
		
	
