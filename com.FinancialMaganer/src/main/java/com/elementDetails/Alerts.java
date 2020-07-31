package com.elementDetails;

import org.openqa.selenium.By;

import com.android.AndroidTestBase;

import io.appium.java_client.MobileElement;

public class Alerts extends AndroidTestBase {
	public static MobileElement accept() {
		return driver.findElement(By.id("android:id/button1"));
	}
	
	public static MobileElement decline() {
		return driver.findElement(By.id("android:id/button2"));
	}
}
