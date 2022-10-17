package com.AgileCrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;



public class BaseClass {
	public static WebDriver driver = null;
	
	public static void launchBrowser(String browser) {
		switch(browser) {
		case "chrome" :
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\chrome\\chromedriver.exe"); 
		        driver = new ChromeDriver();
		        break;
		case "edge" :
		    System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");   
		        driver=new EdgeDriver();
		        break;
		default:
			System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
	        driver = new ChromeDriver();
				        
		}  
	}

	public static void click(By by, String msg){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		driver.findElement(by).click();
		System.out.println(msg);	
	}
	
	public static void waitForVisibilityOfElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	
	public static void waitForElementToBeClickable(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitForElementToBePresent(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public static void waitForElementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public static void fluentWait(final By by) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		
		wait.until(new Function<WebDriver,WebElement>() {
			public WebElement apply(WebDriver driver) {
				System.out.println("Waiting for Webelement to be available");
				return driver.findElement(by);
			}
		});
		
		
			}
	
	
	public static void selectDropdownValIndex(WebElement element, int index) {
		
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
    public static void selectDropdownValText(WebElement element, String text) {
		
		Select select = new Select(element);
		select.selectByVisibleText(text);
    }
		
	public static void selectDropdownValByValue(WebElement element, String val) {
			
			Select select = new Select(element);
			select.selectByValue(val);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
