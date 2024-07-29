package bootcamp.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bootcamp.Utility.bootcampBase;

public class bootcampAccountPageLocators extends bootcampBase { //here every class need parent or base class cze parent or base class have all the info we need
	 
	public bootcampAccountPageLocators() {  //constructor name should be same as class name 
		PageFactory.initElements(driver,this); //Selenium giving us one of class called PageFactory and method initElements,"this" is a keyword from  java.
		
	}
	
	@FindBy(id = "loginusername")
	public WebElement UserID;//ElementNamne;
	

	@FindBy(id = "loginpassword")
	public WebElement UserPassword;//ElementNamne;
	

	@FindBy(xpath = "//button[text()='Log in']")
	public WebElement loginButton;//ElementNamne;
}
 