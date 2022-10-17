package com.agileCrmAutomation;

import org.openqa.selenium.By;

import com.AgileCrm.pages.BaseClass;

public class DealsPage extends BaseClass {
	
	public void changeDealsStatus(String srcStatus, String dstStatus) {
		
		//wait until the element is clickable
		waitForElementToBeClickable(By.xpath(dstStatus));
		
		
		
		
	}
	
	
	
	
	
	

}
