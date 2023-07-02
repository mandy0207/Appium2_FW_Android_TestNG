package pages.GeneralStore;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.ApiDemo.BasePage;

public class HomePage extends BasePage {

	
	AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		super(driver);

	}
	
	@AndroidFindBy(id = "android:id/text1")
	private WebElement selectCountry;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	private WebElement Name;
	
	@AndroidFindBy(xpath = "//*[@text='Canada']")
	private WebElement country;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private WebElement letsShop;
	
	@AndroidFindBy(xpath = "(//android.widget.Toast)[1]")
	private WebElement toastMsg;
	
	public void HandleUIElements() throws InterruptedException {
		
		
		ClickElement(selectCountry);
		ScrollByText("Canada");
		ClickElement(country);
		ClickElement(letsShop);
		Thread.sleep(2000);
		
		/**
		 * Any Toast msg is captured by using particular class = //android.widget.Toast
		 * 
		 * Text inside this toast msg can't be retrieved by using getText
		 * we have to use getAttribute(name) for that
		 */
		
		String toastmsg = GetTextByAttribute(toastMsg, "name");
		try {
			if(toastmsg.equals("Please enter your name")) {
				SetTextBox(Name, "Mandy Singh");
				ClickElement(letsShop);
				Thread.sleep(2000);
			}
			else {
				 Assert.assertEquals(toastmsg, "Please enter your name");
			}
		}
		catch(AssertionError e) {
			 Assert.assertEquals(toastmsg, "Please enter your name");
		}
		
		
	}
	
}
