package D1_Selenium_Action_Class_And_Webtable;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_LearnAlertes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node0h6mlhv02bc0q1dby12ebw3voy464845.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		
		//how to get the text from the alert
		String text = alert.getText();
		System.out.println(text);
		
		//how to accept
		alert.accept();
		
		
		 
	}

}
