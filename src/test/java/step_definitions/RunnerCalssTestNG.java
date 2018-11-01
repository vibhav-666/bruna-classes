package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features=".",
        tags = {"@CreateAccount"},
        plugin = {"pretty","html:target2/cucumber-html-report"},
        strict = true,
        dryRun = false
)


public class RunnerCalssTestNG extends AbstractTestNGCucumberTests {


}