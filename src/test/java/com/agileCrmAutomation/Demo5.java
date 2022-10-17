package com.agileCrmAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}

	
	// Agile-crm website login 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://realestateautomation.agilecrm.com");
		
		//Find elements by using cssSelector
		
    	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Test@Test1234");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Test1234");
		Thread.sleep(3000);
		
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
	
	    

	}

}
