package java_oops_collection_part_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_Activity_Amazon_PriceList {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("washing machine",Keys.ENTER);
		
		List<WebElement> allwashingmachineelements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> pricelist = new ArrayList<Integer>();
		
		for (WebElement specificeashingmachineelements : allwashingmachineelements) {
			
			specificeashingmachineelements.getText();
			
			String tex1 = specificeashingmachineelements.getText().replace(",", "").replace("₹","");
			
			int price = Integer.parseInt(tex1);
			
			pricelist.add(price);
			
		}

		Collections.sort(pricelist);
		
		System.out.println(pricelist);
		
		System.out.println();
		
		System.out.println("Least price :" + pricelist.get(0) );
		
		Collections.reverse(pricelist);
		
		System.out.println(pricelist);
		
		System.out.println();
		
		System.out.println("Highest price :" + pricelist.get(0) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Integer> pricelist = new ArrayList<Integer>();
//		
//		for (WebElement eachmobileelements : allmobileelements) {
//			
//			System.out.println(eachmobileelements.getText());
//			
//			String te = (eachmobileelements.getText().replace(",","").replace("₹",""));
//			
//			int price = Integer.parseInt(te);
//			
//			pricelist.add(price);
//			
//		}
//		
//		Collections.sort(pricelist);
//		
//		System.out.println("Least Price :" + pricelist.get(0));
//		
}
		}
		
		
//		List<Integer> pricelist = new ArrayList<Integer>();
//		
//		for (WebElement eachmobileelement : allmobileelements) {
//			
//			System.out.println(eachmobileelement.getText());
//			
//			String text = eachmobileelement.getText().replace(",", "").replace("₹","");
//			
//			int price = Integer.parseInt(text);
//			
//			pricelist.add(price);
//		}
//		
//		Collections.sort(pricelist);
//		
//		System.out.println("Least price :" + pricelist.indexOf(0) );
//		
		

//		List <Integer> pricelist = new ArrayList <Integer>();
//		
//		for (WebElement eachmobileelements : allmobileelements) {
//			
//			System.out.println(eachmobileelements.getText());
//		
//			String text = eachmobileelements.getText().replace(",", "").replace("₹", "");
//			
//			int price = Integer.parseInt(text);
//			
//			pricelist.add(price);
//			
//		}
//		
//		Collections.sort(pricelist);
//		
//		System.out.println("Least price:" + pricelist.get(0));
//		
//		
//		List<Integer> pricelist = new ArrayList<Integer>();
//		for (WebElement eachmobileelements : allmobileelements) {
//			System.out.println(eachmobileelements.getText());
//			String text1 = eachmobileelements.getText().replace(",","").replace("₹","");
//			int price = Integer.parseInt(text1);
//		//	int price = Integer.parseInt(text);
//			pricelist.add(price);
//		}
//		Collections.sort(pricelist);
//		System.out.println("Least price:" + pricelist.get(0));

		
		
//		List<Integer> least = new ArrayList<Integer>();
//		for (WebElement listofprice1 : listofprice) {
//			String text = listofprice1.getText().replace(",", "");
////			System.out.println(text);
//			int intleaset = Integer.parseInt(text);
//			least.add(intleaset);
//		}
//				Collections.sort(least);
//			System.out.println(least);
//				System.out.println();
//				System.out.println();
//				System.err.println("Least value is "+ least.get(0));
//		
//		
		
		
		