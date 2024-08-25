package stepdefinition;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class A24_LoginToAmazonWebpage {
	
	public WebDriver driver;
	
	@Given("Launch the Chrome Browser on")
	public void launchBrowser() {
		driver = new ChromeDriver();
	}
	
	@Then("Load the url and Maximize the webpage")
	public void loadUrlandMaximize() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Then("In the Search option Enter phone and click on magnifier glass")
	public void enterPhoneClickOnSearch() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Then("Click on Oneplus phone")
	public void clickOneplusPhone() {
		driver.findElement(By.xpath("//span[contains(text(),'Oneplus Nord CE4')]")).click();
	}
	
	@Then("Switch to new window")
	public void windowHandling() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowss = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowss.get(1));
		
	}
	
	@Then("Click on the Phone Variant")
	public void clickOnVariant() {
		driver.findElement(By.xpath("//p[text()='8GB + 128GB']")).click();
	}
}
