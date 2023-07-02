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

public class DragDrop extends BaseTest {

	@Test
	public void DragDropTest() throws MalformedURLException, InterruptedException {
		//AutomationCode
		//xpath, id, accessibility id, class, androiduiautomator
		
		homePage.DragDrop();
		WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
		homePage.DragDrop(source, 820, 732);

		
		String droppedText = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		Assert.assertEquals(droppedText, "Dropped!");
		
		
		
		
		
		
		
	
	

	}
}
