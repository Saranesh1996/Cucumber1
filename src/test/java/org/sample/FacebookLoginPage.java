package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.sample.BaseClass;

public class FacebookLoginPage extends BaseClass {
	public FacebookLoginPage() {
		PageFactory.initElements(driver, this);
	}
   @FindBy(id="email")
 WebElement user;
  @FindBy(id="pass")
   WebElement pass;  
   @FindBy(xpath="//button[text()='Log In']")
   WebElement btn;
   @FindBys({
	   @FindBy(name="login"),
	   @FindBy(id="u_0_d_N7"),
	   @FindBy(xpath="//button[text()='Log In']")
   })
   WebElement btnclk;
   
   @FindAll({
	   @FindBy(name="login"),
	   @FindBy(id="u_0_d_N7"),
	   @FindBy(xpath="//button[text()='Log In']")
   })
   WebElement allbtn;
   
	public WebElement getAllbtn() {
	return allbtn;
}

	public WebElement getBtnclk() {
	return btnclk;
}

	public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}
public WebElement getBtn() {
	return btn;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
