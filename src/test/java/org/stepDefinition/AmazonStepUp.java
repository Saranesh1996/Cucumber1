package org.stepDefinition;

import org.junit.Assert;
import org.sample.AmazonPojo;
import org.sample.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AmazonStepUp  extends BaseClass{
AmazonPojo ap;

@Given("To launch the browser and hit the url")
public void toLaunchTheBrowserAndHitTheUrl() {
	launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D60639568242%26hvpone%3D%26hvptwo%3D%26hvadid%3D294102729729%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D9800504298345199287%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061892%26hvtargid%3Dkwd-311187680635%26hydadcr%3D5841_1914865%26gclid%3DCj0KCQjw4uaUBhC8ARIsANUuDjUQvvxxDkNvz7ojWwc0-ORays92PsMD0SQCi0QmjRLWNJUk4k3wjy4aAgqhEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
}

@When("To enter valid phno")
public void toEnterValidPhno() {
    ap = new AmazonPojo();
    sendValues(ap.getMailId(), "8754833306");
}

@When("To click the enter button")
public void toClickTheEnterButton() throws InterruptedException {
	ap = new AmazonPojo();
	thread(3000);
	click(ap.getEnterId());
}

@When("To enter invalid password")
public void toEnterInvalidPassword() {
	ap = new AmazonPojo();
	Assert.assertTrue("manual break", false);
	sendValues(ap.getPassId(), "vikisaran");
}

@When("To click the sign in button")
public void toClickTheSignInButton() throws InterruptedException {
	ap = new AmazonPojo();
	click(ap.getSignId());
	thread(3000);
}	
	
	
	
	
	
	
	
	
	
	
	
	
}
