package tests;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class LongPressGestures extends BaseTest {

	@Test
	public void LongPressTest() throws MalformedURLException, InterruptedException {
		//AutomationCode
		//xpath, id, accessibility id, class, androiduiautomator
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		homePage.LongPress(ele);
		
		boolean text =driver.findElement(By.id("android:id/title")).isDisplayed();
		Assert.assertTrue(text);
		
		
	
	

	}
}
