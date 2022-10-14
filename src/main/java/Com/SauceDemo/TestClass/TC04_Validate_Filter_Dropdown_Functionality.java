package Com.SauceDemo.TestClass;

import Com.SauceDemo.LoginPOMClass.HomePagePOMClass;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Assert;


public class TC04_Validate_Filter_Dropdown_Functionality extends TestBaseClass {
@Test

	public void Filter_Dropdown_Functionality() throws IOException {

		HomePagePOMClass b = new HomePagePOMClass(driver);
		b.filterLowtoHigh();
	//	ScreenshotClass.takesScreenshot(driver, "FilterText");
		log.info("Price low to high filter is selected");
		String expectedResult1 = "Price (low to high)";
		b.checkDisplayedOrNot();
		String actualResult1 = b.getFilterDropdownText();
		log.info(b.getFilterDropdownText());
		boolean actualResult = b.checkDisplayedOrNot();
		log.info(actualResult);
		boolean ExpectedResult = true;
		Assert.assertEquals( actualResult, ExpectedResult);
		Assert.assertEquals( actualResult1, expectedResult1);
	}

}
