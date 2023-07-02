package tests;

import org.testng.annotations.Test;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class E2E_Ecommerce extends BaseTest {

	
	@Test
	public void E2ETest() throws InterruptedException {
		
		homePageGS.HandleUIElements();
		productPage.ChooseProduct("Jordan 6 Rings");
		cartPage.PurchaseItem();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
		
		
		
		
	}
}
