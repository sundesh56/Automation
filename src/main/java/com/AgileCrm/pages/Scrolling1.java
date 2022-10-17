package com.AgileCrm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;

public class Scrolling1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		driver.get("https://www.amazon.in/");
		
		// to do scrolling operation for browser
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-700)");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		
		

	}

}
