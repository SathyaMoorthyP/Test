package june_4_2024;

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

import net.bytebuddy.asm.Advice.Enter;

public class July31_2024 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement fromStation = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromStation.clear();
		fromStation.sendKeys("Mas");
		//Thread.sleep(200);
		fromStation.sendKeys(Keys.ENTER);
		
		WebElement toStation = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
		toStation.clear();
		toStation.sendKeys("Coimbatore Jn");
		//Thread.sleep(200);
		toStation.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		List<WebElement> allTrains = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]/a"));
		
		List<String> train = new ArrayList<String>();
		for (WebElement trainEle : allTrains) {
					train.add(trainEle.getText());
		}
		
		Set<String> trains = new HashSet<String>(train);
		
		if(trains.size()== train.size()) {
			System.out.println("No Duplicate");
		}		
		else {
			System.out.println("Duplicate");
		}
	}
}