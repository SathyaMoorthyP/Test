package Test_NG_Framework_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class B2_Login_MainClass extends B1_Login_BaseClass {
	
	@Test(dataProvider = "getData")
	public void mainmethod(String cName, String fName, String lName) {
				driver.findElement(By.className("decorativeSubmit")).click();		
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
				driver.findElement(By.name("submitButton")).click();
			
}
	@DataProvider(name="getData")
	public String[][] setData() {
		String [] [] data = new String[2][3];
		data [0][0] = "Google";
		data [0][1] = "Narayanan";
		data [0][2] = "D";
		
		data [1][0] = "Microsoft";
		data [1][1] = "Sathya";
		data [1][2] = "P";
		
		return data;
	}
}