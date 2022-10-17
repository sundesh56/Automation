package com.agileCrmAutomation;

import org.openqa.selenium.By;

import com.AgileCrm.pages.BaseClass;
import com.AgileCrm.pages.LoginPage;

public class DealsTestCases extends BaseClass {

	public static void main(String[] args) {
		
		
		
		launchBrowser("chrome");
		driver.navigate().to("https://automation-practice.agilecrm.com/");
		LoginPage loginPage = new LoginPage();
		loginPage.login("sandesh56@rediffmail.com", "Sundes_8");
		
		
		click(By.id("dealsmenu"), "Click on deals menu");
			
		DealsPage dealsPage = new DealsPage();


	}

}
