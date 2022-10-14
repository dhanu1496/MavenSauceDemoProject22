package Com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import Com.SauceDemo.LoginPOMClass.LoginPOMClass;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;




public class TestBaseClass {
 Logger log = Logger.getLogger("MavenSauceDemoProject");
	WebDriver driver;
	
	@Parameters("browserName")
	 @BeforeMethod

	    public void setUp(String browserName ) throws IOException, InterruptedException {
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\MavenSauceDemoProject\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\IdeaProjects\\MavenSauceDemoProject\\Drivers\\geckodriver.exe");

		driver = new FirefoxDriver();}
		else
		{
			log.info("Show exception");
		}

		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		log.info("URL opened");
	//	ScreenshotClass.takesScreenshot(driver, "LoginPage");
		LoginPOMClass a = new LoginPOMClass(driver);
		a.sendUsername();
		log.info("Username entered");
		a.sendPassword();
		log.info("Password entered");
		a.clickOnLoginButton();
		log.info("Login button clicked");
		log.info("Homepage open");
		Thread.sleep(10000);
	//	ScreenshotClass.takesScreenshot(driver, "HomePage");
	}
	 
	 @AfterMethod
		public void tearDown()
		{
		driver.close();
		log.info("Browse window is closed");
		log.info("End of program");
		}
}
