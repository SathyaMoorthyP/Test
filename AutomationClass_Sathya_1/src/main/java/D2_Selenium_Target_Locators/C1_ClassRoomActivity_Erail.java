package D2_Selenium_Target_Locators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C1_ClassRoomActivity_Erail {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 WebElement fromStation = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		 fromStation.clear();
		 fromStation.sendKeys("MAS");
		 Thread.sleep(2000);
		 fromStation.sendKeys(Keys.ENTER); 
		 
		 WebElement toStattion = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		 toStattion.clear();
		 toStattion.sendKeys("CBE");
		 Thread.sleep(2000);
		 toStattion.sendKeys(Keys.ENTER); 
		 
		 driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		 
		 List<WebElement> trainElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]/a")); 
		 
		 List<String> trainNames = new ArrayList<String>(); 
		 for (WebElement trainElement : trainElements) {
			 trainNames.add(trainElement.getText());
		}
		 System.out.println(trainNames);
		Set<String> trains = new HashSet<String>(trainNames);
			if(trainNames.size() == trains.size()) {
				System.out.println("There is no Duplicates");
			}
			else {
				System.out.println("Duplicates are Present");
			}	
	}
}
