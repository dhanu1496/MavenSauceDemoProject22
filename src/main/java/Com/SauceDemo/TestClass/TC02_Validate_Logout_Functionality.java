package Com.SauceDemo.TestClass;

import Com.SauceDemo.LoginPOMClass.HomePagePOMClass;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Assert;


public class TC02_Validate_Logout_Functionality extends TestBaseClass{
	
	@Test
	public void Logout_Functionality() throws IOException {
		HomePagePOMClass b = new HomePagePOMClass(driver);
		b.clickMenuButton();
		log.info("Menu button clicked");
		b.clickLogoutButton();
		log.info("Logout button clicked");
		log.info("Login page open");
	//	ScreenshotClass.takesScreenshot(driver,"Loginpage");
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expextedUrl = "https://www.saucedemo.com/";
		Assert.assertEquals( actualUrl, expextedUrl);
	}
	
	}


