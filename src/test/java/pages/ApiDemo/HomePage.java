package pages.ApiDemo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {

	
	AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		super(driver);

	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='3. Preference dependencies']")
	private WebElement prefDep;
	
	@AndroidFindBy(accessibility = "Preference")
	private WebElement preference;
	
	@AndroidFindBy(accessibility = "Views")
	private WebElement views;
	
	
	@AndroidFindBy(accessibility = "Gallery")
	private WebElement gallery;
	
	@AndroidFindBy(accessibility = "1. Photos")
	private WebElement photos;
	
	@AndroidFindBy(accessibility = "Drag and Drop")
	private WebElement dragDrop;
	
	
	
	
	
	
	
	public void ClickPrefDep() {
		ClickElement(preference);
		ClickElement(prefDep);
		
	}
	
	
	public void Scrolling(String text) {
		ClickElement(views);
		//Use when you know webelement which is to be scrolled
		ScrollByText(text);
		
		//use when you donot know webelement
		//ScrollTillEnd();
	}
	
	public void Swiping() {
		ClickElement(views);
		ClickElement(gallery);
		ClickElement(photos);
	}
	
	public void DragDrop() {
		ClickElement(views);
		ClickElement(dragDrop);
	}
	
	
}
