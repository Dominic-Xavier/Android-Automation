package com.finance;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.android.AndroidTestBase;
import com.operations.AllOperations;

public class FinancialManager {
	
	@BeforeClass
	public void openApp() throws MalformedURLException, InterruptedException {
	  	AndroidTestBase.setUp();
	  	Thread.sleep(2000);
	 }
	  
	  @Test(priority = 1,enabled = true)
	  @Parameters({"Username","Password"})
	  public void login(String Username,String Password) throws InterruptedException {
		  AllOperations.login(Username, Password);
	  }
	  
	  @Test(priority = -1,enabled = true)
	  @Parameters({"userName","passWord","Repass","Mobile_num"})
	  public void register(String username,String password,String repassword,String mobile_number){
		  AllOperations.register(username, password, repassword, mobile_number);
	  }
	  
	  @Test(dependsOnMethods = "login",priority = 2)
	  @Parameters({"Option","noOfRows","Exp_Description","Exp_Amount"})
	  public void expenses(String Option,String noOfRows,String Exp_Description,String Exp_Amount) throws Exception {
		  AllOperations.add_row(Integer.parseInt(noOfRows));
		  String desc[] = Exp_Description.split(";;");
		  String Amt[] = Exp_Amount.split(";;");
		  AllOperations.insert_data(Option,desc,Amt);
	  }
	  
	  @AfterClass
	  public void app_complete() {
		  System.out.println("App Cpmpleted...!");
	  }
}
