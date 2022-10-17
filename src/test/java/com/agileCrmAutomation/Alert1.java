package com.agileCrmAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.AgileCrm.pages.BaseClass;

public class Alert1 extends BaseClass{
	
	
@Test


	public static void main() throws InterruptedException {
		launchBrowser("chrome");
		driver.get("https://www.amazon.in/");
		
		//to generate  Information Alert
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("alert('This is sample alert!');");
		
		// to generate confirmation alert
	//	js.executeScript("confirm('This is a sample alert!');"); 
		
		
		// to generate prompt alert
		
		js.executeScript("prompt('This is a sample alert!')");
		
		// wait for alert
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		
		// to write text in the alert field
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("This is sample text");
		alert.accept();
		
		
		
		
		

	}

}
