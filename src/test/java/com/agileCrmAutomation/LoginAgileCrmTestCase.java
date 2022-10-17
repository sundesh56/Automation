package com.agileCrmAutomation;

import org.testng.annotations.Test;

import com.AgileCrm.pages.BaseClass;
import com.AgileCrm.pages.LoginPage;

public class LoginAgileCrmTestCase extends BaseClass{
	
	
	@Test

	public static void main() {
		
		

		
	
		launchBrowser("chrome");
		
		
		driver.navigate().to("https://automation-practice.agilecrm.com/");
		LoginPage loginPage = new LoginPage();
		loginPage.login("sandesh56@rediffmail.com", "Sundes_8");
		
		

	}

}

