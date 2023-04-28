package Runners;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/Features"},
        glue = {"Steps"},
        plugin = {"pretty","html:test-output"},
        dryRun = false,
        monochrome = true,
        tags = "@PR-Mati-001")
public class runners {

}
