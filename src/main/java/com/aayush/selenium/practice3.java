package com.aayush.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice3 {
	public static void main(String[] args)  {
		String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", ccpath);

		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);

		WebElement element = driver.findElement(By.id("continents"));
		Select sel = new Select(element);
		sel.selectByIndex(2);
		sel.selectByVisibleText("Europe");

		List<WebElement> sell = sel.getOptions();
		for (int i = 0; i < sell.size(); i++) {
			String value = sell.get(i).getText();
			System.out.println(value);
			if (value.equalsIgnoreCase("antartica"));
			{
				sel.selectByIndex(i);
			}
		}



		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();


	}
}