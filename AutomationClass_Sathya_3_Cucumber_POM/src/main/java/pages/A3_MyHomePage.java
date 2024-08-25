package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.baseclass;

public class A3_MyHomePage extends baseclass{

//	public A3_MyHomePage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public A4_MyLeadsPage clickLeads() {
		////a[text()='Leads']
		getDriver().findElement(By.xpath("//a[text()='prop1.getProperty(link_leads)'")).click();
		return new A4_MyLeadsPage();	
	}
}
