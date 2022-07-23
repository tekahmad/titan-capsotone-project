package Page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObj extends Base {
	public RetailPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text() ='TEST ENVIRONMENT']")
	private WebElement retailPage;

	@FindBy(xpath = "//span[text() ='My Account']")
	private WebElement myAcoountPage;

	@FindBy(xpath = "//a[text() ='Login']")
	private WebElement loginButton;

	@FindBy(id = "input-email")
	private WebElement emailInputEl;

	@FindBy(id = "input-password")
	private WebElement passwordEl;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginOption;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement successMessage;
	
//	next scenario
	@FindBy(xpath = "//a[text()= 'Register for an affiliate account']")
	private WebElement AffiliateInformation;
	
	@FindBy (id = "input-company")
	private WebElement companyName;
	
	@FindBy (id = "input-website")
	private WebElement WebSiteInput;
	
	
	@FindBy (id = "input-tax")
	private WebElement taxInput;
	
	@FindBy (xpath = "(//div[@class= 'radio'])[1]")
	private WebElement chequepayee;
	
	@FindBy (xpath = "//div[@class= 'radio'])[2]")
	private WebElement paypal;
	
	@FindBy (xpath = "(//input[@type= 'radio'])[3]")
	private WebElement BankTransfer;
	
	@FindBy (id ="input-cheque")
	private WebElement ChequePayeeName;
	
	@FindBy (xpath = "//input[@type= 'checkbox']")
			private WebElement checkBox; 
	
	@FindBy (xpath = "//input[@class= 'btn btn-primary']")
	private WebElement ContinueButton;
	
	@FindBy (xpath = "//div[@class= 'alert alert-success alert-dismissible']")
	private WebElement verificationMesage;
//	NextScenario
	
	@FindBy(xpath = "//a[text () = 'Edit your affiliate information']")
	private WebElement affiliateinformation;
	
	@FindBy (xpath = "(//div[@class = 'radio']) [3]")
	private WebElement bankTransferRadioButton;
	
	@FindBy (id = "input-bank-name")
	private WebElement bankName;
	
	@FindBy (id = "input-bank-branch-number")
	private WebElement branchNumber;
	
	@FindBy (id = "input-bank-swift-code")
	private WebElement SwiftCode;
	
	@FindBy (id = "input-bank-account-name"		)
	private WebElement accountName;
	
	@FindBy (id = "input-bank-account-number")
	private WebElement accountNumber;
	
//	Next Scenario
	@FindBy (xpath = "//a[text() = 'Edit your account information'] ")
	private WebElement accountInformation;
	
	@FindBy (id = "input-firstname")
	private WebElement firstName;
	@FindBy(id = "input-lastname")
	private WebElement lastName;
	
	@FindBy (id = "input-email")
	private WebElement emailId;
	
	@FindBy (id = "input-telephone")
	private WebElement telephoneNumber;
	
	@FindBy( xpath = "//input[@value='Continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successmessage;
	

	


	public boolean testEnviromentText() {
		if (retailPage.isDisplayed())
			return true;
		else
			return false;
	}
	public void myAccounntPage() {
		myAcoountPage.click();
	}

	public void clickOnloginOption() {
		loginButton.click();
	}
	public void companyInput(String company) {
		companyName.sendKeys(company);
	}
	public void websiteInput(String website) {
		WebSiteInput.sendKeys(website);
	}
	public void taxInput(String tax) {
		taxInput.sendKeys(tax);
	}
	public void chequePayeeName(String chequePayee) {
		ChequePayeeName.sendKeys(chequePayee);
	}

public void emailInput (String email, String password){
	emailInputEl.sendKeys(email);
	passwordEl.sendKeys(password);
}
public void loginOptionEl() {
	loginOption.click();
}
public void successmessgaeConfirm() {
	successMessage.isDisplayed();


}
public void Affilliatepage() {
	AffiliateInformation.click();
	
}
	
public void chequePayeeName() {
		ChequePayeeName.sendKeys();
		
	}
public void aboutUsCheckBox() {
	checkBox.click();
}
public void ContinueButton() {
	ContinueButton.click();	
}
public void verificationMassage() {
	verificationMesage.isDisplayed();
	
}
public void affiliateInfofmationInput() {
	affiliateinformation.click();
	
}
public void bankTransferRadioButton() {
	if (!(BankTransfer.isSelected())){
		BankTransfer.click();
}}
public void bankfield(String bank) {
	bankName.clear();
	bankName.sendKeys(bank);
}
public void branchField(String branch) {
	branchNumber.clear();
	branchNumber.sendKeys(branch);
	
}
public void swiftField(String swift) {
	SwiftCode.clear();
	SwiftCode.sendKeys(swift);
}
public void accountNameField(String accountN) {
	accountName.clear();
	accountName.sendKeys(accountN);
}
public void accountNumberField(String accountNu) {
	accountNumber.clear();
	accountNumber.sendKeys(accountNu);
	
	
	
	
}
public void accountinformation() {
	accountInformation.click();
	
}
public void firstNamefield(String firstN) {
	firstName.clear();
	firstName.sendKeys(firstN);
}
public void lastNameField(String lastN) {
	lastName.clear();
	lastName.sendKeys(lastN);
}
public void emailField(String email) {
	emailId.clear();
	emailId.sendKeys(email);
}
public void telPhnoneField(String phone) {
	telephoneNumber.clear();
	telephoneNumber.sendKeys(phone);
	
}
public void continueButtonOption() {
	continuebutton.click();
	
}
public void successMessageField() {
	
	
}

	
}
