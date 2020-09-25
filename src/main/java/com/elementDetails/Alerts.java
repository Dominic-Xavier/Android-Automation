package com.elementDetails;

import org.openqa.selenium.By;

import com.android.AndroidTestBase;

import io.appium.java_client.MobileElement;

public class Alerts extends AndroidTestBase {
	public static void accept() {
		driver.findElement(By.id("android:id/button1")).click();
	}
	
	public static void decline() {
		driver.findElement(By.id("android:id/button2")).click();
	}
}
