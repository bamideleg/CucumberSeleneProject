
package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		
				features = "Features", // Part of the feature file
				glue = {"TestExecution"}, // Path of steps definition
				format= {"pretty","html:test-outout"},
//				format= {"pretty","html:test-outout", "json:json_outout/cucumber/json","junit:junit_xml/cucumber.xml"}, //Json and xml file get genenrated as well.For example, 
				monochrome = true,  // Display console output to readable format
				strict = true, // Check that the setps are defined in StepsDefinition
				dryRun = true // Check for one to one mapping from scenario steps to StepsDefinition, this is code to check for missing steps.
//		      Change the dry to TRUE (check) FALSE (to run your test
				
				)

public class cucumberRunner {

}
