package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	public WebDriver driver;

  @Test
  public void f() {
	  driver.findElement(By.id("log")).click();
	  driver.findElement(By.id("log")).sendKeys("testuser_1");

      driver.findElement(By.id("pwd")).sendKeys("Test@123");
      driver.findElement(By.id("login")).click();
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
      driver.findElement(By.id("account_logout"));
  }
  @BeforeMethod
  public void beforeMethod() {
		String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", ccpath);
	  
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://www.onlinestore.toolsqa.wpengine.com");
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
