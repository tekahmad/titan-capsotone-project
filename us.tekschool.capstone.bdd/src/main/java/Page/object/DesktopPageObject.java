package Page.object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text() = 'TEST ENVIRONMENT'] ")
	private WebElement environmentField;

	@FindBy(xpath = "//a[text()= 'Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()= 'Show All Desktops']")
	private WebElement showAlldesktoTab;

	@FindBy(tagName = "img")
	private List<WebElement> allItems;
//	nest scenario

	@FindBy(xpath = "(//span[text()='Add to Cart']) [3]")
	private WebElement addToCard;

	@FindBy(xpath = "//input[@id= 'input-quantity']")
	private WebElement quantity;

	@FindBy(xpath = "//button[@id= 'button-cart']")
	private WebElement addtoCardOption;

	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successmessage;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement canonAddToCart;

	@FindBy(xpath = "//option[@value='15']")
	private WebElement colorDropDown;

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement CanonCamera;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement clickReview;

	@FindBy(id = "input-name")
	private WebElement name;

	@FindBy(id = "input-review")
	private WebElement comment;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> reviewList;

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continuebutton;

	@FindBy(xpath = "//div [@class='alert alert-success alert-dismissible']")
	private WebElement message;

	
	
	
	
	
	
	public void testEnvironement() {
		environmentField.isDisplayed();
	}

	public void desktopPage() {
		desktopTab.click();
	}

	public void desktopsShowElement() {
		showAlldesktoTab.click();
	}

	public List<WebElement> showItems() {
		List<WebElement> deskItem = allItems;
		return deskItem;
	}

	public void addtoCardOptionHPLP3065Item() {
		addToCard.click();
	}

	public void selectQuantity(String unit) {
		quantity.clear();
		quantity.sendKeys(unit);

	}

	public void addToCatButton() {
		addtoCardOption.click();
	}

	public void successmessageOption() {
		Assert.assertTrue(successmessage.isDisplayed());

	}

	public void addToCartCanon() {
		canonAddToCart.click();

	}

	public void colorDropdownCamera() {
		colorDropDown.click();

	}

	public void CanonEOS5Ditem() {
		CanonCamera.click();

	}

	public void clickReviewLink() {
		clickReview.click();

	}

	public void namefield(String nameInput) {
		name.sendKeys(nameInput);
	}

	public void comments(String commentsInput) {
		comment.sendKeys(commentsInput);
	}

	public void rating(String RattingNumber) {
		for (WebElement element : reviewList) {
			if (element.getAttribute("value").equalsIgnoreCase(RattingNumber.trim())) {
				element.click();
				break;
			}
		}
	}

	public void continueButton() {
		continuebutton.click();

	}

	public void messageReview() {
		message.isDisplayed();

	}

}
