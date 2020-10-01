package implementation;

import java.net.MalformedURLException;
import java.util.Map;
import org.testng.Assert;
import com.android.AndroidTestBase;
import com.operations.AllOperations;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.Before;

public class FinancialManager {
	
	boolean check_Mobile_Number;
	
	@Given("^user is opening the application$")
	public void user_is_opening_the_application() throws MalformedURLException {
	    AndroidTestBase.setUp();
	}

	@Then("^user creates an account$")
	public void user_creates_an_account(String username, String password, String repassword, String mobile_number) {
		AllOperations.register(username, password, repassword, mobile_number);
	}

	@When("^user enters login credentials \"(.*)\" and \"(.*)\"$")
	public void user_enters_login_credentials_username_and_password(String Username, String Password) {
		AllOperations.login(Username, Password);
	}

	@Then("^user enters expense and income amount$")
	public void user_enters_expense_amount(DataTable data) throws Exception {
		String Exp_Option="",Exp_Description="",Exp_Amount="",Inc_Desc="",Inc_Amount="";
		int noOfRows=0;
		for(Map<String, String> map : data.asMaps(String.class, String.class)) {
			Exp_Option = map.get("Option");
			Exp_Description = map.get("Expense_Desc");
			Exp_Amount = map.get("Expense_Amount");
			Inc_Desc = map.get("Income_Desc");
			Inc_Amount = map.get("Income_Amount");
		}
		String count[] = Exp_Description.split(";;");
		noOfRows = count.length;
		String[] exp = Exp_Option.split(";;");
		AllOperations.user_Transactions(exp[0], noOfRows, Exp_Description, Exp_Amount);
	}

	@Then("^user displays the data for expense and income seperately and both$")
	public void user_displays_data_for_both_income_and_expense(DataTable data) throws Exception {
		String option="",date="";
		for(Map<String, String> map : data.asMaps(String.class, String.class)) {
			option = map.get("Option");
			date = map.get("Date");
		}
		String[] options = option.split(";;");
		for(int i=0;i<options.length;i++) {
			AllOperations.displaydata(options[i], date);
		}
	}

	@When("^user clicks on navigation view and click on my account$")
	public void user_clicks_on_navigation_view_and_click_on_my_account() {
		AllOperations.myaccount();
	}

	@Then("^user verifies weather the given mobile number \"(.*)\" is displayed correctly or not$")
	public void user_verifies_weather_the_given_mobile_number_is_displayed_correctly_or_not(String registerMobileNumber) {
		check_Mobile_Number = AllOperations.validate_number(registerMobileNumber);
		if(!check_Mobile_Number) 
			System.err.println("Given mobile number does not match");
		Assert.assertEquals(check_Mobile_Number, true);
	}

	@Then("^user clicks on navigation view and click on expense tab$")
	public void user_clicks_on_navigation_view_and_click_on_expense_tab() throws InterruptedException {
		AllOperations.allTransactions();
	}
	
	@Then("^user logs out and closes the application$")
	public void user_logs_out_and_closes_the_application() {
	    AndroidTestBase.logOut();
	    AndroidTestBase.close_App();
	}
	
}
