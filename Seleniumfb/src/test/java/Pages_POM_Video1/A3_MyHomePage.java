package Pages_POM_Video1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom_video1_baseclass.BaseClass;

public class A3_MyHomePage extends BaseClass{
	
	public A3_MyHomePage(WebDriver driver) {
		this.driver = driver;
	}

	
	public A4_LeadPage clickCreateLead() {
		
		driver.findElement(By.xpath("//*[text()='Create Lead']/parent::li/*")).click();
		return new A4_LeadPage(driver);
	}
	
	public B1_MyLeadsPage clickLead() {
		
		driver.findElement(By.xpath("//*[text()='Leads']")).click();
		return new B1_MyLeadsPage();
	}

}
