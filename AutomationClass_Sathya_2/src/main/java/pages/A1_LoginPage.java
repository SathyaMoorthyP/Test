package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.baseclass;

public class A1_LoginPage extends baseclass{
	
	public A1_LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public A1_LoginPage enterUserName(String uName) {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(uName);
		//return new A1_LoginPage();
		return this;
	}
	
	public A1_LoginPage enterPassword(String pWord) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pWord);
		//return new A1_LoginPage();
		return this;
	}
	
	public A2_HomePage clickLogin() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new A2_HomePage(driver);
	}
}
