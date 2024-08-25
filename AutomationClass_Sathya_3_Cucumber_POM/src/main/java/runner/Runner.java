package runner;

import org.testng.annotations.DataProvider;

import base.baseclass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/main/java/feature/CreateLead.feature",
					glue = {"pages"},
					publish = true, 
					dryRun = false,
					snippets = SnippetType.CAMELCASE)

public class Runner extends baseclass{

//	@DataProvider(parallel = true)
	
}
