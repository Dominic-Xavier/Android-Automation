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
				throw new org.openqa.selenium.NoSuchElementException("Incorrect Option....!");
		}
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<1;j++) {
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
			case "income":{
				DisplayDate.income_checkbox().click();
				display_close("income");
				break;
			}
			case "expense":{
				DisplayDate.expense_checkbox().click();
				display_close("expense");
				break;
			}
			
			case "both":{
				DisplayDate.income_checkbox().click();
				DisplayDate.expense_checkbox().click();
				display_close("both");
				break;
			}
			default:
				throw new org.openqa.selenium.NoSuchElementException("Please enter correct keyword...!");
		}
	}
	
	public static void display_close(String option) throws InterruptedException {
		Alerts.accept().click();
		Thread.sleep(3000);
		if(option.equalsIgnoreCase("income") || option.equalsIgnoreCase("expense"))
			DisplayDate.close_Display_Activity().click();
		else if(option.equalsIgnoreCase("both"))
			DisplayDate.close_both().click();
	}
}
