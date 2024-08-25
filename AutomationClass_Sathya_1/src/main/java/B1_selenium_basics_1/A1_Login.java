package B1_selenium_basics_1;
// 1st

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_Login {
	
	public static void main(String[] args) {
		
		//setup the browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter the username //shortcut to return a variable  (Ctrl+2, L)
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Viha");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		driver.findElement(By.name("submitButton")).click();
			
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(firstName.equals("Viha")){
			
			System.out.println("First Name is correct");
		} else {
			
			System.out.println("First Name is Incorrect");
		}
		
		//driver.close();
		
	}

}
