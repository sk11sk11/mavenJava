package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//you have to pass feature file, parameter and stepdefinition
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/featurespackage",
		glue = "stepDefinitions")
public class TestRunner {

}
