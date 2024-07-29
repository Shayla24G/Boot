package bootcampStep_def;
import bootcamp.PageActions.bootcampAccountpageActions;
import bootcamp.PageActions.bootcampHomepageActions;
import bootcamp.PageActions.bootcampProfilepageActions;
import bootcamp.Utility.bootcampBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserLogin extends bootcampBase {

	bootcampAccountpageActions EcommerceAccountpageActions = new bootcampAccountpageActions(); // these are Accountpage,Homepage,Profilepage object
	bootcampHomepageActions EcommerceHomepageActions = new bootcampHomepageActions ();
	bootcampProfilepageActions EcommerceProfilepageActions = new bootcampProfilepageActions ();
	
	@Given("^Open Ecommorce \"([^\"]*)\" application$")
	public void open_Ecommorce_application(String URL) throws Throwable {
		ecommerceURLSetup(URL);
	}

	@Then("^Click account link$")
	public void click_account_link() throws Throwable {
		EcommerceHomepageActions.Click_account_link();
	}

	@Then("^Enter username and Passwaord and click login$")
	public void enter_username_and_Passwaord_and_click_login() throws Throwable {
		EcommerceAccountpageActions.EcommerceCard(ecommerceProp.getProperty("EcommerceUsername1"),ecommerceProp.getProperty("EcommercePassword1") );
	}

	@Then("^verify user login successfully$")
	public void verify_user_login_successfully() throws Throwable {
		EcommerceProfilepageActions.verify_user_login_successfully();
	}

}
	
	


