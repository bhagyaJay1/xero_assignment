package com.xero.util;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber-report.json",
					"junit:target/cucumber-report.xml"},
			publish=true,
			features = "src/test/resources/features", 
			glue = { "com.xero.teststeps" }
		)

public class TestRunner {

}

