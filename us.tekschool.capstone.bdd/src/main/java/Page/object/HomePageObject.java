package Page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currency;
	
	@FindBy (xpath="//button[text()='€ Euro']")
	private WebElement Euro;
	
	@FindBy (xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement shopingCart;
	
	@FindBy (xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement emptyShopingCart;



public void currencyOption() {
	currency.click();
	
}
public void euroDropDown() {
	Euro.click();
}
public void shopingCartOption() {
	shopingCart.click();
}
public void empytShopingCart() {
	emptyShopingCart.click();
	
	
}
}