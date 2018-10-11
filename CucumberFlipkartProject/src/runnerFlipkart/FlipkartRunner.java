package runnerFlipkart;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class FlipkartRunner {

//	@RunWith(Cucumber.class)
	@CucumberOptions(features = { "FlipkartFeatureFile"}, 
					glue = { "stepdefinition" },
					plugin= {"pretty" , "html:testReport"}
					//Used to read console output in readable format
					//dryRun=true,//used to check feature file scenarios with step definition line by line like compile 
					//strict=true//Execution fails if it step definition and features not match or undefined
				

			)
	@Test
	public class RunnerTest extends AbstractTestNGCucumberTests{
	 
	}
}
