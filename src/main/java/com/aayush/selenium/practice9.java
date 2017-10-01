package com.aayush.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice9 {
	public static void main(String[] args) throws InterruptedException  {
		String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", ccpath);
		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.com/iframe-practice-page/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		String handle = driver.getWindowHandle();
//		System.out.println(handle);

		driver.findElement(By.xpath("//button[@onclick='promptConfirm()']")).click();
	/// ????????????	((JavascriptExecutor) driver).ex 
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);	
		alert.sendKeys("yes");
		Thread.sleep(1000);
		alert.accept();
		
		

		
		Thread.sleep(1000);
		driver.close();
		//Thread.sleep(1000);
		//driver.quit();
	}
}
