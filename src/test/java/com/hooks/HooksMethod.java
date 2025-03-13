package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Base_Class;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksMethod extends Base_Class {

	@Before
	public void beforeHooks(Scenario s) {
		String Scenario_Name = s.getName();
		System.out.println("Scenario started:" + Scenario_Name);
	}
	@After
	public void afterHooks(Scenario s) {
		if(s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenShot = ts.getScreenshotAs(OutputType.BYTES);
			s.attach(screenShot, "image/png", "isFailed");
		} else {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenShot = ts.getScreenshotAs(OutputType.BYTES);
			s.attach(screenShot, "image/png", "passed");
		}
	}
}
