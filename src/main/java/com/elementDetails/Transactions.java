package com.elementDetails;

import org.openqa.selenium.By;

import com.android.AndroidTestBase;

import io.appium.java_client.MobileElement;

public class Transactions extends AndroidTestBase {
	
	public static MobileElement month_and_Year() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/Name"));
	}
	
	public static MobileElement income() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/Name"));
	}
	
	public static MobileElement expense() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/Name"));
	}
	
	public static MobileElement total() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/Name"));
	}
	
	public static MobileElement index() {
		return (MobileElement) driver.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup"));
	}
	
	public static MobileElement close() {
		return (MobileElement) driver.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup"));
	}

}
