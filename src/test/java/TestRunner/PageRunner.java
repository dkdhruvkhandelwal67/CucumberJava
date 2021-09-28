package TestRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/Features",
		glue= {"StepDefinations"},
		plugin = {"json:target/jsonReports/cucumber.json"},
		tags="@SmokeTest"
		)
@Test
public class PageRunner extends AbstractTestNGCucumberTests{


}
