package tests;

import org.testng.annotations.Test;

import io.appium.java_client.android.Activity;

public class AppPackage extends BaseTest {

	@Test
	public void AppPackageTesting() {
		/**
		 * First Go to your emulator and open that page Grab AppPackaage and App
		 * activity
		 * 
		 * In CMD hit follwing command to grab AppPackaage and App activity respectively
		 * 
		 * Windows : adb shell dumpsys window | find "mCurrentFocus" Mac : adb shell
		 * dumpsys window | grep -E 'mCurrentFocus'
		 * 
		 */

		String appPackage = "io.appium.android.apis";
		String appActivity = "io.appium.android.apis.preference.PreferenceDependencies";

		Activity activity = new Activity(appPackage, appActivity);
		driver.startActivity(activity);
		
		//System.out.println(driver. getCurrentPackage());

	}
}
