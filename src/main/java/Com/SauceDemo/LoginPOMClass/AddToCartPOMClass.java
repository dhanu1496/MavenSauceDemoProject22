package Com.SauceDemo.LoginPOMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPOMClass {

	private WebDriver driver;

	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
	private WebElement backpack;

	public void clickRemoveBackpack() {
		backpack.click();
	}

	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
	private WebElement boltTshirt;

	public void clickRemoveBoltTShirt() {
		boltTshirt.click();
	}

	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']")
	private WebElement fleeceJacket;

	public void clickRemoveFleeceJacket() {
		 fleeceJacket.click();
	}

	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")
	private WebElement oneSie;

	public void clickRemoveOneSie() {
		 oneSie.click();
	}

	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
	private WebElement redTshirt;

	public void clickRemoveredTshirt() {
		 redTshirt.click();
	}

	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
	private WebElement bikeLight;

	public void clickRemoveBikeLight() {
		 bikeLight.click();
	}
	
	@FindBy(xpath = "//button[@class='btn btn_secondary btn_small cart_button']")
	private List<WebElement> removeAll;

	public void removeButton() 
	{
		for(WebElement i : removeAll)
		 i.click();
	}
	

	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkout;

	public void clickCheckOutButton() 
	{
		checkout.click();
	}

	
	@FindBy(xpath = "//button[@id='continue-shopping']")
	private WebElement continueShopping;


	public void clickOnContinueShopping() {
		continueShopping.click();
	}

	
	public AddToCartPOMClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
