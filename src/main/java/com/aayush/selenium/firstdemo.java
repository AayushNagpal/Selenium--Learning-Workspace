package com.aayush.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstdemo {

	public static void main(String[] args)  {
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\aayus\\Selenium-Testing\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", ccpath);
		WebDriver driver = new ChromeDriver();
		String URL = "http://demoqa.com/frames-and-windows/";
		driver.get(URL);
		driver.navigate().to("https://google.com");
		WebElement pelement = driver.findElement(By.className("gsfi"));
		WebElement celement = pelement.findElement(By.id("lst-ib"));
		System.out.println(celement.isDisplayed());
		celement.sendKeys("aayush Nagpal");
		celement.submit();
		
		List<WebElement>  element = driver.findElements(By.id("hplogo"));
		System.out.println(element);
		
		
		
		//		for (int i = 0; i < 1000; i++) {
		//			driver.navigate().refresh();
		//			//driver.navigate().back();
		//			//driver.navigate().forward();
		//			//driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		//		}
		//		System.out.println(driver.getTitle() +" "+ driver.getTitle().length() );
		//		String actualUrl = driver.getCurrentUrl();
		//		if(actualUrl.equals(URL)){
		//			System.out.println("truee");
		//		}else{
		//			System.out.println("failed" +"  "+ actualUrl + "  "+ URL );
		//		}
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		//System.out.println(pagesource.length());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
		//driver.quit();
	}

}
