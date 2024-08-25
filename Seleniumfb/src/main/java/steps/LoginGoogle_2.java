//package steps;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
////|url|searchword|datavalidation|textField|
////|https://www.google.co.in/|India|India|India|
////|https:https://www.google.co.in/|Pakistan|Pakistan|
//
//public class LoginGoogle_2 {
//	
//	public WebDriver driver;
//	
//	@Given("To load the (.*)$")
//	public void loadUrl(String url) {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(url);
//	}
//	
//	@And("Maximize the browser")
//	public void pageMaxi() {
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//	
//	@And("Serach a content (.*)$")
//	public void serach(String searchword) throws InterruptedException {
//		WebElement findElement = driver.findElement(By.xpath("//textarea[@title='Search']"));
//		findElement.sendKeys(searchword);
//		findElement.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//	}
//	
//	@Then("Verify the (.*) and (.*) is displayed$")
//	public void verifyData(String datavalidation, String textField) {
//		WebElement returns = driver.findElement(By.xpath("//span[text()='"+textField+"']"));
//		String text1 = returns.getText();
//		System.out.println(text1);
//		if(text1.contentEquals(text1)) {
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("failed");
//		}
//	}
//	
//	@And("Navigate back to the back page")
//	public void back() {
//		driver.navigate().back();
//	}
//
//}