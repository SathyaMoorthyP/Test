package s_stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class S2_CreateLead extends S_BaseClass{

	@Given("Click on {string} link")
	public void clickLink(String linkText) {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@Given("{string} page should  be displayed")
	public void verifyPage(String pageName) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='"+pageName+"']")).isDisplayed();
		System.out.println(displayed);
	}
}
