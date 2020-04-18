package Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;

public class BrowserStackTestDemo {
	public static final String USERNAME = "praveen6";
	public static final String AUTOMATE_KEY = "WS8A9aJsrnCb";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static WebDriver driver;
	
	
	@Test(dataProvider = "PallaviDemo")
	public void openSTM(Platform platform, String browserName, String browserVersion) throws MalformedURLException  
	{

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(platform);
		caps.setBrowserName(browserName);
		caps.setVersion(browserVersion);
		caps.setCapability("name", "Demo 2.0");
		caps.setCapability("browserstack.debug",true);

		driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		
		
	}
	
}
	