package com.elementDetails;

import org.openqa.selenium.By;

import com.android.AndroidTestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class DisplayDate extends AndroidTestBase {
	public static MobileElement startDate() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/start_date"));
	}
	
	public static MobileElement endDate() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/end_date"));
	}
	
	public static MobileElement close() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/cl")); 
	}
	
	public static MobileElement income_checkbox() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/income_check_box"));
	}
	
	public static MobileElement expense_checkbox() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/expense_check_box"));
	}
	
	public static MobileElement close_Display_Activity() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/cl"));
	}
	
	public static MobileElement close_both() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/quit"));
	}
	
	public static MobileElement incomeTab() {
		return (MobileElement) driver.findElement(MobileBy.AccessibilityId("Income"));
	}
	
	public static MobileElement ExpenseTab() {
		return (MobileElement) driver.findElement(MobileBy.AccessibilityId("Expense"));
	}
}
