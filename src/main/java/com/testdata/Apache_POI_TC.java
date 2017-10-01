package com.testdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Apache_POI_TC {

	private static WebDriver driver = null;
	 
	public static void main(String[] args) throws Exception {

    //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

    ExcelUtils.setExcelFile(Constants.path_aayush + Constants.file,"Sheet1");

    driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get(Constants.URL);

    SignIn_Action.Executee(driver);

    System.out.println("Login Successfully, now it is the time to Log Off buddy.");

   // ??
    //Home_Page.lnk_LogOut(driver).click(); 

    driver.quit();

    //This is to send the PASS value to the Excel sheet in the result column.

    ExcelUtils.setCellData("Pass", 1, 3);

	}

}
