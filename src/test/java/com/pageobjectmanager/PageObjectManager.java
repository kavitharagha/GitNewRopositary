package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.base.Base_Class;
import com.pageobjectmodel.LumaGearPOM;
import com.pageobjectmodel.LumaJacketPOM;
import com.pageobjectmodel.ProductSearchPage;
import com.utility.FileReaderManager;

public class PageObjectManager extends Base_Class {
	private LumaJacketPOM lumaJacket;
	private LumaGearPOM lumaGear;
	private ProductSearchPage productSearch;
	private FileReaderManager fileReader;
	
	public LumaJacketPOM getlumaJacket() {
		if(lumaJacket == null) 
			lumaJacket = new LumaJacketPOM(driver);
		return lumaJacket;
	}
	public FileReaderManager getFileReaderManager() {
		if(fileReader == null) 
			fileReader = new FileReaderManager();
		return fileReader;
	}
	public ProductSearchPage getProductSearchPage() {
		if(productSearch == null)
			productSearch = new ProductSearchPage(driver);
		return productSearch;
	}
	public LumaGearPOM getLumaGear() {
		if(lumaGear == null) 
			lumaGear = new LumaGearPOM(driver);
		return lumaGear;
	}

}
