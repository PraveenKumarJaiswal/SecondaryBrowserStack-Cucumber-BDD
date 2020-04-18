package Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseClass {

    public WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException, IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resource\\data.properties");
        prop.load(fis);

        String browserName = prop.getProperty("browser");
        System.out.println(browserName);

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
            driver = new ChromeDriver();
        }

        else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", prop.getProperty("Firefox"));
            driver = new FirefoxDriver();

        }

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        return driver;
    }

}
