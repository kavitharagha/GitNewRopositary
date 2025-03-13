package com.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.*;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Base_Class {
	public static WebDriver driver;
	
	protected static WebDriver launchBrowser(String browserName) {
		try {
			if(browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if(browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if(browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
		} catch( Exception e) {
			Assert.fail("ERROR: OCCUR DURING BROWSER LAUCH");
		}
		driver.manage().window().maximize();
		return driver;
	}
	protected static void launchUrl(String url) {
		try {
			driver.get(url);
		}catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING URL LAUNCH");
		}
	}
	protected static void closeBrowser() {
		try {
			driver.close();
		}catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING BROWSER CLOSE");
		}
	}
	protected static void terminateBrowser() {
		try{
			driver.quit();
		}catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING TERMINATING BROWSER");
		}
	}
	protected static void navigation( String action) {
		try {
			if(action.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			} else if(action.equalsIgnoreCase("backward")){
				driver.navigate().back();
			} else if(action.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
		}catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING BROWSER NAVIGATION");
		}
	}
	protected static void navigateUrl(String url) {
		try {
			driver.navigate().to(url);
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING NAVIGATE URL");
		}
	}
	protected static void getTitle() {
		try {
			driver.getTitle();
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING GET TITLE OF THE BROWSER");
		}
	}
	protected static  void getCurrentUrl() {
		try {
			driver.getCurrentUrl();
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING GET CURRENT URL");
		}
	}
	protected static void passInput(WebElement element, String inputText) {
		try {
			if(inputText != null) {
				System.out.println(element);
				System.out.println(inputText);
				element.sendKeys(inputText);
			}
		} catch(Exception e) {
			Assert.fail("ERROR DURING SENDING TEXT");
		}
	}
	protected static void clickElement(WebElement element) {
		try {
			System.out.println(element);
			element.click();
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING CLICK ELEMENT");
		}
	}
	protected static void getAttribute(WebElement element, String attributeName) {
		try {
			String attributeValue = element.getAttribute(attributeName);
			System.out.println("Attribute value:"+attributeValue);
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING GET ATTRIBUTE");
		}
	}
	protected static void getText(WebElement element) {
		try {
			String textValue = element.getText();
			System.out.println("value:"+textValue);
		}catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING GET TEXT METHOD");
		}
	}
	protected static void checkElementDisplay(WebElement element,String type) {
		boolean status = false;
		try {
			if(type.equalsIgnoreCase("isdisplayed")) {
				status = element.isDisplayed();
			}else if(type.equalsIgnoreCase("isenable")) {
			   status = element.isEnabled();
			}else if(type.equalsIgnoreCase("isselected")) {
				status = element.isSelected();
			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCURS DURING ELEMENT DISPLAY");
		}
		System.out.println("Element status:"+status);
	}

	protected static void displayAlert() {
		try {
			 driver.switchTo().alert();
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING ALERT");
		}
	}
	protected static void alertInput(String type, String value) {
		Alert alert = driver.switchTo().alert();
		try {
			if(type.equalsIgnoreCase("accept")) {
				alert.accept();
			}else if(type.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			}else if(type.equalsIgnoreCase("prompt")) {
				alert.sendKeys(value);
			}
		}catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING ALERT OPERATION");
		}
	}
	protected static void switchToFrame(WebElement element, String frameType, int number) {
		try {
			if(frameType.equalsIgnoreCase("index")) {
				driver.switchTo().frame(number);
			}else if(frameType.equalsIgnoreCase("name")) {
				driver.switchTo().frame(element);
			} else if(frameType.equalsIgnoreCase("webelement")) {
				driver.switchTo().frame(element);
			}
		} catch(Exception e) {
			Assert.fail("OCCUR DURING SWITCH TO FRAME");
		}
	}
	protected static void selectOptions(WebElement element, String type, String value) {
		try {
			Select select = new Select(element);
			if(type.equalsIgnoreCase("text")) {
				select.selectByVisibleText(value);
			}else if(type.equalsIgnoreCase("index")) {
				select.selectByIndex(Integer.parseInt(value));
			}else if(type.equalsIgnoreCase("value")){
				select.selectByValue(value);
			}else {
				System.out.println("INVALID SELECTION TYPE.USE TEXT OR VALUE OR INDEX");
			}
		}catch(Exception e) {
			Assert.fail("OCCUR DURING VALUE SELECT");
		}
	}
		protected static void deSelectOptions(WebElement element, String type, String value) {
			try {
				Select select = new Select(element);

				if(select.isMultiple()) {
					if(type.equalsIgnoreCase("text")) {
						select.deselectByVisibleText(value);
					}else if(type.equalsIgnoreCase("index")) {
						select.deselectByIndex(Integer.parseInt(value));
					}else if(type.equalsIgnoreCase("value")){
						select.deselectByValue(value);
					}else if(type.equalsIgnoreCase("all")) {
						select.deselectAll();
					}else {
						System.out.println("INVALID DESELECTION TYPE.USE TEXT OR VALUE OR INDEX");
					}
				}
			}catch(Exception e) {
				Assert.fail("OCCUR DURING VALUE DESELECT");
			}
	}
	protected static void isMultipleSelect(WebElement element) {
		boolean result = false;
		try {
			Select select = new Select(element);
			if(select.isMultiple()) {
				result = true;
			}else {
				result = false;
			}
		} 
		catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING ISMULTIPLE SELECT METHOD");
		}
		System.out.println("Is Multiple Select:"+ result);
	}
	protected static void getFirstSelectedOption(WebElement element) {
		try {
			Select select = new Select(element);
			String selectedText = select.getFirstSelectedOption().getText();
			System.out.println("first selected option:"+selectedText);
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING SELECT OPTION");
		}
	}
	protected static void getAllSelectedOption(WebElement element) {
		try {
			Select select = new Select(element);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			for(WebElement ele : allSelectedOptions) {
				System.out.println("all selected options:"+ele.getText());
			}
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING SELECT OPTION");
		}
	}
	protected static void getOptions(WebElement element) {
		try {
			Select select = new Select(element);
			List<WebElement> allOptions = select.getOptions();
			for(WebElement ele : allOptions) {
				System.out.println("all selected options:"+ele.getText());
			}
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING SELECT OPTION");
		}
	}
	
	protected static void takeScreenShot(String destFile) {
		try {
			TakesScreenshot screenShot = (TakesScreenshot)driver;
			File src = screenShot.getScreenshotAs(OutputType.FILE);
			File dest = new File(destFile);
			Files.copy(src, dest);

		}catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING TAKE SCREENSHOT");
		}
	}
	protected static void scrollPage(String type) {
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			if(type.equalsIgnoreCase("down")) {
				jsExecutor.executeScript("arguments[0].scrollIntoView(true)");
			} else {
				jsExecutor.executeScript("arguments[0].scrollIntoView(false)");
			}
		}catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING SCROLLING PAGE");
		}
	}
	protected static void implicitlyWait(int duration, String timeUnit) {
		try {
			if(timeUnit.equalsIgnoreCase("seconds")) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
			} else if(timeUnit.equalsIgnoreCase("milliseconds")){
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(duration));
			} else if(timeUnit.equalsIgnoreCase("minitues")) {
				driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(duration));
			} else if(timeUnit.equalsIgnoreCase("days")) {
				driver.manage().timeouts().implicitlyWait(Duration.ofDays(duration));
			} else if(timeUnit.equalsIgnoreCase("hours")) {
				driver.manage().timeouts().implicitlyWait(Duration.ofHours(duration));
			}
			
		}catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING WAIT");
		}
		
	}
	protected static void windowsHandling(int num) {
		try {
			ArrayList<String> allWindow = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(allWindow.get(num));
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING WINDOWS HANDLING");
		}
	}
	// Actions class methods
	protected static void rightClick(WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING RIGHT CLICK");
		}
	}
	protected static void doubleClick(WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.doubleClick(element).perform();
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING DOUBLE CLICK");
		}
	}
	protected static void moveToElement(WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING MOUSE OVER");
		}
	}
	protected static void dragAndDrop(WebElement source, WebElement destination) {
		try {
			Actions action = new Actions(driver);
			action.dragAndDrop(source,destination).perform();
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING DRAG AND DROP");
		}

	}
	protected static void keyboardActions(String actionType) {
		try {
			Robot robot = new Robot();
			if(actionType.equalsIgnoreCase("down")) {
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);

			} else if(actionType.equalsIgnoreCase("enter")) {
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING KEYBOARD ACTIONS");
		}
	}
	protected static void validation(String actual, String expected) {
		try {
			Assert.assertEquals(actual, expected);
		} catch(Exception e) {
			Assert.fail("ERROR OCCURED DURING VALIDATION");
		}
	}
	protected static void javascriptExecutorClick(WebElement webElement) {
		try {
			System.out.println("coming base class....");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", webElement);
		} catch(Exception e) {
			Assert.fail("ERROR OCCUR DURING JAVASCRIPT EXECUTOR");
		}
	}
}
