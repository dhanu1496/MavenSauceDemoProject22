package Com.SauceDemo.TestClass;

import Com.SauceDemo.LoginPOMClass.HomePagePOMClass;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Assert;


public class TC03_Validate_Add_To_Cart_Functionality extends TestBaseClass{
	
	@Test
	public void Add_To_Cart_Functionality() throws IOException {
	//	ScreenshotClass.takesScreenshot(driver, "Homepage");
		HomePagePOMClass b = new HomePagePOMClass(driver);
//	         b.clickBackPack();
//	         b.clickBikeLight();
//	         b.clickBoltTShirt();
//	         b.clickFleeceJacket();
//	         b.clickOneSie();
//	         b.clicktTShirtRed();

		b.clickAllProducts();
	//	ScreenshotClass.takesScreenshot(driver, "BagProducts");
		String expectedProductSelected = "6";
		HomePagePOMClass d = new HomePagePOMClass(driver);
		String actualProductSelected = d.checkProductSelected();
		Assert.assertEquals( actualProductSelected, expectedProductSelected);
		
	}
		

}
