package com.agileCrmAutomation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.AgileCrm.pages.BaseClass;

public class CompanyPage extends BaseClass{
	@Test
	
	public void addCompany() {
		
		WebElement addCompanyButton = driver.findElement(By.xpath("//button[contains(text(),'add Company')]"));
		Actions action =new Actions(driver);
		action.click(addCompanyButton).build().perform();
		
	}

}
