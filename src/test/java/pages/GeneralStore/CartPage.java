package pages.GeneralStore;

import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.ApiDemo.BasePage;

public class CartPage extends BasePage {
	AndroidDriver driver;

	public CartPage(AndroidDriver driver) {
        super(driver);
		this.driver = driver;

	}

	@AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
	private WebElement cartTitle;

	@AndroidFindBy(xpath = "//android.widget.CheckBox")
	private WebElement checkBox;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnProceed")
	private WebElement proceedBtn;

	public void PurchaseItem() throws InterruptedException {
		WaitUntilAtrributeContainsValue(cartTitle, "text", "Cart");
		ClickElement(checkBox);

		ClickElement(proceedBtn);
		Thread.sleep(8000);
		Set<String> context = driver.getContextHandles();
		System.out.println(context);
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.name("q")).sendKeys("hello");
		
	
		

	}

}
