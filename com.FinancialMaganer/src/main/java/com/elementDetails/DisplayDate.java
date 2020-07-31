package com.elementDetails;

import org.openqa.selenium.By;

import com.android.AndroidTestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class DisplayDate extends AndroidTestBase {
	public static MobileElement startDate() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText[1]"));
	}
	
	public static MobileElement endDate() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText[2]"));
	}
	
	public static MobileElement canncel() {
		return driver.findElement(By.id("android:id/button2"));
	}
	
	public static MobileElement okButton() {
		return driver.findElement(By.id("android:id/button1"));
	}
	
	public static MobileElement close() {
		return driver.findElement(By.id("com.myapp.finance:id/cl")); 
	}
	
	public static MobileElement income() {
		return driver.findElement(By.id("com.myapp.finance:id/income_check_box"));
	}
	
	public static MobileElement expense() {
		return driver.findElement(By.id("com.myapp.finance:id/expense_check_box"));
	}
	
	public static MobileElement close_Display_Activity() {
		return driver.findElement(By.id("com.myapp.finance:id/cl"));
	}
	
	public static MobileElement close_both() {
		return driver.findElement(By.id("com.myapp.finance:id/quit"));
	}
	
	public static MobileElement expenseTab() {
		return driver.findElement(By.id("com.myapp.finance:id/quit"));
	}
	
	public static MobileElement incomeTab() {
		return driver.findElement(MobileBy.AccessibilityId("Income"));
	}
	
	public static MobileElement ExpenseTab() {
		return driver.findElement(MobileBy.AccessibilityId("Expense"));
	}
}
