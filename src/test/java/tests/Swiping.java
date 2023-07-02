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

public class Swiping extends BaseTest {

	@Test
	public void SwipingTest() throws MalformedURLException, InterruptedException {
		//AutomationCode
		//xpath, id, accessibility id, class, androiduiautomator
		
		
		homePage.Swiping();
		WebElement element = driver .findElement(By.xpath("(//android.widget.ImageView)[1]"));
		String focusText = element.getAttribute("focusable");
		
		Assert.assertEquals(focusText, "true");
		
		//Swipe code
		

		
		homePage.Swiping(element, "left");
		
//		Again check Assertion to validate swipe has happened or not
		
		Assert.assertEquals(focusText, "false");
		
		
		
		
		
		
	
	

	}
}
