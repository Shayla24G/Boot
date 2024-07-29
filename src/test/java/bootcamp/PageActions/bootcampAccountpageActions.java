package bootcamp.PageActions;

import bootcamp.PageLocators.bootcampAccountPageLocators;
import bootcamp.PageLocators.bootcampHomePageLocators;
import bootcamp.Utility.bootcampBase;

public class bootcampAccountpageActions extends bootcampBase{
//ecommerceHomePageLocators is class name//EcommerceHomePageLocators is variable name	
	 bootcampAccountPageLocators EcommerceAccountPageLocators =new bootcampAccountPageLocators(); // create objct
	
	public void EcommerceCard(String U, String P) throws Exception { //we are using parameter method for pass the value/// here U means User and p means pass
		Thread.sleep(5000);
		EcommerceAccountPageLocators.UserID.sendKeys(U);
		EcommerceAccountPageLocators.UserPassword.sendKeys(P);
		EcommerceAccountPageLocators.loginButton.click();
	}
}
