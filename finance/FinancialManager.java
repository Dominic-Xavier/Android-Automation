package com.finance;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.android.AndroidTestBase;
import com.elementDetails.DatabaseElements;
import com.elementDetails.DisplayDate;
import com.operations.AllOperations;

public class FinancialManager {
	
	 @BeforeClass
	 public void openApp() throws MalformedURLException, InterruptedException {
	  	AndroidTestBase.setUp();
	  	Thread.sleep(2000);
	  }
	  
	  @BeforeMethod()
	  @Parameters({"Username","Password"})
	  public void login(String Username,String Password) throws InterruptedException {
		  AllOperations.login(Username, Password);
	  }
	  
	  @Test(priority = 2, enabled = false)
	  @Parameters({"Option","noOfRows","Description","Amount"})
	  public void expenses(String Option,String noOfRows,String Description,String Amount) throws Exception {
		  AllOperations.add_row(Integer.parseInt(noOfRows));
		  String desc[] = Description.split(";;");
		  String Amt[] = Amount.split(";;");
		  AllOperations.insert_data(Option,desc,Amt);
		  AllOperations.delete_row();
	  }
	  
	  @AfterMethod
	  public void logout() {
		  AllOperations.logOut();
	  }
	  
	  @Test(priority = 3,enabled = false)
	  @Parameters({"inc_Option","noOfRows","Inc_Description","Inc_Amount"})
	  public void income(String inc_Option,String noOfRows,String Inc_Description,String Inc_Amount) throws Exception {
		  AllOperations.add_row(Integer.parseInt(noOfRows));
		  String desc[] = Inc_Description.split(";;");
		  String Amt[] = Inc_Amount.split(";;");
		  AllOperations.insert_data(inc_Option,desc,Amt);
		  AllOperations.delete_row();
	  }
	  
	  @Test(priority = 4)
	  @Parameters({"date","display_option"})
	  public void show_date(String date,String option) throws Exception {
		  String dates[] = date.split(";;");
		  String options[] = option.split(";;");
		  for(int i=0;i<options.length;i++)
		  AllOperations.display(dates[0], dates[1], options[i]);
	  }
	  
	  @Test(priority = -1,enabled = false)
	  @Parameters({"userName","passWord","Repass","Mobile_num"})
	  public void register(String username,String password,String repassword,String mobile_number){
		  AllOperations.register(username, password, repassword, mobile_number);
	  }
	  
	  @AfterClass
	  public void app_complete() {
		  AndroidTestBase.close_App();
		  System.err.println("App Cpmpleted...!");
	  }
}
