package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.baseclass;
import io.cucumber.java.en.Given;

public class A1_LoginPage extends baseclass{
	
//	public A1_LoginPage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	@Given("Enter the username as (.*)$")
	public A1_LoginPage enterUserName(String uName) {
		getDriver().findElement(By.xpath("//*[@id='username']")).sendKeys(uName);
		//return new A1_LoginPage();
		return this;
	}
	
	@Given("Enter the password (.*)$")
	public A1_LoginPage enterPassword(String pWord) {
		getDriver().findElement(By.xpath("//*[@id='password']")).sendKeys(pWord);
		//return new A1_LoginPage();
		return this;
	}

	@Given("Click on the Login button")
	public A2_HomePage clickLogin() {
		getDriver().findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new A2_HomePage();
	}
}
