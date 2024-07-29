package bootcampStep_def;


import bootcamp.PageActions.bootcampHomepageActions;
import bootcamp.PageActions.bootcampSignUppageActions;
import bootcamp.Utility.bootcampBase;
import cucumber.api.java.en.Then;


public class UserRegistration extends bootcampBase {
	
	bootcampSignUppageActions EcommerceSignUppageActions = new bootcampSignUppageActions ();
	bootcampHomepageActions EcommerceHomepageActions = new bootcampHomepageActions ();
	
	//@Then("^Click sign up link$")
	public void click_sign_up_link() throws Throwable {
		EcommerceHomepageActions.Click_sign_up_link();
	}

	@Then("^Enter username and Passwaord and click signup$")
	public void enter_username_and_Passwaord_and_click_signup() throws Throwable {
EcommerceSignUppageActions.EcommerceSignUpCard(ecommerceProp.getProperty("SignUpName"),ecommerceProp.getProperty("SignUpPassword")); 
		
		EcommerceSignUppageActions.alert();
	}

	@Then("^verify user signup successfully$")
	public void verify_user_signup_successfully() throws Throwable {
		EcommerceHomepageActions.verify_user_signup_successfully();
	}


	
	
}
