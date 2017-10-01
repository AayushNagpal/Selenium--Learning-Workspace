package com.aayush.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice12 {
	public static void main(String[] args) throws InterruptedException  {
		String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", ccpath);
		WebDriver driver = new ChromeDriver();
//		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
//		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window();
		driver.get("http://toolsqa.wpengine.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		

		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		List<WebElement> element = driver.findElements(By.tagName("a"));
		
//		for (WebElement webElement : element) {
//			System.out.println(webElement.getText());
//			
//		}
//		
		driver.close();

	}
}

