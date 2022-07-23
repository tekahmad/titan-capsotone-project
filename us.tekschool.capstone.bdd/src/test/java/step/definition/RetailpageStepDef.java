package step.definition;

import java.util.List;
import java.util.Map;

import Page.object.RetailPageObj;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.WebDriverUtilities;

public class RetailpageStepDef extends Base {
	RetailPageObj retail = new  RetailPageObj();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(retail.testEnviromentText());
		logger.info("User is on retial page");
		
	}

	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
		logger.info("userclicked");
		retail.myAccounntPage();
	    this.sleep();
	}

	@When("User click on Login")
	public void user_click_on_login() {
		logger.info("clicked on loginPage");
	    retail.clickOnloginOption();
	    this.sleep();
	}

	@When("User enter username ‘username’ and password 'pass’")
	public void user_enter_username_and_password() {
		logger.info("email and passowored entered ");
		this.sleep();
	    retail.emailInput("7777@bbc.com", "7777");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	retail.loginOptionEl();
	this.sleep();
	    
	}
	@Then ("User should be logged in to MyAccount dashboard")
	public void _then_user_should_be_logged_in_to_my_account_dashboard() {
		retail.successmessgaeConfirm();
		this.sleep();
	}
//	Next scenario
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retail.Affilliatepage();  
		this.sleep();
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable datatable) {
	  List<Map<String, String>> information = datatable.asMaps(String.class, String.class);
	  retail.companyInput(information.get(0).get("company"));
	  this.sleep();
	  retail.websiteInput(information.get(0).get("website"));
	  this.sleep();
	  retail.taxInput(information.get(0).get("taxID"));
	  this.sleep();
	  retail.chequePayeeName(information.get(0).get("payeeName"));

	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box_() {
		 this.sleep();
		retail.aboutUsCheckBox();
	   
	}
	@And( "User click on Continue button")
	public void and_user_click_on_continue_button() {
		 this.sleep();
		retail.ContinueButton();
		
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		 this.sleep();
		retail.verificationMassage();
	    
	}
	public void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retail.affiliateInfofmationInput();
	 
	}
	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.bankTransferRadioButton();
		logger.info("user clicked on bank transfer radio button");
	    
	}
	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String,String>>bankInformation = dataTable.asMaps(String.class,String.class);
		retail.bankfield(bankInformation.get(0).get("bankName"));
		retail.branchField(bankInformation.get(0).get("abaNumber"));
		retail.swiftField(bankInformation.get(0).get("swiftCode"));
		retail.accountNameField(bankInformation.get(0).get("accountName"));
		retail.accountNumberField(bankInformation.get(0).get("accountNumber"));
		logger.info("user filled bank infomation with given information");
		WebDriverUtilities.takeScreenShot();
		this.sleep();
		
		
		
	}
	@When ("User click on ‘Edit your account information’ link")
	public void user_click_on_Edit_your_account_information_link() {
		retail.accountinformation();
		logger.info("user clicked on edit your information");
		
		
	}
		@And ("User modify below information")
		public void user_modify_below_information(DataTable datatable) {
			List<Map<String,String>>editInformation=datatable.asMaps(String.class,String.class);
			retail.firstNamefield(editInformation.get(0).get("firstname"));
			retail.lastNameField(editInformation.get(0).get("lastName"));
			retail.emailField(editInformation.get(0).get("email"));
			retail.telPhnoneField(editInformation.get(0).get("telephone"));
			
			
}
		@Then("User should see a success message {string}")
		public void user_should_see_a_success_message(String string) {
		retail.verificationMassage();
		}

		
}