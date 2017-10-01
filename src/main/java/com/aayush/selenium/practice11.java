package com.aayush.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class practice11 {
public static void main(String args[]){
	HtmlUnitDriver unitDriver = new HtmlUnitDriver();
	
	unitDriver.get("http://google.com");
	
	System.out.println(unitDriver.getTitle());
	
	WebElement searchBox = unitDriver.findElement(By.name("q"));
	searchBox.sendKeys("aayush Nagpal");
	
	WebElement button = unitDriver.findElement(By.name("btnK"));
	button.click();
	System.out.println(unitDriver.getTitle().trim());
	
}
}
