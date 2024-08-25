package AutomationFB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='password']/following::input")).click();
		Thread.sleep(3000);
		//driver.close();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		
//		WebElement findElement = driver.findElement(By.xpath(""));
//		List<WebElement> findElements = driver.findElements(By.xpath(""));
		
		String requirment = "last()";
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)["+requirment+"]")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear(); 
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("I have Edited");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//sendKeys("I have Edited");
		
		//String ttt ="opentaps";
		//driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a[text()='"+ttt+"']")).click();
		
		
		
		//attribute based xpath , text based path
		/*
		 * // driver.findElement(By.
		 * xpath("//ul[@class='shortcuts']//a[text()='Create Lead']")).click(); // //
		 * //parent to child // //driver.findElement(By.xpath(
		 * "//input[@id='createLeadForm_companyName']/parent::td")).sendKeys("IBM"); //
		 * // driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).
		 * sendKeys("IBM"); // // //parent to child //
		 * //driver.findElement(By.xpath("//td[@id='ext-gen596']/input")).sendKeys(
		 * "viha"); // //
		 * driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).
		 * sendKeys("viha"); // // //parent to child //
		 * //driver.findElement(By.xpath("//td[@id='ext-gen632']/input")).sendKeys("s");
		 * // // driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).
		 * sendKeys("s"); // // //parent to child //
		 * //driver.findElement(By.xpath("//td[@id='ext-gen612']/input")).click(); // //
		 * driver.findElement(By.xpath("//input[@value='Create Lead']")).click(); // //
		 * //driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']"))
		 * .sendKeys("moorthy"); //
		 */	}
}
