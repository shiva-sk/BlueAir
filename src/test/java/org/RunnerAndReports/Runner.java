package org.RunnerAndReports;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/FlightSearchPage.feature",
glue="org.StepOfBook",
dryRun=false,
plugin= {"pretty",
		"html:C:\\Users\\SHIVA\\Desktop\\core java\\BlueAir\\target",
		"json:C:\\Users\\SHIVA\\Desktop\\core java\\BlueAir\\target\\report.json"},
monochrome=true)
public class Runner {
@AfterClass
public static void report() {
	JVMreports.generateReprts("C:\\\\Users\\\\SHIVA\\\\Desktop\\\\core java\\\\BlueAir\\\\target\\\\report.json");
}
}
