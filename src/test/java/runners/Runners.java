package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumberReports.html"},
        features = "src/test/resources/features",
        glue = "stepDefitions",
        tags = "@Tredyol",
        dryRun = false
)

public class Runners {
}
