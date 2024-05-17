package lumapom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import lumabase.Baseclass;

   public class Login  {
	
	public static WebDriver driver;
	
	@FindBy(linkText = "Sign In")
	private WebElement Signin;
	
	@FindBy(name = "login[username]")
	private WebElement mail;
	
	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(id = "send2")
	private WebElement signinbtn;
	
	@FindBy(xpath = "(//a[@class='level-top ui-corner-all'])[1]")
	private WebElement whatsnew;
	
	@FindBy(linkText = "Jackets")
	private WebElement jackets;
	
	@FindBy(xpath = "(//a[@class='product-item-link'])[2]")
	private WebElement junojacket;
	
	@FindBy(xpath = "//div[@id='option-label-size-143-item-168']")
	private WebElement size;
	
	@FindBy(xpath = "//div[@id='option-label-color-93-item-57']")
	private WebElement colour;
	
	@FindBy(xpath = "//input[@class='input-text qty']")
	private WebElement qty;
	
	@FindBy(xpath = "//button[@id='product-addtocart-button']")
	private WebElement cart;
	
	public Login (WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

//	public static WebDriver getDriver() {
//		return driver;
//	}

	public WebElement getSignin() {
		return Signin;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	public WebElement getWhatsnew() {
		return whatsnew;
	}

	public WebElement getJackets() {
		return jackets;
	}

	public WebElement getJunojacket() {
		return junojacket;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getCart() {
		return cart;
	}
	




}