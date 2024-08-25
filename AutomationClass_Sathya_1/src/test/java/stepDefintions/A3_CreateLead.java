package stepDefintions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A3_CreateLead extends A1_BaseClass {
	
	@When("Click on {string} link")
	public void clickLink(String Link) {
		driver.findElement(By.linkText(Link)).click();
	}
	
	@Then("{string} Page should be Displayed")
	public void verifyPage(String pageName) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='"+pageName+"']")).isDisplayed();
		System.out.println(displayed);
	}
}
