package cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", monochrome = true, tags= "@SmokeTest")
//@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", monochrome = true, tags= "@RegressionTest")
//@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", monochrome = true, tags= "@SmokeTest and @RegressionTest")
//@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", monochrome = true, tags= "not @SmokeTest")
//@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", monochrome = true, tags= "not @RegressionTest")
//@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", monochrome = true, tags= "@SmokeTest or @RegressionTest", plugin = {"pretty","html:target/cucumber.html"})
//@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", monochrome = true, tags= "@SmokeTest or @RegressionTest", dryRun = true)
@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", monochrome = true, tags= "@SmokeTest or @RegressionTest")
public class TestNGRunner extends AbstractTestNGCucumberTests{
	
}
