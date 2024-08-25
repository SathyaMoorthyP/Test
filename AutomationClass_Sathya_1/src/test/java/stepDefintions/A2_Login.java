package stepDefintions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_Login extends A1_BaseClass {
	
	
//	@Given("Launch the chrome browser")
//	public void launchBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
//
//	@And("Load the URL and Maximize")
//	public void loadURL() {
//		driver.get("http://leaftaps.com/opentaps");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
	
	@And("Enter the username as (.*)$")
	public void enterUserName(String uName) {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(uName);
	}
	
	@And("Enter the password (.*)$")
	public void enterPassword(String passWord) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(passWord);
	}
	

	@When("Click on the Login button")
	public void clickLogin() {
		driver.findElement(By.xpath("//*[@value='Login']")).click();
	}
	
	@Then("Home page should be displayed")
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.xpath("//*[contains(text(),'CRM/SFA')]")).isDisplayed();
		if(displayed) { 
			System.out.println("Home Page Is Displayed");
	}
		else {
			System.out.println("Home Page is Not Displayed");
		}
	}
	
//	@Then("Verify the error message is displayed")
//	public void verifyErrorMessage() {
//		String text = driver.findElement(By.xpath("//*[@id='errorDiv']")).getText();
//		System.out.println(text);
//	}
}
