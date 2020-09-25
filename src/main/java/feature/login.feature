Feature: Financial Manager

Scenario: Full app testing

Given user is opening the application

#Register Scenario
Then user creates an account

#Login Scenario
When user enters login credentials username and password

#User is entering data to rack his financial expenses
Then user enters expense amount
And user enters income amount

#User's data is displayed
Then user displays the data for expense
And user displays the data for income
And user displays data for both income and expense

#Click on my account and verify the mobile number is correct or not
When user clicks on navigation view and click on my account
Then user verifies weather the given mobile number is displayed correctly or not

#Click on expense tab to get the total data for the user month wise
When user clicks on navigation view and click on expense tab
Then user verifies weather the given total income and expense is correct or not