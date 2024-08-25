package AutomationFB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://amazon.in/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    driver.findElement(By.xpath("//span[text()='See more']")).click();
	    driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='OnePlus Nord CE 3 Lite 5G (Pastel Lime, 8GB RAM, 128GB Storage)']")).click();
	    
		
	
		

	}
}
