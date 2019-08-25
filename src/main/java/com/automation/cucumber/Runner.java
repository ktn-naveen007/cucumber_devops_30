package com.automation.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;

import com.automation.cucumber.TestListener;

import com.cucumber.listener.Reporter;




@Listeners({ TestListener.class })

@CucumberOptions(features = { "E:\\Cucumber_Naveen\\cucumber\\FeatureFiles" }, glue = {"E:\\Cucumber_Naveen\\cucumber\\src\\main\\java\\com\\cucumber\\steps"}, plugin = { "pretty","json:target/cucumber-reports/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Extent Reports/report.html" }, monochrome = true, strict = false, dryRun = false, tags = {
				"@Functional1" })

public class Runner extends AbstractTestNGCucumberTests {
	
	@AfterClass
	public static void writeExtentReport() {

		Reporter.loadXMLConfig(new File("E:\\Cucumber_Naveen\\cucumber\\extent-config.xml"));

	}
}
