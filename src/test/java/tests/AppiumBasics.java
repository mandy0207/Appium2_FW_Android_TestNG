package tests;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import pages.ApiDemo.HomePage;

public class AppiumBasics extends BaseTest {

	@Test
	public void WifiSettingsTest() throws MalformedURLException {
		//AutomationCode
		//xpath, id, accessibility id, class, androiduiautomator
		
		homePage.ClickPrefDep();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String wifiText= driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(wifiText, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("mandy");
		driver.findElement(By.id("android:id/button1")).click();
	

	}
}
