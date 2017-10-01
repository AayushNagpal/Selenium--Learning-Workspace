package com.aayush.selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args)  {
		String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", ccpath);

		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);

		List<WebElement> oCheckBox = driver.findElements(By.name("sex"));
		for (int i = 0; i <oCheckBox.size(); i++) {
			oCheckBox.get(i).click();		
		}

		List<WebElement> elements = driver.findElements(By.name("profession"));
		for (int i = 0; i < elements.size(); i++) {
			String value = elements.get(i).getAttribute("value");
		if (value.equalsIgnoreCase("Automation Tester")){
		elements.get(i).click();
		}
		}

		//		int iSize = oCheckBox.size();
		//		for(int i=0; i < iSize ; i++ ){
		//			String sValue = oCheckBox.get(i).getAttribute("value");
		//			if (sValue.equalsIgnoreCase("toolsqa")){
		//				oCheckBox.get(i).click();
		//				break;
		//			}
		//		}
		//		WebElement sex = driver.findElement(By.id("sex-0"));
		//		boolean selection = false;
		//		selection = sex.isSelected();
		//
		//		if (selection == false){
		//			sex.click();
		//		}
		//		else{
		//			System.out.println("somethings wrong");
		//		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
}
