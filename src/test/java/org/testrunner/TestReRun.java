package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\DELL\\eclipse-workspace\\Cucumber1\\src\\test\\resources\\failed.txt",glue="org.stepDefinition")
public class TestReRun {

}
