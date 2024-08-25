package jan30_2024_erail_webtable;

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

public class E_rail {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement fromTo = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromTo.clear();
		fromTo.sendKeys("MAS");
		Thread.sleep(10);
		fromTo.sendKeys(Keys.ENTER);
		
		WebElement toFrom = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		toFrom.clear();
		toFrom.sendKeys("CBE");
		Thread.sleep(10);
		toFrom.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]/a"));
		
//		int ssize = findElements.size();
//		List<WebElement> findElementss = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]/a"));
//		int size1 = findElementss.size();
				
//		for (int i = 1; i < ssize; i++) {
//			WebElement findElements2 = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td["+i+"]"));
//		String text = findElements2.getText();
//		System.out.println(text);
//		}
		
		List<String> trainNames = new ArrayList<String>();
		for (WebElement trainele : findElements) {
			//String text1 = trainele.getText();
			trainNames.add(trainele.getText());
		}
		
		Set<String> trainNames2 = new HashSet<String>(trainNames);
		
		if(trainNames.size() == trainNames2.size()) {
			System.out.println("No Duplicates");
		}
		else {
			System.out.println("There is an Duplicate");
		}
	}

}
