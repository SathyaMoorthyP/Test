package s_stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class S1_Login extends S_BaseClass{
	
	
	@Given("Launch the Browser")
	public void launchBrowser() {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
	}
	
	@And("Load the URL")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@And("Enter the UserName {string}")
	public void enterUserName(String uName) {
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys(uName);
	}
	
	@And("Enter the Password {string}")
	public void enterPassword(String password) {
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(password);
	}
	
	@And("Click on Login")
	public void click() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@Then("Verify Home Page is Displayed")
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed){
			System.out.println("Home Page is Displayed");
		}
		else {
			System.out.println("Home Page is not displayed");
		}
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

}
