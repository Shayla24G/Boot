package bootcamp.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bootcampBase {
	
	public static WebDriver driver; //global
	public static Properties ecommerceProp; //ecommerceProp is object of property class
	
	
	public bootcampBase() { //Constructor should not have a void just a class name
		// these are 3 things we need parent or base class
				//Constructor ( Constructor is special kind of method who initialize the value) //Constructor name should be as a class name
		
		try {
			FileInputStream ecommerceFile = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\bootcamp\\configure\\bootcampConfigaration.properties");//user.dir means user its me or my laptop dir means directory(project)
			ecommerceProp = new Properties (); //ecommerceProp is variname.Properties cl giving method load
			ecommerceProp.load(ecommerceFile);
		} catch (FileNotFoundException e) {
			System.out.println("Please fixed your constructor");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
		
		//BrowserSetup
	public void ecommerceBrowserSetup() {  //this method is responsible for launching browser
		String ecommerceAllBrowser = ecommerceProp.getProperty("EcommerceBrowser1");
		
		if(ecommerceAllBrowser.equals("Chrome")) {
		
			System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\ecommerceDriver\\chromedriver.exe");
			
			ChromeOptions eb = new ChromeOptions();
			eb.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //not took time to open URL 
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //took time to open URL
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(bootcampUtility.implicitlyWait)); //not took time to open URL 
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(bootcampUtility.pageLoadTimeout)); //took time to open URL
			driver.manage().deleteAllCookies();
			
			
		}
		else if(ecommerceAllBrowser.equals("IE"))
		{
			
		}
	}
		//LunchURLSetup
		 public static void ecommerceURLSetup (String URL){ 
			
			driver.get(ecommerceProp.getProperty("EcommerceURL")); 
			
			 
		 }
	
}
 