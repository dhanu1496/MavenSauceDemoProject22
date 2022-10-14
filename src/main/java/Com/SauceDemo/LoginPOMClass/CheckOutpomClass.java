package Com.SauceDemo.LoginPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutpomClass {
private WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']") private WebElement firstName;
    
	public String sendFirstName(String a)
	{
		String b=a;
		firstName.sendKeys(b);
		return b;
	}
	
	@FindBy(xpath="//input[@id='last-name']") private WebElement lastName;

	public String sendLastName(String a)
	{
		String b=a;
		lastName.sendKeys(b);
		return b;
	}
	
	
	@FindBy(xpath="//input[@id='postal-code']") private WebElement zip_PostalCode;
	
	public String sendZipcode(String a)
	{
		String b=a;
		zip_PostalCode.sendKeys(b);
		return b; 
	}
	
	
	@FindBy(xpath="//input[@id='continue']") private WebElement continuE;
	//5.1
	public void clickContinue()
	{
		continuE.click();
	}				
	
	
	@FindBy(xpath="//button[@id='cancel']") private WebElement cancel;
	
	public void clickOnCancel()
	{
		cancel.click();
	}		
	
	public CheckOutpomClass (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
