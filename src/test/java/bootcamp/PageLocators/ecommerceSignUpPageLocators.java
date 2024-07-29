package bootcamp.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bootcamp.Utility.bootcampBase;

public class ecommerceSignUpPageLocators extends bootcampBase{
	
	public ecommerceSignUpPageLocators() {  //constructor name should be same as class name 
		PageFactory.initElements(driver,this); //Selenium giving us one of class called PageFactory and method initElements,"this" is a keyword from  java.
		
	}
	
	
	@FindBy(id = "sign-username")
	public WebElement SignUpName;
	
	@FindBy(id = "sign-password")
	public WebElement SignUpPassword;
	
	@FindBy(xpath = "//button[text()='Sign up']")
	public WebElement ClickSignUp;
	
}
