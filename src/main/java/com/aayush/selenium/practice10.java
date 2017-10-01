package com.aayush.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class practice10 {
	public static void main(String[] args) throws InterruptedException  {
		String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", ccpath);
		WebDriver driver = new ChromeDriver();
		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		//		WebElement element = driver.findElement(By.name("iframe1"));
		//		driver.switchTo().frame(element);
		//		WebElement firstname = driver.findElement(By.name("firstname"));
		//		WebElement lastname = driver.findElement(By.name("lastname"));
		//		firstname.sendKeys("aayush");
		//		lastname.sendKeys("nagpal");
		//
		//		driver.switchTo().defaultContent();
		//
		//		driver.switchTo().frame(1);
		//
		//		WebElement image = driver.findElement(By.xpath("//img[@src='http://demoqa.com/wp-content/uploads/2014/08/Tools-QA-213.png']"));
		//		image.click();

		//		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		//		System.out.println(elements.size());
		WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

		WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));


		Actions action = new Actions(driver);
		
		action.clickAndHold(From)
		.moveToElement(To)
		.release(To)
		.build();
		action.perform();

	}}
