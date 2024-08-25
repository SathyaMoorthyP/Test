package SeleniumTrargetLocators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTableTargetLocators {
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		WebElement trainElement = driver.findElement(By.id("txtStationFrom"));
		trainElement.clear();
		trainElement.sendKeys("MAS");
		trainElement.sendKeys(Keys.ENTER);
		
		WebElement trainEle = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		trainEle.clear();
		trainEle.sendKeys("CBE");
		trainEle.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		List<WebElement> traineles = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]/a"));
		
		List<String> trainNames = new ArrayList<String>();
		
		
		
		for (WebElement trainele : traineles) {
			trainNames.add(trainele.getText());
			
		}
		System.out.println(trainNames);
	
		Set<String> set = new HashSet<String>(trainNames);
		if (trainNames.size()==set.size()) {
			System.out.println("NO duplicate");
		}else
			System.out.println("Duplicate");
		
	}

}
