import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_August_1_Erail {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fromStattion = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromStattion.clear();
		fromStattion.sendKeys("MAS", Keys.ENTER);
		
		WebElement toStation = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		toStation.clear();
		toStation.sendKeys("Coimbatore Jn", Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		List<WebElement> allTrains = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody/tr/td[2]"));
		
		List<String> all = new ArrayList<String>();
		for (WebElement train : allTrains) {
			all.add(train.getText());
		}
		int list = all.size();
		System.out.println(list);
		
		Set<String> noDup = new HashSet<String>(all);
		int size = noDup.size();
		System.out.println(size);
		
		if(all == noDup) {
			System.out.println("No Duplicate");
		}
		else {
			System.out.println("Duplicate");
		}

	}

}
