package bootcamp.PageActions;

import org.testng.Assert;

import bootcamp.PageLocators.bootcampAccountPageLocators;
import bootcamp.PageLocators.bootcampHomePageLocators;
import bootcamp.Utility.bootcampBase;
import bootcamp.Utility.bootcampUtility;

public class bootcampHomepageActions extends bootcampBase {
	
	 
	bootcampHomePageLocators EcommerceHomePageLocators = new bootcampHomePageLocators();
	 
	public void Click_account_link() { //Click_account_link is ACNAME//ACNAME should be same as step name. 
		EcommerceHomePageLocators.AccountLink.click();
	}
	public void verify_user_signup_successfully () {
		boolean VerifyprofileSignUp =  EcommerceHomePageLocators.VerifySignUp.isDisplayed();
		Assert.assertTrue(VerifyprofileSignUp);
		
		bootcampUtility.takeMyScreenshot(driver,"Home page");
		
	}
	
	public void Click_sign_up_link() {
		EcommerceHomePageLocators.SignUpbutton.click(); 
	}
}
