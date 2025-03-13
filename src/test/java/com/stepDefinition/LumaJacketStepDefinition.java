package com.stepDefinition;

import com.base.Base_Class;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LumaJacketStepDefinition extends Base_Class {
	PageObjectManager pageObjectManager = new PageObjectManager();
	
	@Given("User open the url in browser")
	public void user_open_the_url_in_browser() {
	  launchBrowser(pageObjectManager.getFileReaderManager().getDataProperty("browser"));
	  launchUrl(pageObjectManager.getFileReaderManager().getDataProperty("url"));
	}

	@When("User click the signIn button")
	public void user_click_the_sign_in_button() {
		pageObjectManager.getlumaJacket().signInMethod();
	}

	/*
	 * @Then("User navigates to the login page {string}") public void
	 * user_navigates_to_the_login_page(String string) {
	 * 
	 * }
	 */
	@When("User enters username {string} in the Username field")
	public void user_enters_username_in_the_username_field(String userName) {
		pageObjectManager.getlumaJacket().enterUsername(userName);
	}

	@When("User enters password {string} in the Password field")
	public void user_enters_password_in_the_password_field(String pwd) {
		pageObjectManager.getlumaJacket().enterPassword(pwd);
	}

	@Then("User move on Men")
	public void user_move_on_men() {
		pageObjectManager.getlumaJacket().moveOnMen();
	}

	@When("User select Montana Wind Jacket")
	public void user_select_montana_wind_jacket() {
		pageObjectManager.getlumaJacket().selectMenProduct();
	}

	@When("User clicks the SignIn button")
	public void user_clicks_the_sign_in_button() {
		pageObjectManager.getlumaJacket().enterLoginButton();
	}

	@Then("User navigates to the home page {string}")
	public void user_navigates_to_the_home_page(String string) {
		pageObjectManager.getlumaJacket().validateHomePageText(string);
		System.out.println("validation successful");
	}

	@When("User move on women")
	public void user_move_on_women() {
		pageObjectManager.getlumaJacket().moveOnWomen();
	}

	@When("User move on tops")
	public void user_move_on_tops() {
		pageObjectManager.getlumaJacket().moveOnTops();
	}

	@When("User move on jackets")
	public void user_move_on_jackets() {
		pageObjectManager.getlumaJacket().moveOnJackets();
	}
	@Then("User move on mens jackets")
	public void user_move_on_mens_jackets() {
		pageObjectManager.getlumaJacket().moveOnMensJacket();
	}


	/*
	 * @Then("User should be redirect to the product page") public void
	 * user_should_be_redirect_to_the_product_page() { // Write code here that turns
	 * the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

	@When("User select juno jacket")
	public void user_select_juno_jacket() {
		pageObjectManager.getlumaJacket().selectProduct();
	}

	@When("User clicks size M")
	public void user_clicks_size_m() {
		pageObjectManager.getlumaJacket().selectSize();
	}

	@When("User clicks green color")
	public void user_clicks_green_color() {
		pageObjectManager.getlumaJacket().selectColor();
	}

	@When("User clicks Add To Cart button")
	public void user_clicks_add_to_cart_button() {
		pageObjectManager.getlumaJacket().clickAddToCart();
	}

	@When("User clicks the shopping cart icon")
	public void user_clicks_the_shopping_cart_icon() throws InterruptedException {
		pageObjectManager.getlumaJacket().clickShoppingCartIcon();
	}

	@When("User clicks proceed to checkout button")
	public void user_clicks_proceed_to_checkout_button() throws InterruptedException {
		pageObjectManager.getlumaJacket().clickCheckOut();
	}

	/*
	 * @Then("User redirect to the Order Page") public void
	 * user_redirect_to_the_order_page() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 */

	@When("User clicks on Next button")
	public void user_clicks_on_next_button() throws InterruptedException {
		pageObjectManager.getlumaJacket().clickNext();
	}

	/*
	 * @Then("User should redirect to the Payment Page") public void
	 * user_should_redirect_to_the_payment_page() { // Write code here that turns
	 * the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

	@When("User clicks the Place Order button")
	public void user_clicks_the_place_order_button() throws InterruptedException {
		pageObjectManager.getlumaJacket().placeOrder();
	}

	@Then("User redirect to the Thank you for your purchase page")
	public void user_redirect_to_the_thank_you_for_your_purchase_page() {
		pageObjectManager.getlumaJacket().validateThankYou();
	}
}
