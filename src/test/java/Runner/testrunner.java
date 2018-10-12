package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features/",
glue= {"StepDefention"},
plugin = { "json:target/cucumber-report/cucumber.json" },
monochrome = true
)

public class testrunner {

}