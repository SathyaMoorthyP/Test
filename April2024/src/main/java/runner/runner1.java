package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/feature/amazon.feature",
					glue = "stepdefinition", 
					publish = true,
					monochrome = true
				)
public class runner1 extends AbstractTestNGCucumberTests {

}
