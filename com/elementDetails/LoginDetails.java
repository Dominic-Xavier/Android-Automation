package com.elementDetails;

import org.openqa.selenium.By;

import com.android.AndroidTestBase;

import io.appium.java_client.MobileElement;

public class LoginDetails extends AndroidTestBase {
	public static MobileElement userName() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/user"));
	}
	
	public static MobileElement passWord() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/pass"));
	}
	
	public static MobileElement loginButton() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/login"));
	}
	
	public static MobileElement closeButton() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/can"));
	}
	
	public static MobileElement registerButton() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/register"));
	}
}
