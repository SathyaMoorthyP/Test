package Test_NG_FrameWork_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Password extends UserName{
//public WebDriver driver;



	@Test
//	@Test(dependsOnMethods = {"Test_NG_FrameWork_2.UserName.userName"})
	public void passowrd() {
	
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("PASSWORD");
	}
}
