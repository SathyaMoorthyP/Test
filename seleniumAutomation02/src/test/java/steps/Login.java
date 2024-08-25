package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{
	
	public WebDriver driver;
	
	@Given("Launch the Browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@And("Launch the URL and maximize the browser")
	public void launchUrl() {
	
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@And("Enter the username as (.*)$")
	public void  enterUsername(String uName) {
		
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@And("Enter the password as (.*)$")
	public void enterPassword(String passWord) {
		driver.findElement(By.id("password")).sendKeys(passWord);
	}
	
	@When("Click the Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Verify the home page")
	public void verifyHomepage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("Home page is displayed");
		}
		else {
			System.out.println("Home page is  not displayed");
		}
	}

}
