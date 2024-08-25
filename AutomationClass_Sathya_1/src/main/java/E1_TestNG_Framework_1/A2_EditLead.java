package E1_TestNG_Framework_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_EditLead {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
//		driver.findElement(By.xpath(" //*[text()='First name:']/parent::div[contains(@class,'x-tab-item')]/div/input")).sendKeys("Viha");
		driver.findElement(By.xpath("//em[@unselectable='on']/button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Lead ID']/following::tbody/tr[1]/td[1]//div//a")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//*[@name='parentPartyId']")).sendKeys("Sathya");
		driver.findElement(By.xpath("//*[@value='Update']")).click();
		
		
		// 37.22
		
				//driver.close();
	}
}


