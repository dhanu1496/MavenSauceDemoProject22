package Com.SauceDemo.TestClass;

import Com.SauceDemo.LoginPOMClass.*;
import org.testng.annotations.Test;

import java.io.IOException;
import org.testng.Assert;


public class TC05_Validate_Product_Buy_Functionality extends TestBaseClass{
	@Test
	public void Product_Buy_Functionality() throws IOException, InterruptedException {

		HomePagePOMClass b = new HomePagePOMClass(driver);
		b.clickBackPack();
		log.info("BackPack added");
		b.clickBoltTShirt();
		log.info("Bolt T-shirt added");
		b.clickFleeceJacket();
		log.info("Fleece jacket added");

		b.clickOnCart();
		log.info("Click on cart");

		AddToCartPOMClass c = new AddToCartPOMClass(driver);
		c.clickRemoveBoltTShirt();
		log.info("BoltTShirt removed");

		c.clickCheckOutButton();
		log.info("Checkout button clicked");

		CheckOutpomClass d = new CheckOutpomClass(driver);
		d.sendFirstName("Dhanashri");
		log.info("Firstname Entered");
		d.sendLastName("Shinde");
		log.info("Lastname Entered");
		d.sendZipcode("414003");
		log.info("Zipcode entered");
	//	ScreenshotClass.takesScreenshot(driver, "DetailsOfCustomer");
		d.clickContinue();
		log.info("Continue buttun clicked");

		OverViewPOMClass e = new OverViewPOMClass(driver);
		e.clickOnFinish();
		log.info("Finish button clicked");

		LastPagePomClass f = new LastPagePomClass(driver);
		f.clickOnBackToHome();
		log.info("Back to Homepage button clicked");
	//	ScreenshotClass.takesScreenshot(driver, "Homepage");

		String actualTitle = driver.getTitle();
		log.info("Title of Homepage is = " + actualTitle);
		String expectedTitle = "Swag Labs";
		Assert.assertEquals(  actualTitle , expectedTitle);
	}
       

}
