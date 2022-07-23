package step.definition;

import Page.object.LaptopNoteBooksPageObject;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WebDriverUtilities;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject laptop = new LaptopNoteBooksPageObject();
	
	
	@When("User click on Laptop &NoteBook tab")
    public void user_click_on_laptop_note_book_tab() {
      laptop.laptopNotebookfield();
      logger.info("User clicked on Laptop and Notebook tab");
      WebDriverUtilities.takeScreenShot();
      
    }
    @When("User click on Show all Laptop &NoteBook option")
    public void user_click_on_show_all_laptop_note_book_option() {
        laptop.showAllItemsfield();
        logger.info("User clicked on Show all Laptop &NoteBook option");
        WebDriverUtilities.takeScreenShot();
        
    }
    @When("User click on MacBook item")
    public void user_click_on_mac_book_item() {
        laptop.macBookItem();;
        logger.info("User clicked on MacBook item");
        WebDriverUtilities.takeScreenShot();
        
    }
    @Then("User should see a message {string}")
    public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart(String string) {
        laptop.successMessegePage();
        logger.info("User saw a message ‘Success: You have added MacBook to your shopping cart!’");
        WebDriverUtilities.takeScreenShot();
        
    }
    @Then("User should see l item\\(s) {double} showed to the cart")
    public void user_should_see_l_item_s_showed_to_the_cart(Double double1) {
        laptop.dispalyItemField();
        logger.info("User saw number of items in to the cart");
        WebDriverUtilities.takeScreenShot();
    }
    @Then("User click on cart option")
    public void user_click_on_cart_option() {
      laptop.cartOptionfield();
      logger.info("User clicked on cart option");
      WebDriverUtilities.takeScreenShot();
    }
    @Then("user click on red X button to remove the item from cart")
    public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
        laptop.redButtonfield();
        logger.info("user clicked on red X button to remove the item from cart");
        WebDriverUtilities.takeScreenShot();
        
    }
    @Then("item should be removed and cart should show o item\\(s)")
    public void item_should_be_removed_and_cart_should_show_o_item_s() {
       laptop.cartDisplayedFiled();
       logger.info("item removed from cart )");
       WebDriverUtilities.takeScreenShot();
       
    }
    @When("User click on product comparison icon on {string}")
    public void user_click_on_product_comparison_icon_on(String string) {
       laptop.macBookIcon();
       logger.info("User clicked on product comparison icon on ‘MacBook’");
       WebDriverUtilities.takeScreenShot();
       
    }
    @When("User click on product comparison icon on ‘MacBook Air")
    public void user_click_on_product_comparison_icon_on_mac_book_air() {
        laptop.macbookAiricon();
        logger.info("User clicked on product comparison icon on ‘MacBook Air");
        WebDriverUtilities.takeScreenShot();
        
    }
    @Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
    public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
       laptop.messageField();
    }
    @Then("User click on Product comparison link")
    public void user_click_on_product_comparison_link() {
       laptop.comparisonLink();
       logger.info("User clicked on Product comparison link");
       WebDriverUtilities.takeScreenShot();
    }
    @Then("User should see Product Comparison Chart")
    public void user_should_see_product_comparison_chart() {
        laptop.productChart();
        logger.info("User saw the Product Comparison Chart");
        
    }
    @When("User click on heart icon to add {string} laptop to wish list")
    public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
        laptop.heartIconOption();
        logger.info("User clicked on heart icon to add {string} laptop to wish list");
        WebDriverUtilities.takeScreenShot();
        
    }
    @Then("User should get a message {string}")
    public void user_should_get_a_message(String string) {
        laptop.getMessagePortion();
        logger.info("User got the message");
        WebDriverUtilities.takeScreenShot();
        
    }
    @When("User click on MacBook Pro item")
    public void user_click_on_mac_book_pro_item() {
        laptop.macbookProModel();
        logger.info("User clicked on ‘MacBook Pro’ item");
        WebDriverUtilities.takeScreenShot();
        
    }
    @Then("User should see {string} price tag is present on UI")
    public void user_should_see_price_tag_is_present_on_ui(String string) {
        laptop.priceTagOptoin();
        logger.info("User saw the price tag is present on UI");
        WebDriverUtilities.takeScreenShot();
        
    }
	
	
}
	
	