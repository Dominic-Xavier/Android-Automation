package navigationViewElements;

import org.openqa.selenium.By;

import com.android.AndroidTestBase;

import io.appium.java_client.MobileElement;

public class AccountDetails extends AndroidTestBase {
	
	public static MobileElement userName() {
		return driver.findElement(By.id("com.myapp.finance:id/Name"));
	}
	
	public static MobileElement userId() {
		return driver.findElement(By.id("com.myapp.finance:id/U_id"));
	}
	
	public static MobileElement mobileNumber() {
		return driver.findElement(By.id("com.myapp.finance:id/Mobile_number"));
	}
	
	public static MobileElement profilePic() {
		return driver.findElement(By.id("com.myapp.finance:id/profile_pic_button"));
	}
	
	public static MobileElement close() {
		return driver.findElement(By.id("com.myapp.finance:id/quit"));
	}
}
