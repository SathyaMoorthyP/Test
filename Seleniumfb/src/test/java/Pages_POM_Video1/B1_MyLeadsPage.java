package Pages_POM_Video1;

import org.openqa.selenium.By;

import pom_video1_baseclass.BaseClass;

public class B1_MyLeadsPage extends BaseClass{
	
	public void clickFindLeads() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
	}
}
