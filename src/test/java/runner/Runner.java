package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature_file",glue="stepdefnition")
public class Runner {
	
	public static WebDriver driver;

}
