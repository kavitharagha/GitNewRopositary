package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelement.ProductSearchPageInterfaceElement;
import com.utility.FileReaderManager;

public class ProductSearchPage extends Base_Class implements ProductSearchPageInterfaceElement {
	@FindBy(xpath = men_xpath)
	static WebElement men;
	@FindBy(linkText = top_linktext)
	static WebElement top;
	@FindBy(id = jacket_id)
	static WebElement jacket;
	@FindBy(xpath = product_xpath)
	static WebElement product;
	@FindBy(id = productsize_id)
	static WebElement size;
	@FindBy(xpath = product_color_xpath)
	static WebElement color;
	@FindBy(xpath = product_qty)
	static WebElement qty;
	@FindBy(xpath = addtocart_xpath)
	static WebElement addToCart;
	@FindBy(xpath = showmycart_xpath)
	static WebElement showMyCart;
	@FindBy(xpath = checkout_xpath)
	static WebElement checkOut;
	@FindBy(xpath = email_xpath)
	static WebElement email;
	@FindBy(xpath = firstname_xpath)
	static WebElement firstName;
	@FindBy(xpath = lastname_xpath)
	static WebElement lastName;
	@FindBy(xpath = streetaddress_xpath)
	static WebElement address;
	@FindBy(xpath = nextorder_xpath)
	static WebElement next;
	@FindBy(xpath = placeorder_xpath)
	static WebElement placeOrder;
	
	public ProductSearchPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void productSearch() {
		FileReaderManager fileReader = new FileReaderManager();
		implicitlyWait(30,"seconds");
		moveToElement(men);
		implicitlyWait(30,"seconds");
		moveToElement(top);
		implicitlyWait(30,"seconds");
		clickElement(jacket);
		clickElement(product);
		clickElement(size);
		clickElement(color);
		passInput(qty, fileReader.getDataProperty("qty"));
		clickElement(addToCart);
		clickElement(showMyCart);
		clickElement(checkOut);
		//passInput(firstName, fileReader.getDataProperty("firstname"));
		//passInput(lastName, fileReader.getDataProperty("lastname"));
		//passInput(address, fileReader.getDataProperty("address"));
	//	javascriptExecutorClick(next);
	//	javascriptExecutorClick(placeOrder);
	}

}
