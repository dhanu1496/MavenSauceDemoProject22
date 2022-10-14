package Com.SauceDemo.LoginPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastPagePomClass {

private WebDriver driver;
    
	public WebDriver webDriverWarningRemove()
	{		
		return driver;		
	}
	
    //2
	@FindBy(xpath="//button[@id='back-to-products']") private WebElement backHome; 
    //2.1
	public void clickOnBackToHome()
	{
		backHome.click();
	}
    
	public LastPagePomClass (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
