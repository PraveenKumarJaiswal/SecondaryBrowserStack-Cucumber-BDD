package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.runtime.StepDefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import Resource.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinition extends BrowserStackTestDemo
//public class LoginStepDefinition extends BaseClass
{
	public static Logger log = LogManager.getLogger(StepDefinition.class);

	@Before
	public void setUp() throws IOException {
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// To run using BaseClass file.
/*
	@Given("^User Launch Chrome browser$")
	public void User_Launch_Chrome_browser(Platform platform, String browserName, String browserVersion) throws Throwable {
				
		driver = initializeDriver();
		log.info("I am Back");
	}
*/	
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   

	@Given("^user navigates to the website \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_navigates_to_the_website(Platform platform, String browserName, String browserVersion, String url) throws Throwable 
	{
		openSTM(platform, browserName, browserVersion);
		Thread.sleep(1000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
