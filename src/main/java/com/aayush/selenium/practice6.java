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

public class practice6 {
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

		Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver input) {

				WebElement element = input.findElement(By.id("target"));
				//String color = element.getAttribute("style");
				System.out.println("checking for element");
				if(element != null){
					System.out.println("element found");
				}
				return element;
			}
		};
		System.out.println("success partial");
		wait.until(function);
		System.out.println("success complete");
		driver.close();
	}
}
