package step.definition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import Page.object.DesktopPageObject;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.WebDriverUtilities;

public class DesktopPageStepDefinition extends Base {

	DesktopPageObject desktopPage = new DesktopPageObject();

//	@Given ("User is on Retail website")
//	public void user_is_on_Retail_website() {
//		desktopPage.testEnvironement();
//		logger.info("user exist on retail Website");
//	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPage.desktopPage();
		logger.info("user clicked on desktopTab");
		waitings();

	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPage.desktopsShowElement();
		logger.info("user clicked on show all items");
		WebDriverUtilities.takeScreenShot();

	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopItems = desktopPage.showItems();
		for (WebElement items : desktopItems) {
			Assert.assertTrue(items.isDisplayed());
			logger.info("checking all items are present");
			WebDriverUtilities.takeScreenShot();

		}

	}

	@Then("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopPage.addtoCardOptionHPLP3065Item();
		logger.info("user clicked add to card");
		WebDriverUtilities.takeScreenShot();

	}

	@Then("User select quantity {string}")
	public void user_select_quantity(String int1) {
		desktopPage.selectQuantity(int1);
		waitings();
	}

	@Then("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.addToCatButton();
		waitings();
		logger.info("user clicked to cart button");

	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
		desktopPage.successmessageOption();
		waitings();
		logger.info("success message add to shoping cart");

	}

	@Then("User click ADD TO CART option on Canon EOS5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopPage.addToCartCanon();
		logger.info("added to cart canon item");
		

	}

	@Then("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPage.colorDropdownCamera();
		logger.info("user clikced the red color");
		

	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {

	}

	@Then("User click on Canon EOS5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPage.CanonEOS5Ditem();
		logger.info("clicked of canonEOSS5D");
	waitings();
	}

	@Then("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.clickReviewLink();
		waitings();
	}

	@Then("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable datatable) {
		List<Map<String, String>> reviewInformation= datatable.asMaps(String.class, String.class);
		desktopPage.namefield(reviewInformation.get(0).get("yourName"));
		desktopPage.comments(reviewInformation.get(0).get("yourReview"));
		waitings();
		desktopPage.rating(reviewInformation.get(0).get("Rating"));
		waitings();
	}

	@Then("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPage.continueButton();
		waitings();

	}
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		desktopPage.messageReview();
		waitings();
	}
}
