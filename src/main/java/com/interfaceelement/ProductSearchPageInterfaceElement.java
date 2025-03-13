package com.interfaceelement;

public interface ProductSearchPageInterfaceElement {
	String men_xpath = "(//*[text()='Men'])";
	String top_linktext = "Tops";
	String jacket_id = "ui-id-19";
	String product_xpath = "(//a[normalize-space()='Montana Wind Jacket'])";
	String productsize_id = "option-label-size-143-item-170";
	String product_color_xpath = "//div[@option-label='Green']";
	String product_qty= "//input[@name='qty']";
	String addtocart_xpath = "//button[@title='Add to Cart']";
	String showmycart_xpath = "//a[@class='action showcart']";
	String checkout_xpath = "//button[text()='Proceed to Checkout']";
	String email_xpath = "//input[@type = 'email']";
	String firstname_xpath = "//input[@name = 'firstname']";
	String lastname_xpath = "//input[@name = 'lastname']";
	String streetaddress_xpath = "//input[@name = 'street[0]']";
	String nextorder_xpath = "//span[text()='Next']";
	String placeorder_xpath = "//*[text()='Place Order']";
	
	
}
