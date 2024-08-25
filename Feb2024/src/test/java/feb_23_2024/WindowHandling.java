package feb_23_2024;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//ul[@class='layout-menu']//li[@class='ui-menuitem-submenu']/following-sibling::li//i[contains(@class,'globe layout')]")).click();
		driver.findElement(By.xpath("//span[text()='Window']")).click();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String onewindowHandle = driver.getWindowHandle();
		System.out.println(onewindowHandle);
		Set<String> twowindowHandles = driver.getWindowHandles(); 
//		List<String> obj = new ArrayList<String>(twowindowHandles);
//		String string = obj.get(0);
//		System.out.println(string);

		System.out.println(twowindowHandles);
		
		for (String twoWindowhandle : twowindowHandles) {
			if (twoWindowhandle.equals(onewindowHandle)) {
				System.out.println("Both windows are equal");
			}else
			{
				driver.switchTo().window(twoWindowhandle);
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='layout-menu']//li[@class='ui-menuitem-submenu']/following-sibling::li//i[contains(@class,'globe layout')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(onewindowHandle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Open']")).click();
	}
}
