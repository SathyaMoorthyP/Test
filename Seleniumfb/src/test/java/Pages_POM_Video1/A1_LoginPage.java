package Pages_POM_Video1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom_video1_baseclass.BaseClass;

public class A1_LoginPage extends BaseClass{
	
	
	public A1_LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public A1_LoginPage enterUname() {
		driver.findElement(By.xpath("//*[text()='Username']/following-sibling::*")).sendKeys("Democsr");
		return this;
	}
	
	public A1_LoginPage enterPassword() {
		driver.findElement(By.xpath("//*[text()='Password']/following-sibling::*")).sendKeys("crmsfa");
		return this;
	}
	
	public A2_HomePage clickLogin () {
		driver.findElement(By.xpath("//*[text()='Password']/parent::*/following-sibling::p/input")).click();
		return new A2_HomePage(driver);
	}
}
