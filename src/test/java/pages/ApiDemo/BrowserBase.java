package pages.ApiDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BrowserBase {
	
	public AndroidDriver driver;
	@BeforeTest
	public void BaseTest() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setDeviceName("ManinderEmulator");
		options.setChromedriverExecutable("C:\\Sask\\Code\\workspace\\AndroidAppiumFW\\src\\test\\java\\resources\\chromedriver.exe");
		options.setCapability("browserName","Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	}

}
