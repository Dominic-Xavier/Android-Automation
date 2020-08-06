package navigationViewElements;

import org.openqa.selenium.By;

import com.android.AndroidTestBase;

import io.appium.java_client.MobileElement;

public class Transactions extends AndroidTestBase {
	public static MobileElement monthSelect(int number) {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup["+number+"]/android.view.ViewGroup"));
	}
	
	public static MobileElement income(int number) {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup["+number+"]/android.view.ViewGroup/android.widget.TextView[2]"));
	}
	
	public static MobileElement month(int number) {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup["+number+"]/android.view.ViewGroup/android.widget.TextView[1]"));
	}
	
	public static MobileElement expense(int number) {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup["+number+"]/android.view.ViewGroup/android.widget.TextView[3]"));
	}
	
	public static MobileElement close() {
		return driver.findElement(By.id("com.myapp.finance:id/quit_recycler"));
	}
}
