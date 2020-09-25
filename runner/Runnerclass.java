package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/main/java/feature/login.feature",
		glue = "implementation",
		dryRun = false,
		strict = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-html-report"}
		)

public class Runnerclass {
	
	

}
