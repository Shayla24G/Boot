package bootcamp.PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bootcamp.Utility.bootcampBase;

public class bootcampProfilePageLocators extends bootcampBase {
 
	 public bootcampProfilePageLocators() {  //constructor name should be same as class name 
			PageFactory.initElements(driver,this); //Selenium giving us one of class called PageFactory and method initElements,"this" is a keyword from  java.
			
		}
		
		@FindBy(linkText = "Welcome Shayla Binte Alam")//"(//strong[text()='Shayla Saika'])[1]")
		public WebElement MyProfile;//ElementNamne;
		
		@FindBy(linkText = "Log out")//"(//strong[text()='Shayla Saika'])[1]")
		public WebElement LogOut;//ElementNamne;
}
