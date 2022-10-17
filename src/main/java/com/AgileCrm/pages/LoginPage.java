package com.AgileCrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {
	
	public void login(String username, String password) {
		WebElement uname = driver.findElement(By.name("email"));
		uname.clear();
		uname.sendKeys(username);
		
		WebElement pwd = driver.findElement(By.name("password"));
	//	WebElement pwd = driver.findElement(By.cssSelector("input[name='password']"));
		
		
		pwd.clear();
		pwd.sendKeys(password);
		
		
		WebElement signIn=driver.findElement(By.xpath("//input[@type='submit']"));
		signIn.click();
		
		if(driver.findElement(By.xpath("//a[@class='close']/parent::*")).isDisplayed()) {
			
			System.out.println("Invalid ussername: " + username+ " or password: "+password);
		}
		
		
	}

}
