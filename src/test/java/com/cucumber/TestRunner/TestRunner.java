package com.cucumber.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

public class TestRunner {
	
	
	@RunWith(cucumber.class)
	@CucumberOptions(
			feature="feature",
			glue="com.cucumber.StepDefinition",
			dryRun=false,
			Strict=true,
			manochrome=true)
	
	
}

	
	