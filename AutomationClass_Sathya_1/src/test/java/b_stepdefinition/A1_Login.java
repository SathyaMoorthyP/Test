package b_stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_Login extends A_BaseClass{

	
	@Given("Launch the Browser")
	public void launchBrowser() {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
	}
	
	@And("Load the URL")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	}
	
	@And("Enter the UserName (.*)$")
	public void enterUserName(String uName) {
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys(uName);
	}
	
	@And("Enter the Password (.*)$")
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
	
	@And("Verify Error Message is displayed")
	public void notDisplayed() {
		boolean displayed = driver.findElement(By.xpath("//p[contains(text(),'The Following Errors Occurred:')]")).isDisplayed();
		if(displayed) {
			System.out.println("Password is Incorrect");
		}
		else{
			System.out.println("Password is correct");
		}
	}
	
	@And("Click on Lead Button")
	public void clickLead() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}
	
	@And("Click on Create Lead Button")
	public void clickCreateLead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	}
	
	@And("Enter company name")
	public void enterCname() {
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Bank");
	}
	
	@And("Enter First Name (.*)$")
	public void enterFname(String name) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(name);
	}
	
	
	@And("Enter Last Name")
	public void enterLname() {
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("P");
	}
	
	@And("Click on Button")
	public void clickLeadbutton() {
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	}
}
