package Test_NG_Frame_Work_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra extends Base_Class{
	
	@Test
	public void myntra() {
//		WebDriverManager.chromedriver().setup();		
//		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
//		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.sendKeys("Jeans");
		search.sendKeys(Keys.ENTER);
    
	}
}
