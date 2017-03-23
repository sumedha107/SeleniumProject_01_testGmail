package com.TestCase;

import org.testng.annotations.Test;

import com.PageObject.LoginPage;
import com.Utilities.DriverMethods;

public class Login_Tc001 {
  
	@Test
  public void Login_01() {
	  System.out.println("hi... Ready to start lohin test");
	  LoginPage.loadApp();
	  LoginPage.Login();
	 DriverMethods.closeDriver();
  }
}
