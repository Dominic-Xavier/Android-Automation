package com.elementDetails;

import org.openqa.selenium.By;

import com.android.AndroidTestBase;

import io.appium.java_client.MobileElement;

public class UserAccountDetails extends AndroidTestBase {
	
	public static MobileElement setProfilePic() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/profile_pic_button"));
	}
	
	public static MobileElement close() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/quit"));
	}
	
	public static MobileElement userName() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/Name"));
	}
	
	public static MobileElement userId() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/U_id"));
	}
	
	public static MobileElement mobileNumber() {
		return (MobileElement) driver.findElement(By.id("com.myapp.finance:id/Mobile_number"));
	}
}
