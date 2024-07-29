package bootcamp.PageActions;

import bootcamp.PageLocators.ecommerceSignUpPageLocators;
import bootcamp.Utility.bootcampBase;

public class bootcampSignUppageActions extends bootcampBase {

	ecommerceSignUpPageLocators EcommerceSignUpPageLocators = new ecommerceSignUpPageLocators();
	public void EcommerceSignUpCard(String U, String P) throws Exception { //we are using parameter method for pass the value/// here U means User and p means pass
		Thread.sleep(5000);
		EcommerceSignUpPageLocators.SignUpName.sendKeys(U);
		EcommerceSignUpPageLocators.SignUpPassword.sendKeys(P);
		Thread.sleep(5000);
		EcommerceSignUpPageLocators.ClickSignUp.click();
		
		Thread.sleep(5000);
		
	}
	public void alert() {
		driver.switchTo().alert().accept();
	}
}
