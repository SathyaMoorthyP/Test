package feb_24_2024;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//li[@id='menuform:j_idt39']/a")).click();
		driver.findElement(By.xpath("//span[text()='Window']")).click();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		String windowlist = driver.getWindowHandle();
		System.out.println(windowlist);
		
		Set<String> windowlists = driver.getWindowHandles();
		System.out.println(windowlists);
		
		for (String gets : windowlists) {
			if(gets.equals(windowlist)) {
				System.out.println("HI");
			}
			else {
				driver.switchTo().window(gets);
			}
		}
		String title = driver.getTitle();
		System.out.println(title);
	}
}
