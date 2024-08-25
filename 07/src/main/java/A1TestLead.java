import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A1TestLead extends A_BaseClass {

	@Test
	public void testLead() { 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("crmsfa",Keys.ENTER);
		driver.findElement(By.xpath("//*[contains(text(),'CRM/SFA')]")).click();
				
	}
}
