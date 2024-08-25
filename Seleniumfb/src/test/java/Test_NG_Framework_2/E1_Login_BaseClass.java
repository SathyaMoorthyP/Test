package Test_NG_Framework_2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E1_Login_BaseClass {

		public WebDriver driver;
		
		//@Parameters({"url","username","password"})
		@BeforeMethod
		public void preCondition(String url, String username, String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys(username);				
		driver.findElement(By.id("password")).sendKeys(password);
		}
			
		@AfterMethod
		public void postCondition() {
		//		driver.close();	
		}
		
		@DataProvider(name="getData")
		public String[][] setData() throws IOException {
//			String [] [] data = new String[2][3];
//			data [0][0] = "Google";
//			data [0][1] = "Narayanan";
//			data [0][2] = "D";
//			data [1][0] = "Microsoft";
//			data [1][1] = "Sathya";
//			data [1][2] = "P";
		
		String[][] data = E_GetDataFromExcel2.readData(null);	
		return data; 
		}
}


