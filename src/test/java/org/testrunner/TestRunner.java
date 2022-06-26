package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.sample.BaseClass;
import org.stepDefinition.ReportJVM;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepDefinition",monochrome=true,dryRun=false,
snippets=SnippetType.CAMELCASE,plugin= {"html:target","junit:ReportJunit\\junit.xml","json:ReportJson\\report.json","rerun:src/test/resources\\failed.txt"})
//@CucumberOptions(features="src/test/resources",glue="org.stepDefinition")
public class TestRunner extends BaseClass {
	
	@AfterClass
	public static void tc100() {
		// TODO Auto-generated method stub
ReportJVM.reportGeneration("C:\\Users\\DELL\\eclipse-workspace\\Cucumber1\\ReportJson\\report.json");
	}
	
	
	
public static void main(String[] args) {
	//browserCall();
	//launchUrl("https://demoqa.com/");
	//ToolsQA tqa = new ToolsQA();
	//sendValues(tqa.getFirstName(), "SARANESH");
	//sendValues(tqa.getLastName(), "SRINIVASAN");
	//click(tqa.getSendClick());
	//driver.findElement(By.xpath("//img[@class='banner-image']")).click();
}
	
}
