package org.stepDefinition;
import java.util.List;

import org.junit.Assert;
import org.sample.BaseClass;
import org.sample.FacebookLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinition extends BaseClass {
 
	FacebookLoginPage fb;
	
	@Given("To launch the browser and hit the facebook url")
	public void to_launch_the_browser_and_hit_the_facebook_url() {
		
		System.out.println("browser opened");
		launchUrl("https://www.facebook.com/");
	}

	@When("To pass the invalid userName in userName field")
	public void to_pass_the_invalid_userName_in_userName_field(DataTable d) {
		 fb = new FacebookLoginPage();
		 Assert.assertTrue(false);
		 List<String> li = d.asList();
		 String string = li.get(3);
		sendValues(fb.getUser(), string);
	}

	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field(DataTable d) {
		 fb = new FacebookLoginPage();
		 List<List<String>> lists = d.asLists();
		 String str = lists.get(2).get(1);
		 sendValues(fb.getPass(), str);
		
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		 fb = new FacebookLoginPage();
		 click(fb.getBtn());
		 
	}

	@Then("To cloase the Browser")
	public void to_cloase_the_Browser() {
	
		System.out.println("close browser");
	}

}
