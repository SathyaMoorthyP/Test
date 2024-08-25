package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import runner.Baseclass;

public class CreateLead extends Baseclass {
	
	@Given("Launch the Chrome Browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
	}

	@Then("Enter URL and Maximize the Webpage")
	public void enterURLandMaximize() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	}
	
	@Then("Enter the UserName (.*)$")
	public void enterUserName(String uName) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
	}
	
	@Then("Enter the Password (.*)$")
	public void enterPassword(String pWord) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pWord);
	}
	
	@And("Click on the Login button")
	public void clickLogin() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@And("Verify the Home Page is Displayed")
	public void verifyHomePage() {
		String text2 = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).getText();
		System.out.println(text2);
		if(text2.contains("CRM/SFA")) {
			System.out.println("Successfull");
		}
		else {
			System.out.println("Not Successfull");
		}
	}
}
