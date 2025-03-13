package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {
	private static FileInputStream inputStream;
	private static Properties property;
	
	private static void setupProperty() {
		try {
			File file = new File("D:\\eclipse\\cucumberProject\\src\\main\\resources\\LumaTestData.properties");
			inputStream = new FileInputStream(file);
			property = new Properties();
			property.load(inputStream);
		} catch (FileNotFoundException e) {
			Assert.fail("ERROR OCCUR DURING FILE LOAD");
		} catch(IOException e) {
			Assert.fail("ERROR OCCUR DURING FILE READ");
		}
		
	}
	public static String getDataProperty(String dataValue) {
		setupProperty();
		String dataProperty = property.getProperty(dataValue);
		return dataProperty;
	}
	public static void main(String args[]) throws IOException {
		System.out.println(getDataProperty("browser"));
	}
}
