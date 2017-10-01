package com.aayush.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
	public static void main(String[] args)  {
		String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", ccpath);
		
		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		
//		WebElement element = driver.findElement(By.name("firstname"));
//		element.sendKeys("Aayush");
//		WebElement element2 = driver.findElement(By.name("lastname"));
//		element2.sendKeys("Nagpal");
//		
//		WebElement parentelement3 = driver.findElement(By.className("button"));
//		WebElement chiltelement3 = parentelement3.findElement(By.id("submit"));
//		chiltelement3.submit();
		//System.out.println(chiltelement3.isDisplayed());
		
		WebElement plink = driver.findElement(By.partialLinkText("Partial"));
		plink.click();
		
		WebElement link = driver.findElement(By.linkText("Link Test"));
		link.click();
		
		
		//String button = driver.findElement(By.tagName("button")).toString();
		//String print = button.toString();
		//System.out.println(button);
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
		
		
}
}