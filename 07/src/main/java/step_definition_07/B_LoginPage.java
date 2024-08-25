package step_definition_07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

public class B_LoginPage extends A_Base_Class {

	@Given("Launch the Browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
	}
	
	@And("Load the URL and Maximize")
	public void loadUrlMax() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@And("Enter username as (.*)$")
	public void enterUserName(String user) {
		WebElement uName = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
		uName.sendKeys(user);
	}
	
	@And("Enter password as (.*)$")
	public void enterPassword(String pass) {
		WebElement pWord = driver.findElement(By.xpath("//*[text()='Password']/following-sibling::*"));
		pWord.sendKeys(pass);
	}
	
	@And("Click on Login")
	public void clickLogin() {
		driver.findElement(By.xpath("//*[text()='Password']/following::input[@type='submit']")).click();
	}

	@Then("verify error message is displayed")
	public void verifyErrorMessage() {
		String text1 = driver.findElement(By.xpath("//div[@id='errorDiv']/p[contains(text(),'Password incorrect')]")).getText();
		System.out.println(text1);
	}
	
	@Then("MyHome message is displayed")
	public void verifyMyHomePageDisplayed() {
		String text2 = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).getText();
		System.out.println(text2);
	}
	
}
