package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class CopyToClipBoard extends BaseTest {

	@Test
	public void CopyToClipBoardTest() {
		
		homePage.ClickPrefDep();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		
		homePage.RotateLandscape();
		
		driver.setClipboardText("Hello Hi");
		
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String wifiText= driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(wifiText, "WiFi settings");
		
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.findElement(By.id("android:id/button1")).click();
	
	}
}
