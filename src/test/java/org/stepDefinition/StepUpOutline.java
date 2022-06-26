package org.stepDefinition;

import org.sample.BaseClass;
import org.sample.FacebookLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepUpOutline extends BaseClass {
	
	 FacebookLoginPage fb;

	//@Given("To launch the browser and open the facebook url")
	//public void to_launch_the_browser_and_open_the_facebook_url() {
	//	browserCall();
		//launchUrl("https://www.facebook.com/");
//	}

	@When("To pass the bulk of datas{string} in userName field")
	public void to_pass_the_bulk_of_datas_in_userName_field(String userName) {
	     fb = new FacebookLoginPage();
	     sendValues(fb.getUser(), userName);
	    
	}

	@When("To pass the bulk of datas{string} in Password field")
	public void to_pass_the_bulk_of_datas_in_Password_field(String Password) {
		fb = new FacebookLoginPage();
	     sendValues(fb.getPass(), Password);
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
