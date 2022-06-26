package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass {
	
	public AmazonPojo()  {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="ap_email")
	private WebElement mailId;
	
	
	@FindBy(xpath="//input[@class='a-button-input' ]")
	private WebElement enterId;
	
	@FindBy(id="ap_password")
	private WebElement passId;
	
	
	@FindBy(xpath="(//input[@class='a-button-input' ]) [1]")
	private WebElement signId;

	public WebElement getMailId() {
		return mailId;
	}

	public WebElement getEnterId() {
		return enterId;
	}

	public WebElement getPassId() {
		return passId;
	}

	public WebElement getSignId() {
		return signId;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
