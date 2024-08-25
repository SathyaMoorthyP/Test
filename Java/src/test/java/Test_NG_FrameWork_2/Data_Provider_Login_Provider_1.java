package Test_NG_FrameWork_2;
// 1st

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Provider_Login_Provider_1 {
	
	public ChromeDriver driver;
	
	@Parameters({"username", "password"})
	@BeforeMethod
	public void basecodes(String username, String password) {
		
		//setup the browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter the username //shortcut to return a variable  (Ctrl+2, L)
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}

}
