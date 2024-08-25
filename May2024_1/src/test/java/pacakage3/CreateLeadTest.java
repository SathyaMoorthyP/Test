package pacakage3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadTest extends BaseClass{

	@Test(dataProvider = "checkData")
	public void createLead(String cName, String fName, String lName) throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//*[text()='Company Name']/../following-sibling::*/input[@name='companyName']")).sendKeys(cName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lName);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	}
	
	@DataProvider
	public String[][] checkData() throws IOException {
		String[][] checkDat = ReadExcelP3.checkDat();
		return checkDat;
		
	}
}
