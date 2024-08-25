package AutomationFB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestLeaf {
	
	
	public static void main(String[] args) throws InterruptedException {
		

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://leafground.com/");
	
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
	
	driver.findElement(By.id("menuform:j_idt40")).click();
	
//driver.findElement(By.xpath("//span[text()='Element']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(03));	
	
	driver.findElement(By.xpath("//span[text()='Text Box']")).click();
	
	driver.findElement(By.name("j_idt88:name")).sendKeys("Narayanan");
	
	driver.findElement(By.name("j_idt88:j_idt91")).sendKeys(" INDIA");
	
	WebElement dis = driver.findElement(By.id("j_idt88:j_idt93"));
	System.out.println(dis.isDisplayed());
	System.out.println(dis.isEnabled());
	System.out.println(dis.isSelected());
	
	
	driver.findElement(By.id("j_idt88:j_idt95")).clear();
	
	WebElement ret = driver.findElement(By.id("j_idt88:j_idt97"));
	System.out.println(ret.getAttribute("Value"));
	
    WebElement sen = driver.findElement(By.id("j_idt88:j_idt99"));
    sen.sendKeys("karatenarayanan93@gmail.com" +Keys.TAB);
	
   driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("My Name is Sathya");
   
   driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
   
   WebElement err = driver.findElement(By.className("ui-message-error-detail"));
   
   String mess = err.getText();
		System.out.println(mess);

	WebElement test = driver.findElement(By.id("j_idt106:j_idt113"));
	System.out.println(test.getText());
	Thread.sleep(2000);
	test.click();
	String box = test.getText();
	System.out.println(box + "Box is Empty");
	
	}
}
