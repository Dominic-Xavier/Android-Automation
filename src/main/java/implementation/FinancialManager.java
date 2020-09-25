package implementation;

import java.net.MalformedURLException;
import org.testng.Assert;
import com.android.AndroidTestBase;
import com.operations.AllOperations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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

	@When("^user enters login credentials username and password$")
	public void user_enters_login_credentials_username_and_password(String Username, String Password) {
		AllOperations.login(Username, Password);
	}

	@Then("^user enters expense amount$")
	public void user_enters_expense_amount(String noOfRows, String Exp_Description, String Exp_Amount, String Exp_Option) throws Exception {
		
		AllOperations.user_Transactions(Exp_Option, noOfRows, Exp_Description, Exp_Amount);
	}

	@Then("^user enters income amount$")
	public void user_enters_income_amount(String inc_Option,String noOfRows,String Inc_Description,String Inc_Amount) throws Exception {
		AllOperations.user_Transactions(inc_Option, noOfRows, Inc_Description, Inc_Amount);
	}

	@Then("^user displays the data for expense$")
	public void user_displays_the_data_for_expense(String date, String option) throws Exception {
		AllOperations.displaydata(option, date);
	}

	@Then("^user displays the data for income$")
	public void user_displays_the_data_for_income(String date, String option) throws Exception{
		AllOperations.displaydata(option, date);
	}

	@Then("^user displays data for both income and expense$")
	public void user_displays_data_for_both_income_and_expense(String date, String option) throws Exception {
		AllOperations.displaydata(option, date);
	}

	@When("^user clicks on navigation view and click on my account$")
	public void user_clicks_on_navigation_view_and_click_on_my_account(String registerMobileNumber) {
		AllOperations.myaccount();
	}

	@Then("^user verifies weather the given mobile number is displayed correctly or not$")
	public void user_verifies_weather_the_given_mobile_number_is_displayed_correctly_or_not(String registerMobileNumber) {
		check_Mobile_Number = AllOperations.validate_number(registerMobileNumber);
		Assert.assertEquals(check_Mobile_Number, true);
	}

	@When("^user clicks on navigation view and click on expense tab$")
	public void user_clicks_on_navigation_view_and_click_on_expense_tab() throws InterruptedException {
		AllOperations.allTransactions();
	}

	@Then("^user verifies weather the given total income and expense is correct or not$")
	public void user_verifies_weather_the_given_total_income_and_expense_is_correct_or_not() {
	    
	}
}
