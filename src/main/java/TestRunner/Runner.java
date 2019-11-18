package TestRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.model.CucumberFeature;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="./src/main/java/Features/"
			,glue={"StepDef"}
			,format={"pretty","html:test.output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}
			,monochrome=true
			,strict = true		
			,dryRun=false
			)


public class Runner {

	
}