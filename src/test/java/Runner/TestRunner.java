package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.messages.ndjson.internal.com.fasterxml.jackson.annotation.JsonFormat;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = {"src/test/java/Features/login.feature"},
        features = {"src/test/java/Features/Backgrounddemo.feature"},
        glue = {"StepDefinitions"},
        tags="@smoke or not @regression"
)
public class TestRunner {
}
