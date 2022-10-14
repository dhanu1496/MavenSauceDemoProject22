package Com.SauceDemo.LoginPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverViewPOMClass {
	private WebDriver driver;

	public WebDriver webDriverWarningRemove()
	{		
		return driver;		
	}
	
	//2
	//finish
	@FindBy(xpath="//button[@id='finish']") private WebElement finish;
    //2.1
	public void clickOnFinish()
	{
		finish.click();
	}
	
	//3
	@FindBy(xpath="//button[@id='cancel']") private WebElement cancel;
    //3.1
	public void clickOnCancel()
	{
		cancel.click();
	}
	
	//4
   public OverViewPOMClass (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
