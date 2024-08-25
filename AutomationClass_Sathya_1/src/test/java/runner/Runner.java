package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/features/CreateLead.feature",
					glue = {"stepDefintions","hooks"},
					publish = true, 
					dryRun = false,
					snippets = SnippetType.CAMELCASE)

public class Runner extends AbstractTestNGCucumberTests{
	
}
