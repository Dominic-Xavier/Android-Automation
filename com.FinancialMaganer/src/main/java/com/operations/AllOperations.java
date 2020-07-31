package com.operations;

import com.android.AndroidTestBase;
import com.elementDetails.Alerts;
import com.elementDetails.DatabaseElements;
import com.elementDetails.DisplayDate;
import com.elementDetails.LoginDetails;
import com.elementDetails.Register;

public class AllOperations {
	static int rowCount = 0;
	public static void login(String username,String password) {
		LoginDetails.userName().sendKeys(username);
		LoginDetails.passWord().sendKeys(password);
		AndroidTestBase.backButtonClick();
		LoginDetails.loginButton().click();
	}
	
	public static void register(String username,String password,String repassword,String mobile_number){
		AndroidTestBase.expWait(10, LoginDetails.registerButton());
		LoginDetails.registerButton().click();
	  	Register.username().sendKeys(username);
		Register.password().sendKeys(password);
		Register.rePassword().sendKeys(repassword);
		AndroidTestBase.backButtonClick();
		Register.mobileNumber().sendKeys(mobile_number);
		AndroidTestBase.backButtonClick();
		Register.registerButton().click();
	}
	
	public static void add_row(int noOfRows) {
		rowCount = noOfRows;
		for(int i=0;i<rowCount;i++)
		DatabaseElements.addRow().click();
	}
	
	public static void insert_data(String Option,String Description[],String Amnount[]) throws Exception {
		int position = 0;
		DatabaseElements.optionSelect().click();
		switch(Option.toLowerCase()) {
			case "expense":
				DatabaseElements.option_Expense().click();
			break;
			case "income":
				DatabaseElements.option_Income().click();
			break;
			default:
				throw new Exception("Incorrect Option....!");
		}
		for(int i=1;i<=rowCount;i++) {
			for(int j=1;j<2;j++) {
				DatabaseElements.description(i,j).sendKeys(Description[position]);
				DatabaseElements.amount(i,++j).sendKeys(Amnount[position]);
			}
			position++;
		}
		DatabaseElements.saveData().click();
		Alerts.accept().click();
	}
	
	public static void delete_row() {
		for(int i=0;i<rowCount;i++)
			DatabaseElements.deleteRow().click();
	}
	
	public static void display(String Start_date,String End_Date,String option) throws Exception {
		DatabaseElements.displayData().click();
		DisplayDate.startDate().sendKeys(Start_date);
		DisplayDate.endDate().sendKeys(End_Date);
		switch(option.toLowerCase()) {
			case "income":
				DisplayDate.income().click();
			break;
			case "expense":
				DisplayDate.expense().click();
			break;
			case "both":{
				DisplayDate.income().click();
				DisplayDate.expense().click();
			break;
			}
			default:
				throw new Exception("Invalid Option...!");
		}
		DisplayDate.okButton().click();
		Thread.sleep(3000);
		DisplayDate.close_Display_Activity().click();
	}
}
