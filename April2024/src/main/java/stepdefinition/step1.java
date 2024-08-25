package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class step1 extends StepBaseclass {
	
	@Given("Launch the Chrome Browser")
	public void launchChromeBrowser() {
		driver = new ChromeDriver();
	}
	
	@Then("Get the URL and Maximize the webpage")
	public void urlAndMaximise() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@And("Enter the Username as (.*)$")
	public void enterUserName(String uName) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
	}
	
	@And("Enter the Password as (.*)$")
	public void enterPassword(String pWord) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pWord);
	}
	
	@And("Click on the Login button")
	public void clickLoginButton() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@Then("Verify Homepage is Displayed")
	public void verifyHomePageIsDisplayed() {
		boolean displayed = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).isDisplayed();
		System.out.println(displayed);
		if(displayed) {
			System.out.println("Home Page Is Verified");
		}
		else {
			System.out.println("Not displayed");
		}
	}
	
	@And("Verify ErrorMessage is Displayed")
	public void verifyErrorMessage() {
		String text = driver.findElement(By.xpath("//div[@id='errorDiv']")).getText();
		System.out.println(text);
	}
	

	

}
