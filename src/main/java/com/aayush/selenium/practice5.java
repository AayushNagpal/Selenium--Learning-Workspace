package com.aayush.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class practice5 {
	public static void main(String[] args)  {
	String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
	System.setProperty("webdriver.chrome.driver", ccpath);
	
	WebDriver driver = new ChromeDriver();
	String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
	driver.get(URL);
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(2, TimeUnit.SECONDS)
			.pollingEvery(250, TimeUnit.MILLISECONDS);
	
	WebElement element = driver.findElement(By.id("alert"));
	element.click();	
	System.out.println("clicked");
	
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	alert.accept();
	System.out.println("Alert is accepted");
	
	driver.close();
	
			
	
	
}}
