package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\LumaJacketFeature.feature"},
					
				    
		
		glue = {"com.stepDefinition","com.hooks"},
		monochrome = true,
		dryRun = false,
		publish = false,
		tags = "not @menjacket",
		plugin = { 
					"html:LumaReports/LumaHTMLReports.html",
					"json:LumaReports/LumaJSONReports.json",
					"pretty",
					//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"com.aventstack.chaintest.plugins.ChainTestCucumberListener:", 
					"timeline:targetTimeline/cucumber"

				}
		)

public class TestRunner {

}
