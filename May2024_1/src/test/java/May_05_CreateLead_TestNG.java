import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class May_05_CreateLead_TestNG extends May_10_BaseClassForMay_05{
	
	@Test(dataProvider = "setData")
	public void CreateLeadTest(String cName, String fName, String lName) {
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//*[text()='Create Lead']/parent::li")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(cName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lName);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	}	
	@DataProvider()
	public String[][] setData() throws IOException {
//		String[] [] data = new String[2] [3];
//		data[0][0] = "SC";
//		data[0][1] = "Narayanan";
//		data[0][2] = "D";
//		data[1][0] = "CB";
//		data[1][1] = "Sathya";
//		data[1][2] = "P";
		
		String[][] readData = May_12_ReadExcel.readData();
		
		return readData;
	}
	} 