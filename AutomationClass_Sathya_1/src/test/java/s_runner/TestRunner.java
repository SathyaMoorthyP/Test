package s_runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/s_feature/CreateLead.feature",
				  glue = "s_stepdefinition",
				  dryRun = false,
				  snippets = SnippetType.CAMELCASE
				  )

public class TestRunner extends AbstractTestNGCucumberTests {

}
