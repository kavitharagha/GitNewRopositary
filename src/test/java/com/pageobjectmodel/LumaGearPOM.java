package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelement.LumaGearInterface;
import com.utility.FileReaderManager;

public class LumaGearPOM extends Base_Class implements LumaGearInterface{
	@FindBy(xpath = gear_xpath)
	private WebElement gear;
	@FindBy(xpath = bags_xpath)
	private WebElement bags;
	@FindBy(xpath = Overnight_Duffle_xpath)
	private WebElement overnight_Duffle;
	@FindBy(xpath = bags_qty_xpath)
	private WebElement qty;
	FileReaderManager fileReader = new FileReaderManager();
	
	public LumaGearPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void moveOnGear() {
		implicitlyWait(30,"seconds");
		moveToElement(gear);
	}
	public void clickOnBags() {
		implicitlyWait(30,"seconds");
		clickElement(bags);
	}
	public void clickOnOvernightDuffle() {
		implicitlyWait(30,"seconds");
		clickElement(overnight_Duffle);
	}
	public void selectQty(String bagsQty) {
		passInput(qty,bagsQty);
	}
}
