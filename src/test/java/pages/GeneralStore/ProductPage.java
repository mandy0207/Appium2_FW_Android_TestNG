package pages.GeneralStore;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.ApiDemo.BasePage;

public class ProductPage extends BasePage {

	AndroidDriver driver;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/productName")
	private List<WebElement> productName;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/productAddCart")
	private List<WebElement> AddToCart;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement imgBtn;
	
	

	
	public ProductPage(AndroidDriver driver) {
		super(driver);

	}
	
	public void ChooseProduct(String product) {
		
		ScrollByText(product);
		System.out.println(productName.size());
		System.out.println(AddToCart.size());
		
		for(int i =0; i<productName.size();i++) {
			if(productName.get(i).getText().equals(product)) {
				System.out.println(i);
				AddToCart.get(i).click();
				ClickElement(imgBtn);
				
				
			}
		}
		
	}
	
}
