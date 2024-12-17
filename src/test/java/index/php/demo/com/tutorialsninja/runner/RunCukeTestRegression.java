package index.php.demo.com.tutorialsninja.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Jay Vaghani
 */

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "index/php/demo/com/tutorialsninja/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@regression"
)

public class RunCukeTestRegression extends AbstractTestNGCucumberTests {

}