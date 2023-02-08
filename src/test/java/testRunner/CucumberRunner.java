package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions

(
features = "Feature",
glue = {"stepdefination"},
plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags = "not @tagoutline"

)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
