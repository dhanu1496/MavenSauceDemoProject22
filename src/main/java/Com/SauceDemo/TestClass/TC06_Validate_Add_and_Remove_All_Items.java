package Com.SauceDemo.TestClass;

import Com.SauceDemo.LoginPOMClass.AddToCartPOMClass;
import Com.SauceDemo.LoginPOMClass.HomePagePOMClass;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Assert;


public class TC06_Validate_Add_and_Remove_All_Items extends TestBaseClass{
	

	@Test
	public void Add_and_Remove_All_Items() throws IOException {

		HomePagePOMClass b = new HomePagePOMClass(driver);
		b.clickAllProducts();
	//	ScreenshotClass.takesScreenshot(driver, "AddedProducts");
		log.info("All products are added");
		boolean actualResult = b.isAllProductsDisplayed();
		boolean expectedResult = true;
		b.clickOnCart();
		log.info("Clicked on cart");
		AddToCartPOMClass c = new AddToCartPOMClass(driver);
		c.removeButton();
		log.info("All items removed");
	//	ScreenshotClass.takesScreenshot(driver, "ProductsRemoved");

		boolean actualResult1 = b.getTextOfCart();
		log.info(b.getTextOfCart());
		boolean expectedResult1 = true;
		Assert.assertEquals(actualResult, expectedResult);
		Assert.assertEquals(actualResult1, expectedResult1);
	}
		

}
