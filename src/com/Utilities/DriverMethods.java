package com.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class DriverMethods {

	public static WebDriver driver;
	public static void initDriver(){
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
		driver = new ChromeDriver();
     // driver=new FirefoxDriver();

		
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("https://mail.google.com");
		System.out.println("driver created ");
		Reporter.log("Gmail opened successfully");
	}
	
	public static void click(By elem){
		impWait(60);
		driver.findElement(elem).click();
		Reporter.log("clicked the button");
	}
	
	public static void enterText(By elem, String val) {
		impWait(60);
		driver.findElement(elem).sendKeys(val);	
		Reporter.log("Entered text");
	}

	public static void impWait(int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void closeDriver(){
		driver.quit();
		
	}
}
