package tests;

import org.testng.annotations.Test;

import pages.ApiDemo.BrowserBase;

public class BrowserTesting extends BrowserBase{

	@Test
	public void BrowserTest() {
		driver.get("https://www.google.com/");
	}
}
