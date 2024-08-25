package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class step2 extends StepBaseclass{

	@Then("Click on crmsfa Link")
	public void clickOnCrmsfa() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}
	
}
