package org.stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.sample.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before(order=1)
	public void launch_browser() {
	
		browserCall();
		System.out.println("launch browser");
	}

	@After(order=10,value="@sanity")
	public void close_browser() {
		System.out.println("close browser");
		closeBrowser();

	}

	@Before(order=10,value="  @sanity")

	public void beforeScreenshot() {
		// TODO Auto-generated method stub
		System.out.println("before screen shot");
	}

	@After(order=100)

	public void afterScreenshot(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot tks =(TakesScreenshot)driver;
			byte[] sAs = tks.getScreenshotAs(OutputType.BYTES);
			//to merge html report
			s.embed(sAs, "image/png");
		}
		
	}

}
