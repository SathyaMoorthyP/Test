package Pages_POM_Video1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom_video1_baseclass.BaseClass;

public class A2_HomePage extends BaseClass {
	
	
	public A2_HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public A3_MyHomePage clickCRMSFA() {
		driver.findElement(By.xpath("//*[contains(text(),'CRM/SFA')]")).click();
		return new A3_MyHomePage(driver);
	}
}
 