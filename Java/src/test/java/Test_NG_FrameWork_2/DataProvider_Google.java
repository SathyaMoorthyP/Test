package Test_NG_FrameWork_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Google {

	
	public WebDriver driver;
	@Test (dataProvider = "featch Data")
	public void launchGoogle(String url, String value) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		WebElement searchField = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		searchField.sendKeys(value);
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().back();
		driver.close();
	}
	
	@DataProvider(name="featch Data")
	public Object setData() {
		String[][] data = new String[6] [2];
		
		data[0][0] = "https://www.google.co.in/";
		data[0][1]= "1";
		
		data[1][0] = "https://www.google.co.in/";
		data[1][1]="2";
		
		data[2][0] = "https://www.google.co.in/";
		data[2][1]="3";
		
		data[3][0] = "https://www.google.co.in/";
		data[3][1]="4";
		
		data[4][0] = "https://www.google.co.in/";
		data[4][1]="5";
		
		data[5][0] = "https://www.google.co.in/";
		data[5][1]="6";
		
		return data;
	}
}
