package Page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopNotbookTab;
	
	@FindBy (xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllOption;
	
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement macBookOption;
	
	@FindBy (xpath ="//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement addToCartOption;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successmessage;
	
	@FindBy (id = "cart-total")
	private WebElement showedItemCart;
	
	@FindBy (xpath ="//h1[text()='MacBook']")
	private WebElement showedItem;
	
	@FindBy(xpath = "//a[text()='shopping cart']")
	private WebElement shopingCart;
	
	@FindBy (xpath = "//button[@class='btn btn-danger']")
	private WebElement redButton;
	
	@FindBy (id = "content")
	private WebElement noItem;
//	Next scenario
	@FindBy(xpath = "(//button[@type='button' and @data-toggle='tooltip'])[6]")
	private WebElement comparisonIcon;
	
	@FindBy (xpath = "(//button[@type='button' and @data-toggle='tooltip'])[8]")
	private WebElement macAirComparison;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible'] ")
	private WebElement successMessage;
	
	@FindBy (xpath = "//a[text()='product comparison']")
	private WebElement comaprisonLink;
	
	@FindBy (id = "content")
	private WebElement comparisonChart;
	
	@FindBy (xpath = "(//button[@type='button' and @data-toggle='tooltip'])[11]")
	private WebElement heartIcon;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement getMessage;
	
	@FindBy (xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProItem;
	
	@FindBy (xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement priceTag;
	
	{

}
	public void laptopNotebookfield() {
		laptopNotbookTab.click();
	}
	public void showAllItemsfield() {
		showAllOption.click();
	}
	public void macBookItem() {
		macBookOption.click();	
	}
	public boolean successMessegePage() {
		if(successmessage.isDisplayed()){
			return true;
		}
		else
			return false;
		
	}
	public boolean dispalyItemField() {
		if(showedItem.isDisplayed()) {
			return true;
		}
		else
			return false;
		
	}
	public void cartOptionfield() {
		shopingCart.click();
	}
	public void redButtonfield() {
		redButton.click();
	}
	public boolean cartDisplayedFiled() {
		if(noItem.isDisplayed()) {
			return true;
		}
		else 
			return false;
		
	}
	public void macBookIcon() {
		comparisonIcon.click();
		
	}
	public void macbookAiricon() {
		macAirComparison.click();	
	}
	public void messageField() {
		successMessage.isDisplayed();
	}
	public void comparisonLink() {
		comaprisonLink.click();
	}
	public boolean productChart() {
		if(comparisonChart.isDisplayed()) {
			return true;
		}
		else
			return false;
		
	}
	public void heartIconOption() {
		heartIcon.click();	
	}
	public boolean getMessagePortion() {
		if(getMessage.isDisplayed()) {
			return true;
		}
		else
			return false;
		
	}
	public void macbookProModel() {
		macBookProItem.click();	
	}
	public boolean priceTagOptoin() {
		if(priceTag.getText().equals("$2,000.00")) {
			return true;
		}
		else
			
			return false;
		
	}
	
	}

