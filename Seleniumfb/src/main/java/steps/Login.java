//package steps;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.But;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Login {
//
//	public WebDriver driver; 
//	
//	@Given("Launch the Chrome Browser")
//	public void launchBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
//	
//	@And("Load the URL and Maximize")
//	public void loadUrl() {
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}
//	
//	@And("Enter the user name as {string}")
//	public void userName(String uName) {
//		WebElement findElement = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
//		findElement.sendKeys(uName);
//	}
//	
//	@And("Enter the password as {string}") 
//	public void password(String passWord) {
//		WebElement findElement1 = driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
//		findElement1.sendKeys(passWord);
//	}
//	
//	@When("Click on the Login button")
//	public void submit() {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	}
//	
//	@Then("Verify the homepage is displayed")
//	public void verifyHomePage() {
//		WebElement findElement3 = driver.findElement(By.xpath("//*[contains(text(),'CRM/SFA')]"));
//		String Value = findElement3.getText();
//		if (Value.equals("CRM/SFA")) {
//			System.out.println("Verification Passed");
//		} else {
//			System.out.println("Verification failed");
//	 	}
//	}
//	
//	@But("Verify the error message is displayed")
//	public void verifyErrorMessage() {
//		WebElement text = driver.findElement(By.xpath("//div[@id='errorDiv']"));
//		String text2 = text.getText();
//		System.out.println(text2);
//	}
//}
