package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyEvents extends BaseTest{
	
	@Test
	public void KeyEventsTest() {
		
		homePage.ClickPrefDep();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		
	
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		
		driver.findElement(By.id("android:id/edit")).sendKeys("Hello");
		
		//Keys can be used like this.
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("android:id/button1")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
	}

}

