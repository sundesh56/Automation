package com.agileCrmAutomation;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.AgileCrm.pages.BaseClass;

public class AmazonApplianceSearch extends BaseClass {
	
	@Test
	
public static void main(){
	
	
	launchBrowser("chrome");
	driver.navigate().to("https://www.amazon.in/");
	selectDropdownValText(driver.findElement(By.id("searchDropdownBox")),"Appliances" );
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("washing machine");
	
	click(By.id("nav-search-submit-button"),"Click on search button");
	
	List<WebElement> applianceNames = driver.findElements(By.xpath("//div[@class='sg-row']/descendant::h2/a/span"));
	
	for(WebElement ele: applianceNames) {
		
		System.out.println(ele.getText());
	}
	
}
	
}
