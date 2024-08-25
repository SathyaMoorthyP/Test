package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/main/resources/fet/log.feature",
		glue = {"step_definition_07"}
		)
public class Runner extends AbstractTestNGCucumberTests{
	
}
