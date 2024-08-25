package feb25_2024;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webhandling_irctc {
	
	public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();;
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowsID = new ArrayList<String>(windowHandles); 
		driver.switchTo().window(windowsID.get(1));
		String title = driver.getTitle();
		System.out.println(title);
	}
}
