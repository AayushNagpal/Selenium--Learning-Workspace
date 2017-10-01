package com.log4jtesting;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4j {
private static WebDriver driver;

private static Logger log = Logger.getLogger(log4j.class.getName());
public static void main(String args[]){
	String ccpath = "C:\\Users\\aayus\\Selenium-Testing\\chromedriver_win32\\chromedriver.exe"; 
	System.setProperty("webdriver.chrome.driver", ccpath);
	
	DOMConfigurator.configure("log4j.xml");
	
	driver = new ChromeDriver();
	log.info("hello first logger initated");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	log.info("implicit wait instantiated");
	
	driver.get("https://www.google.com/");
	log.info("get request sent");
	
	WebElement element = driver.findElement(By.className("gsfi"));
	element.sendKeys("aayush nagpal is a hero");
	log.info("sendkeys opertaions performed");
	
	System.out.println("finsihed operationssssssss");
	
	driver.close();
	log.info("last step");
	
	
}


}
