package com.stepDefinition;

import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LumaGearStepDefinition {
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	
	@Then("User move on Gear")
	public void user_move_on_gear() {
		pageObjectManager.getLumaGear().moveOnGear();
	}

	@Then("User move on Bags")
	public void user_move_on_bags() {
		pageObjectManager.getLumaGear().clickOnBags();
	}

	@When("User click on Overnight Duffle")
	public void user_click_on_overnight_duffle() {
		pageObjectManager.getLumaGear().clickOnOvernightDuffle();
	}

	/*
	 * @When("verify product page displayed") public void
	 * verify_product_page_displayed() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 */

	@When("User enters qty {string}")
	public void user_enters_qty(String bagsQty) {
		pageObjectManager.getLumaGear().selectQty(bagsQty);
	}






}
