package com.agileCrmAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.AgileCrm.pages.BaseClass;
import com.AgileCrm.pages.LoginPage;

public class CompanyTest extends BaseClass {
  @Test
  public void a_login() {
	  launchBrowser("chrome");
	  
	  driver.navigate().to("https://automation-practice.agilecrm.com/");
	  
	  LoginPage loginPage = new LoginPage();
	  loginPage.login("sandesh56@rediffmail.com", "Sundes_8");
	  
	  
  }
  @Test
  public void b_addCompany() {
	  
	  click(By.id("companiesmenu"),"clicked on Company menu");
	  CompanyPage companyPage=new CompanyPage();
	  companyPage.addCompany();
  }
  
 
  
  
  
  
  
}
