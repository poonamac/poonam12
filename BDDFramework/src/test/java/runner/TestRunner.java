package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\Desktop\\screen\\BDDFramework\\src\\test\\java\\feature",
glue= {"stepDefinition"},plugin= {"pretty","html:target"})

public class TestRunner {

}
