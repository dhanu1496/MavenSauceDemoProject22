package Com.SauceDemo.TestClass;

import Com.SauceDemo.LoginPOMClass.HomePagePOMClass;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Assert;

public class TC07_Validate_About_Page_Functionality extends TestBaseClass{

	@Test
	public void About_Page_Functionality() throws IOException {

		HomePagePOMClass b = new HomePagePOMClass(driver);
		b.clickMenuButton();
		b.clickAboutButton();
	//	ScreenshotClass.takesScreenshot(driver, "AboutPage");
		log.info("About page is open");
		String actualTitle = driver.getTitle();
		log.info("Title of aboutpage is = " + actualTitle);
		String expectedTitle = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
       
}
