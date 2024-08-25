package Test_NG_Frame_Work_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import net.bytebuddy.asm.Advice.Enter;

public class FlipKart extends Base_Class{
	
	@Test
	public void flipKart() {
//		WebDriverManager.chromedriver().setup();		
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='✕']")).click();
		WebElement searchF = driver.findElement(By.xpath("//input[@type='text']"));
		searchF.sendKeys("Jeans");
		searchF.sendKeys(Keys.ENTER);
    
	}
}
