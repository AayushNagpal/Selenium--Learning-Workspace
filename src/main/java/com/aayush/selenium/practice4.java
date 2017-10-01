package com.aayush.selenium;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice4 {
	public static void main(String[] args) throws InterruptedException  {
		String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", ccpath);
		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.com/automation-practice-switch-windows/";
		driver.get(URL);
		//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		//				.withTimeout(3, TimeUnit.SECONDS)
		//				.pollingEvery(1, TimeUnit.SECONDS)
		//				.ignoring(NoSuchElementException.class);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//button[@id='alert']"));
		element.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 4);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();


				WebElement element1 = driver.findElement(By.name("selenium_commands"));
				Select sel = new Select(element1);
			//	sel.
				sel.selectByIndex(0);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
		//			e.printStackTrace();
		//		}
		//		sel.deselectByIndex(0);

		//		sel.selectByVisibleText("Navigation Commands");
		//		try {
		//			Thread.sleep(1000);
		//		} catch (InterruptedException e) {
		//			e.printStackTrace();
		//		}
		//		sel.deselectByVisibleText("Navigation Commands");
		//		List<WebElement> list= sel.getOptions();
		//		for (WebElement w : list) {
		//			System.out.println(w.getText());
		//		}
		//		sel.deselectAll();

		//Thread.sleep(1000);
		driver.close();


	}
	}}
