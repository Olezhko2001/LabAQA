package ua.lviv.iot.labaqa;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",  "html:target/report.html"} , features = "src/test/resources")
public class TestRunner {
}
