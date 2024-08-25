import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class July_23_RahulSheety {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sathya");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		String text = driver.findElement(By.xpath("//p[text()='* Incorrect username or password']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sathya");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sathya@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456789");
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Go')]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Sathya");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		
	}
}
