package Com.SauceDemo.TestClass;

import org.testng.annotations.Test;

import java.io.IOException;
import org.testng.Assert;


public class TC01_Validate_Login_Functionality extends TestBaseClass {

	@Test

	public void login_functionality() throws IOException, InterruptedException {

		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expextedUrl = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals( actualUrl, expextedUrl);
	}

}
