package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.baseclass;

public class A3_MyHomePage extends baseclass{

	public A3_MyHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public A4_MyLeadsPage clickLeads() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		return new A4_MyLeadsPage(driver);	
	}
}
