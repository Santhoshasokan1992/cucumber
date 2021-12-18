package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefenition",dryRun=false,monochrome=true,
strict=false,snippets=SnippetType.CAMELCASE,tags= {"@sanity , @smoke"},plugin= {"usage","html:target\\Reports",
		"junit:target\\Reports\\fb.xml","json:target\\Reports\\fb.json","rerun:src\\test\\resources\\Rerun\\Failed.txt"})
public class TestRunner {
	
	
	
	@AfterClass
	public static void reports() {
	JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\fb.json");

	}

}
