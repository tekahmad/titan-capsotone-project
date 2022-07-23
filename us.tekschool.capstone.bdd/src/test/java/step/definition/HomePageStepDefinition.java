package step.definition;

import Page.object.HomePageObject;
import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePageStepDefinition extends Base {
	HomePageObject homepage = new HomePageObject();


@When("User click on Currency")
public void user_click_on_currency() {
	homepage.currencyOption();
	logger.info("user clicked on Currency");
	waitings();
    
}

@When("User Chose Euro from dropdown")
public void user_chose_euro_from_dropdown() {
	homepage.euroDropDown();
	logger.info("user chosed euro from dropdown");
	waitings();
	
}

@Then("currency value should change to Euro")
public void currency_value_should_change_to_euro() {
    
}
@When("User click on shopping cart")
public void user_click_on_shopping_cart() {
	homepage.shopingCartOption();
	logger.info("user clicked on shoping caart");
	waitings();
	
   
}

@Then("“Your shopping cart is empty!” message should display")
public void your_shopping_cart_is_empty_message_should_display() {
	homepage.empytShopingCart();
	logger.info("empty message should be dispayed ");
	waitings();

    
}
}
