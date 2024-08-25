package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class CreateLead {

	
	public WebDriver driver;
	
	@Given("Launch the Browser")
	public void launchBrowser(){
		driver = new ChromeDriver();
	}
	
	@And("Enter the URL")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Then("Enter username credentials as (.*)$")
	public void enterUserName(String uName) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
	}
	
	@Then("Enter password details as (.*)$")
	public void enterPassword(String pWord) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pWord);
	}

	@Then("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@And("Verify HomePage")
	public void verifyHomePage() {
		String text = driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).getText();
		if(text.contains("CRM/SFA")) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not Verified");
		}
	}
}
