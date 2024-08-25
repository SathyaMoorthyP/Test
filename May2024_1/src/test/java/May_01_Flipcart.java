import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.print.attribute.standard.Chromaticity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class May_01_Flipcart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Oneplus12", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='OnePlus 12 (Flowy Emerald, 512 GB)']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(newWindow.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("600091");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		driver.findElement(By.xpath("//span[ contains(text(),'Items to Cart')]")).click();

	}

}
