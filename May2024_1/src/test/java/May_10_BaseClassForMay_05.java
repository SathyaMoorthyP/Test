import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class May_10_BaseClassForMay_05 {
	
	public WebDriver driver;
	
	@Parameters({"url","uName","pWord"})
	@BeforeMethod
	public void preCondition(@Optional("http://leaftaps.com/opentaps/control/main") String url, String uName, String pWord) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pWord);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
}
