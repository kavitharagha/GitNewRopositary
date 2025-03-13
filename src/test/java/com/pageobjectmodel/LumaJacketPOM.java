package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelement.LumaJacketInterfaceElement;
import com.utility.FileReaderManager;

public class LumaJacketPOM extends Base_Class implements LumaJacketInterfaceElement{
	@FindBy(xpath = signin_xpath)
	private WebElement signIn;
	@FindBy(id = username_id)
	private WebElement userName;
	@FindBy(css = passwword_css)
	private WebElement password;
	@FindBy(xpath = login_xpath)
	private WebElement login;
	@FindBy(xpath = HomePageText_xpath)
	private WebElement homePageText;
	
	@FindBy(xpath = women_xpath)
	static WebElement women;
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
	
	
	@FindBy(xpath = nextorder_xpath)
	static WebElement next;
	@FindBy(xpath = placeorder_xpath)
	static WebElement placeOrder;
	@FindBy(xpath = thankyou_text_xpath)
	static WebElement thankyouText;
	
	@FindBy(xpath = men_xpath)
	static WebElement men;
	@FindBy(xpath = menProduct_xpath)
	static WebElement menProduct;
	@FindBy(id = men_jacket_id)
	static WebElement mensJacket;
	
	FileReaderManager fileReader = new FileReaderManager();
	
	public LumaJacketPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void signInMethod() {
		clickElement(signIn);
	}
	public void enterUsername(String UsernameStr) {
		
		passInput(userName, UsernameStr);
	}
	public void enterPassword(String passWordStr) {
		passInput(password, passWordStr);
	}
	public void enterLoginButton() {
		clickElement(login);
	}
	public void validateHomePageText(String text) {
		validation(homePageText.getText(),text);
	}
	public void moveOnWomen() {
		implicitlyWait(30,"seconds");
		moveToElement(women);
	}
	public void moveOnMen() {
		implicitlyWait(30,"seconds");
		moveToElement(men);
	}
	public void moveOnTops() {
		implicitlyWait(30,"seconds");
		moveToElement(top);
	}
	public void moveOnJackets() {
		implicitlyWait(30,"seconds");
		clickElement(jacket);
	}
	public void moveOnMensJacket() {
		implicitlyWait(30,"seconds");
		clickElement(mensJacket);
	}
	public void selectProduct() {
		clickElement(product);
	}
	public void selectMenProduct() {
		clickElement(menProduct);
	}
	public void selectSize() {
		clickElement(size);
	}
	public void selectColor() {
		clickElement(color);
	}
	public void selectQty() {
		passInput(qty, fileReader.getDataProperty("qty"));
	}
	
	public void clickAddToCart() {
		clickElement(addToCart);
		implicitlyWait(30,"seconds");
	}
	public void clickShoppingCartIcon() throws InterruptedException {
		Thread.sleep(10000);
		clickElement(showMyCart);
	}
	public void clickCheckOut() throws InterruptedException {
		Thread.sleep(10000);
		clickElement(checkOut);
	}
	public void clickNext() throws InterruptedException {
		System.out.println("coming....next");
		Thread.sleep(10000);
		javascriptExecutorClick(next);
	}
	public void placeOrder() throws InterruptedException {
		System.out.println("coming....");
		Thread.sleep(10000);
		javascriptExecutorClick(placeOrder);
	}
	public void validateThankYou() {
		validation(thankyouText.getText(),"Thank you for your purchase!");
		System.out.println("Order successful");
	}
	/*
	 * public void login() { FileReaderManager fileReader = new FileReaderManager();
	 * System.out.println(signIn); clickElement(signIn);
	 * System.out.println(fileReader.getDataProperty("login_username"));
	 * System.out.println(fileReader.getDataProperty("login_password"));
	 * 
	 * passInput(userName, fileReader.getDataProperty("login_username"));
	 * passInput(password, fileReader.getDataProperty("login_password"));
	 * clickElement(login); }
	 */
}
