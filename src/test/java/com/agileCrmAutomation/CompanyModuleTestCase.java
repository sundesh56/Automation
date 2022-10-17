package com.agileCrmAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AgileCrm.pages.BaseClass;
import com.AgileCrm.pages.LoginPage;

public class CompanyModuleTestCase extends BaseClass {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method");
		
		launchBrowser("chrome");
		driver.navigate().to("https://automation-practice.agilecrm.com/");
		LoginPage login = new LoginPage();
		login.login("sandesh56@rediffmail.com", "Sundes_8");
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method");
		// Logout from application
		
		driver.quit();
	}

  @Test
  public void verifyAddCompany() {
	  
	  click(By.id("companiesmenu"),"clicked on Company menu");
	  CompanyPage companyPage=new CompanyPage();
	  companyPage.addCompany();
	  
	  //Verify company
	  
  }
  
  
  @Test
  
  public void verifyUpdateCompany() {
	  
	  System.out.println("This is update company method");
  }
  
  
  
  
  
}
