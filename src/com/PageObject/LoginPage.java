package com.PageObject;

import org.openqa.selenium.By;

import com.Utilities.Constants;
import com.Utilities.DriverMethods;

public class LoginPage {

	public static void loadApp() {
		// TODO Auto-generated method stub
		DriverMethods.initDriver();
	}

	public static void Login(){
		DriverMethods.click(By.xpath(Constants.addAccount));
		DriverMethods.enterText(By.xpath(Constants.email), "sumedha107@gmail.com");
		DriverMethods.click(By.xpath(Constants.btnLoginNext));
		DriverMethods.enterText(By.xpath(Constants.pwd),"password");
		DriverMethods.click(By.xpath(Constants.btnLogin));
	}
}
