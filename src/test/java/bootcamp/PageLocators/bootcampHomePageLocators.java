package bootcamp.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bootcamp.Utility.bootcampBase;

public class bootcampHomePageLocators extends bootcampBase{

	 
		public bootcampHomePageLocators() {  //constructor name should be same as class name 
			PageFactory.initElements(driver,this); //Selenium giving us one of class called PageFactory and method initElements,"this" is a keyword from  java.
			
		}
		
		@FindBy(linkText = "Log in")
		public WebElement AccountLink; //Elementname 
		
		@FindBy(linkText = "Phones")
		public WebElement VerifySignUp; //Elementname
		
		@FindBy(id = "signin2")
		public WebElement SignUpbutton;
}
 