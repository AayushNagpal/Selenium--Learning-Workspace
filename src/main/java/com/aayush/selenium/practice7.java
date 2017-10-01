package com.aayush.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import sun.awt.windows.WEmbeddedFramePeer;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class practice7 {
	public static void main(String[] args)  {
		String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", ccpath);

		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		driver.get(URL);

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.pollingEvery(1, TimeUnit.SECONDS)
				.withTimeout(20, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		Predicate<WebDriver> predicate = new Predicate<WebDriver>() {
			
			public boolean apply(WebDriver input) {
				WebElement element = input.findElement(By.id("colorVar"));
				String color = element.getAttribute("style");
				System.out.println(color);
				if(color.equals("red")){
					return true;
				}
				return false;
			}
		};
		
		
		System.out.println("success partial");
		////???????? wait.until(isTrue)
		System.out.println("success complete");
		driver.close();
	}
}
