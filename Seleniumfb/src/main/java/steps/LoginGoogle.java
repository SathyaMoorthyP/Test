package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginGoogle {
	
	public WebDriver driver;
	
	@Given("To load the url")
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.getTitle();
		
	}

//	@Given("^To load a \"(.*)\"$")
//	public void launchBrowsers(String url1) {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(url1);
//		
//	}

	@And("Maximize the browser")
	public void maximizeBrowser() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@And("Enter the seraching data (.*)$")
	public void searchData(String searchField) throws InterruptedException {
		WebElement search = driver.findElement(By.xpath("//*[@title='Search']"));
		search.sendKeys(searchField);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	@Then("Verify the (.*) and (.*) is displayed$")
	public void verifyData(String dataValidation, String textValue) {
		WebElement gett = driver.findElement(By.xpath("//*[text()='"+textValue+"']"));
		String text = gett.getText();
		System.out.println(text);
		if (text.equalsIgnoreCase(dataValidation)) {
			System.out.println("Test case is Passed");
		}else
		{
			System.out.println("Test cases is Failed");
		}
			
	}
	
	@And("Navigate back to search page")
	public void navigateBack() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
	}
}
