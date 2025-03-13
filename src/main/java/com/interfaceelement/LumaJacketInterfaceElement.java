package com.interfaceelement;

public interface LumaJacketInterfaceElement {
	//store all locators in string
	String signin_xpath = "(//a[normalize-space()='Sign In'])[1]";
	String username_id = "email";
	String passwword_css = "input#pass";
	String login_xpath = "//*[text()='Sign In']";
	String HomePageText_xpath = "(//*[text()='Home Page'])[2]";
	
	String women_xpath = "(//*[text()='Women'])";
	String top_linktext = "Tops";
	String jacket_id = "ui-id-11";
	String product_xpath = "(//a[normalize-space()='Juno Jacket'])";
	String productsize_id = "option-label-size-143-item-168";
	String product_color_xpath = "//div[@option-label='Green']";
	String product_qty= "//input[@name='qty']";
	String addtocart_xpath = "//button[@title='Add to Cart']";
	
	String showmycart_xpath = "//a[@class='action showcart']";
	String checkout_xpath = "//button[text()='Proceed to Checkout']";
	String email_xpath = "//input[@type = 'email']";
	//String firstname_xpath = "//input[@name = 'firstname']";
	//String lastname_xpath = "//input[@name = 'lastname']";
	//String streetaddress_xpath = "//input[@name = 'street[0]']";
	String nextorder_xpath = "//*[text()='Next']";
	String placeorder_xpath = "//*[text()='Place Order']";
	String thankyou_text_xpath ="//*[text()='Thank you for your purchase!']";
	
	String men_xpath = "(//*[text()='Men'])";
	String men_jacket_id = "ui-id-19";
	String menProduct_xpath = "(//a[normalize-space()='Montana Wind Jacket'])";
}
