package factory;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

import context.WebDriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import pages.ApiDemo.BasePage;

public class PageInstancesFactory {

	/**
	 * Get an instance of a page object class
	 * 
	 * @param <T>  The Page Object class type
	 * @param type
	 * @return an instance of the page class
	 */
	public static <T extends BasePage> T getInstance(Class<T> type) {
		try {
			return type.getConstructor(AndroidDriver.class).newInstance(WebDriverContext.getDriver());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			return null;
		}
	}
}
