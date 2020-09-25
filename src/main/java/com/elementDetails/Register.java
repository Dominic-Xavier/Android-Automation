package com.elementDetails;

import org.openqa.selenium.By;

import com.android.AndroidTestBase;

import io.appium.java_client.MobileElement;

public class Register extends AndroidTestBase {
	
	public static MobileElement username() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/user")); 
	}
	
	public static MobileElement password() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/pass")); 
	}
	
	public static MobileElement rePassword() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/repass")); 
	}
	
	public static MobileElement mobileNumber() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/mob_num")); 
	}
	
	public static MobileElement registerButton() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/create")); 
	}
	
	public static MobileElement backToLogin() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/cancel")); 
	}
}

