package bootcamp.Test_Runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import bootcamp.Utility.bootcampBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//We Need Cucumber Options
@CucumberOptions(features = {"src/test/resourcess/bootcampAllFeatures"},
plugin = {"json:target/cucumber.json"}, //html report/ test result
glue = "bootcampStep_def")//,tags={"@Shayla"})

public class bootcamp1TestRunner  extends AbstractTestNGCucumberTests {
	//responsible for open the browser
	@BeforeTest
	 public void bootcampStartURL() {   
		 bootcampBase EStart = new bootcampBase(); // ecommerceBase coming from ecommerce.Utility
		 EStart.ecommerceBrowserSetup(); //58 minute a bujhi nai
		 
	 }
	//responsible for open the close browser
	 @AfterTest
	 public void bootcampCloseBrowser() {
		 bootcampBase EStart = new bootcampBase();
		 EStart.driver.quit();
		 
	 }
}
