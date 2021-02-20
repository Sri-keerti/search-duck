package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
	features=".//Features/Search.feature",
	glue="step_definitions",
	//dryRun=true,
	plugin= {"pretty","html:test-output"}
			)

public class TestRunner {
	
	
	

}
