package b_stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class A2_CreateLead extends A_BaseClass {
	
	@Given("Click on {string} link")
	public void clickLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
	
	@Given("{string} page should  be displayed")
	public void verifyPage(String pageName) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='"+pageName+"']")).isDisplayed();
		System.out.println(displayed);
	}

}
