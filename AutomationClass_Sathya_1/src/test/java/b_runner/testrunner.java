package b_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/b_feature/login.feature",
					glue = "b_stepdefinition"	
		)
public class testrunner extends AbstractTestNGCucumberTests {
	
}
