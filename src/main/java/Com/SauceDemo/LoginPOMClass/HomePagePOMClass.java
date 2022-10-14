package Com.SauceDemo.LoginPOMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass {

	private WebDriver driver;
	private Select s;
	private Actions act;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	public void clickMenuButton()
	{
		menuButton.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement aboutButton;
	
	public void clickAboutButton()
	{
		aboutButton.click();
	}
	
	@FindBy(xpath="//button[@id='react-burger-cross-btn']")
	private WebElement closeButton;
	
	public void clickCloseButton()
	{
		closeButton.click();
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filterDropdown;
	
	public boolean checkDisplayedOrNot()
	{
		boolean b=filterDropdown.isDisplayed();
		return b;
	}
	
	public void filterAtoZ()
	{
		filterDropdown.click();
		s.selectByValue("az");
	}
	
	public void filterZtoA()
	{
		filterDropdown.click();
		s.selectByValue("za");
	}
	
	public void filterLowtoHigh()
	{
		filterDropdown.click();
		s.selectByValue("lohi");
	}
	
	public void filterHightoLow()
	{
		filterDropdown.click();
		s.selectByValue("hilo");
	}
	
	public String getFilterDropdownText()
	{
		String b = filterDropdown.getText().substring(28,47);
		return b;
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> allProducts;

	public void clickAllProducts()
	{
		for(WebElement i : allProducts)
		{
			i.click();
		}
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement BackPack;
	
	public void clickBackPack()
	{
		BackPack.click();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement bikeLight;
	
	public void clickBikeLight()
	{
		bikeLight.click();
	}

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement boltTShirt;
	
	public void clickBoltTShirt()
	{
		boltTShirt.click();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement fleeceJacket;
	
	public void clickFleeceJacket()
	{
		fleeceJacket.click();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement oneSie;
	
	public void clickOneSie()
	{
		oneSie.click();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement tShirtRed;
	
	public void clicktTShirtRed()
	{
		tShirtRed.click();
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement clickcart;
	
	public void clickOnCart()
	{
		clickcart.click();
	}
	
	public boolean getTextOfCart()
	{
		boolean a = clickcart.getText().isEmpty();
		return a;
	}
	
	
	public boolean isAllProductsDisplayed()
	{
		boolean a= clickcart.isDisplayed();
		return a;
	}
	
	@FindBy(xpath="//span[text()='6']") private WebElement productsSelected;
	
	public String checkProductSelected()
	{
	String a=productsSelected.getText();
	
	return a;
	}
	
	public HomePagePOMClass(WebDriver driver)
    {
         this.driver=driver;
         PageFactory.initElements(driver,this);
         s = new Select(filterDropdown);
         act = new Actions(driver);
    }

}
