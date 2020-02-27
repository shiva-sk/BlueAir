package org.RunnerAndReports;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/HomePage.feature",
glue="org.StepOfBook",
plugin= {"pretty"},
monochrome=true)
public class HomeRunner {

}
