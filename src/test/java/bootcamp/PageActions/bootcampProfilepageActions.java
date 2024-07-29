package bootcamp.PageActions;

import org.testng.Assert;

import bootcamp.PageLocators.bootcampProfilePageLocators;
import bootcamp.Utility.bootcampBase;
import bootcamp.Utility.bootcampUtility;

public class bootcampProfilepageActions extends bootcampBase {

	bootcampProfilePageLocators EcommerceProfilePageLocators = new bootcampProfilePageLocators();
	
	public void verify_user_login_successfully () {
		boolean ProfileVerification =	EcommerceProfilePageLocators.MyProfile.isDisplayed();
		Assert.assertTrue(ProfileVerification);
		
		bootcampUtility.takeMyScreenshot(driver,"Profile Page");
		
		EcommerceProfilePageLocators.LogOut.click();
	}
	
}
