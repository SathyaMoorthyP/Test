package feb_24_2024;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling_2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//li[@id='menuform:j_idt38']/following-sibling::li/a)[1]")).click();
		driver.findElement(By.xpath("//span[text()='Window']")).click();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		String one = driver.getWindowHandle();
		System.out.println(one);
		
		Set<String> two = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(two);
		driver.switchTo().window(li.get(1));
		
		String title = driver.getTitle();
		System.out.println(title);
	
	
	}
}
