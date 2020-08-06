package com.elementDetails;

import org.openqa.selenium.By;

import com.android.AndroidTestBase;

import io.appium.java_client.MobileElement;

public class DatabaseElements extends AndroidTestBase {
	public static MobileElement optionSelect() {
		return driver.findElement(By.id("com.myapp.finance:id/spinner"));
	}
	
	public static MobileElement option_Expense() {
		//return driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']"));
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
	}
	
	public static MobileElement option_Income() {
		return driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='2']"));
		//return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));

	}
	
	public static MobileElement addRow() {
		return driver.findElement(By.id("com.myapp.finance:id/add"));
	}
	
	public static MobileElement deleteRow() {
		return driver.findElement(By.id("com.myapp.finance:id/delete"));
	}
	
	public static MobileElement saveData() {
		return driver.findElement(By.id("com.myapp.finance:id/ins"));
	}
	
	public static MobileElement displayData() {
		return driver.findElement(By.id("com.myapp.finance:id/ret"));
	}
	
	public static MobileElement description(int row,int column) {
		return driver.findElement(By.xpath("//android.widget.TableRow[@index='"+row+"']/android.widget.EditText[@index='"+column+"']"));
		//return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow["+row+"]/android.widget.EditText["+column+"]"));
	}
	
	public static MobileElement amount(int row,int column) {
		return driver.findElement(By.xpath("//android.widget.TableRow[@index='"+row+"']/android.widget.EditText[@index='"+column+"']"));
		//return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow["+row+"]/android.widget.EditText["+column+"]"));
	}
}
