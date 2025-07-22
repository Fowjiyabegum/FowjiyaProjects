package com.omrbranch.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@Login",snippets = SnippetType.CAMELCASE, dryRun = false, publish = true, stepNotifications = false, monochrome = true, plugin = {
		"pretty",
		"json:target\\Output.json" }, glue = "com.omrbranch.stepdefinition", features = "src\\test\\resources")
public class TestRunnerClass extends BaseClass {
	@AfterClass
	public static void ReportGenerate() throws FileNotFoundException, IOException
	{
		Reporting.generateJvmReports(getProjectPath()+getPropertyFileValue("jsonPath"));
	}

}
