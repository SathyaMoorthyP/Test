package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class baseclass {
	
	public WebDriver driver;
	public String fileName;
	
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("DemoSalesManager");
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("crmsfa");
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

	//(name = "fetchData")
	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException {
	return ReadExcel.readData(fileName);
	//return getData();
	}

}




