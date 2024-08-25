package Test_NG_Framework_2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class E2_Login_MainClass {	
	
	public String fileName;
	
	@BeforeClass
	public void method1() {
		fileName = "CreateLead";
	}
	
	public WebDriver driver;
	@Test(dataProvider = "Fetch Data")
	public void mainmethod(String cName, String fName, String lName, String url, String username, String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys(username);				
		driver.findElement(By.id("password")).sendKeys(password);
				driver.findElement(By.className("decorativeSubmit")).click();		
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
				driver.findElement(By.name("submitButton")).click();									
	}
	
	@DataProvider(name = "Fetch Data")
	public String[][] setData() throws IOException {
		String[][] data = E_GetDataFromExcel2.readData(fileName);
		return data;
	}
} 