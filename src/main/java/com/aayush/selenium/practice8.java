package com.aayush.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice8 {
	public static void main(String[] args)  {
		String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", ccpath);
		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String handle = driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.xpath("//button[@onclick='newMsgWin()']"));
		Set<String> handles =  driver.getWindowHandles();
		for (String handl : handles) {
			System.out.println(handl);
			driver.switchTo().window(handl);

		}
		//Thread.sleep(1000);
		driver.close();

		driver.quit();
	}
}
