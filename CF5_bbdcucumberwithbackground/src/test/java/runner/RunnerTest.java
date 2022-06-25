package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\resources\\Feature"
		,glue = "stepdefination"
		,monochrome = true
		,tags = "@mohan and @sanity"
		,plugin = {"pretty", "html:.\\target\\cucumberReport\\mohan.html"}  //defaulyt cucumber report
// 	MAVEN PROJECT naga changed

		)
public class RunnerTest {

}
