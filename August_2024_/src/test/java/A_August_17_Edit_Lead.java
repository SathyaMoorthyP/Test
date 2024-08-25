import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_August_17_Edit_Lead {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.className("inputLogin")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[contains(@name,'PAS')]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//label[text()='First name:']/parent::div/div/input[contains(@name,'first')])[3]")).sendKeys("James");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='James']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement findElement = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		findElement.clear();
		findElement.sendKeys("Go");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
	}

}
