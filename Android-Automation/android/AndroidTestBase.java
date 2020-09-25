package com.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.elementDetails.Alerts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidTestBase {
	public static WebDriver driver;
	public static void setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1951");
		cap.setCapability("udId", "f0d81e23");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion","10");
		cap.setCapability("appPackage", "com.myapp.finance");
		cap.setCapability("appActivity", "com.myapp.finance.Database");
		cap.setCapability("automationName", "UIautomator1");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		System.out.println("Application started");
	}
	
	public static void backButtonClick() {
		driver.navigate().back();
	}
	
	public static boolean aletButtonCheck() {
		try {
			Alerts.accept().click();
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static WebDriverWait expWait(int SECONDS,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, SECONDS);
		wait.until(ExpectedConditions.visibilityOf(ele));
		return wait;
	}
}
		
		
		
		