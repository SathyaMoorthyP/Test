package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/Feature/login.feature",
glue = "StepDefinition",
monochrome = true,
publish = true)
public class Runner extends AbstractTestNGCucumberTests {

	public static void main(String[] args) {
		
		
	}

}
