package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.baseclass;

public class A2_HomePage extends baseclass{
	
//	public A2_HomePage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public A3_MyHomePage clickCRMSFA() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new A3_MyHomePage();
	}

}
