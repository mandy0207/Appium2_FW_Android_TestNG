package pages.ApiDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.collect.ImmutableMap;

import Listeners.LogListener;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import util.TestProperties;


public class BasePage {
	protected FluentWait<AndroidDriver> waiter;
	private static Logger logger = Logger.getLogger(LogListener.class);
	
	AndroidDriver driver;
	public BasePage(AndroidDriver driver){
		super();
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		int waitTimeout = 5;
		waiter = new FluentWait<>(driver).ignoring(NoSuchElementException.class, WebDriverException.class)
				.withTimeout(Duration.ofSeconds(waitTimeout)).pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
	}
	
	
	
	
	public void ClickElement(WebElement element) {
		element.click();
		logger.info("Element Clicked successfully   " +element.toString());
	
	}
	
	public void SetTextBox(WebElement element, String value) {
		element.sendKeys(value);
		logger.info("Sent Value =    " +value +"     Locator =" + element.toString());
	}
	
	
	//wrappers
	public void LongPress(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(), "duration", 2000));
	}
	
	public void ScrollByText(String text) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
	}
	
	public void ScrollTillEnd() {
		boolean canScrollMore;
		
			do {
			    canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
					    "left", 100, "top", 100, "width", 200, "height", 200,
					    "direction", "down",
					    "percent", 3.0
					));
				}
			while(canScrollMore);
		}
	
	public void Swiping(WebElement element, String direction) {
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				 "elementId", ((RemoteWebElement) element).getId(),
			    "direction", direction,
			    "percent", 0.75
			));
	}
	
	public String GetTextByAttribute(WebElement element, String Attribute) {
		
	        return element.getAttribute(Attribute);   
	}
	
	
	public void DragDrop(WebElement source, int xCordinates, int yCordinates) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", xCordinates,
			    "endY", yCordinates
			));
	}
	
	public void RotateLandscape() {
		DeviceRotation landscape = new DeviceRotation(0,0,90);
		driver.rotate(landscape);
	}
	
	public void SetClipBoardText(String text) {
		driver.setClipboardText(text);
	}
	
	public String getClipBoardText() {
	return	driver.getClipboardText();
	}
	
	public void WaitUntilAtrributeContainsValue(WebElement element, String Attribute, String Value) {
		waiter.until(ExpectedConditions.attributeContains(element, Attribute, Value));
	}
}
