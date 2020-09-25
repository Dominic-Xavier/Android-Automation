package com.finance;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.android.AndroidTestBase;
import com.operations.AllOperations;

import cucumber.api.java.en.And;

//@Listeners(com.testNgListener.TestNGListeer.class)
public class FinancialManager {
	
		boolean check_Mobile_Number;
	  
	  @BeforeMethod()
	  @Parameters({"Username","Password"})
	  public void login(String Username,String Password) throws InterruptedException, MalformedURLException {
		  AndroidTestBase.setUp();
		  Thread.sleep(2000);
		  AllOperations.login(Username, Password);
	  }
	  
	  @Test
	  @Parameters({"Option","noOfRows","Description","Amount"})
	  public void expenses(String Option,String noOfRows,String Description,String Amount) throws Exception {
		  AllOperations.add_row(Integer.parseInt(noOfRows));
		  String desc[] = Description.split(";;");
		  String Amt[] = Amount.split(";;");
		  AllOperations.insert_data(Option,desc,Amt);
		  AllOperations.delete_row();
	  }
	  
	  
	  @Test
	  @Parameters({"inc_Option","noOfRows","Inc_Description","Inc_Amount"})
	  public void income(String inc_Option,String noOfRows,String Inc_Description,String Inc_Amount) throws Exception {
		  AllOperations.add_row(Integer.parseInt(noOfRows));
		  String desc[] = Inc_Description.split(";;");
		  String Amt[] = Inc_Amount.split(";;");
		  AllOperations.insert_data(inc_Option,desc,Amt);
		  AllOperations.delete_row();
	  }
	  
	  @Test
	  @Parameters({"date","display_option"})
	  public void show_date(String date,String option) throws Exception {
		  String dates[] = date.split(";;");
		  String options[] = option.split(";;");
		  for(int i=0;i<options.length;i++) {
			  AllOperations.display(dates[0], dates[1], options[i]);
		  }
	  }
	  
	  @Test
	  @Parameters({"userName","passWord","Repass","Mobile_num"})
	  public void register(String username,String password,String repassword,String mobile_number){
		  AllOperations.register(username, password, repassword, mobile_number);
	  }
	  
	  @Test
	  @Parameters({"Mobile_num"})
	  public void Account_details(String registerMobileNumber) {
		  check_Mobile_Number = AllOperations.validate_number(registerMobileNumber);
		  Assert.assertEquals(check_Mobile_Number, true);
	  }
	  
	  @Test
	  public void total_Transactions() throws InterruptedException {
		  AllOperations.allTransactions();
	  }
	  
	  @AfterMethod()
	  public void logout() {
		  AndroidTestBase.logOut();
		  AndroidTestBase.close_App();
	  }
	  
}
