package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class baseclass extends AbstractTestNGCucumberTests {
	
	private static final ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	//public static WebDriver driver; 
	public String fileName;
	public static Properties prop1; 
	
	//Encapsulation
	public void setDriver(WebDriver driver) {
		tldriver.set(driver);
	}
	
	public WebDriver getDriver() {
		return tldriver.get();
	}
	
	@BeforeMethod
	public void preCondition() throws IOException {

		//WebDriverManager.chromedriver().setup();
		//getDriver() = new ChromeDriver();
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		
		//Create an object for a Property class
		Properties prop = new Properties();
		//Create an object for FileInputStream class
		FileInputStream fis = new FileInputStream(new File("src/main/resources/config.properties"));		
		//Load the file
		prop.load(fis);
		//Read the data from the file
		String url = prop.getProperty("url");
		getDriver().get(url);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
//		//Create an object for a Property class
//		prop1 = new Properties();
//		//Read the data from the file
//		String lang = prop1.getProperty("lang");
//		//Create an object for FileInputStream class
//		FileInputStream fis1 = new FileInputStream(new File("src/main/resources/"+lang+".properties"));				
//		//Load the file
//		prop.load(fis1);
//		
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("DemoSalesManager");
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("crmsfa");
	}
	
	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}

	//(name = "fetchData")
	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException {
	return ReadExcel.readData(fileName);
	//return getData();
	}
}
