package AutomationFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicsSyntax {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	driver.navigate().to("https://www.facebook.com");
	
	driver.manage().window().maximize();
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.navigate().forward();
	String title = driver.getTitle();
	System.out.println(title);
String geturl = driver.getCurrentUrl();
System.out.println(geturl);
String pasource = driver.getPageSource();
System.out.println(pasource);

	}
	
}
