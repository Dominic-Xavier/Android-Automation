Feature: Financial Manager

Scenario: Full app testing

Given user is opening the application

 #Register Scenario
#Then user creates an account
#|user_name|Password|Mobile_number|
#|  Xavier |Dominic | 9600066074  |

#Login Scenario
When user enters login credentials "Dominic" and "Xavier"

#User is entering data to track his financial expenses
Then user enters expense and income amount
|      Option   |   Expense_Desc   |Expense_Amount |      Income_Desc      |   Income_Amount  |
|Expense;;Income|food;;dress;;hotel|500;;1200;;1200|Salary;;Pension;;credit| 20000;;5000;;500 |

#User's data is displayed
Then user displays the data for expense and income seperately and both
|         Option      |         Date        |
|Expense;;Income;;Both|01-01-2020;;30-10-2020|

#Click on my account and verify the mobile number is correct or not
When user clicks on navigation view and click on my account
Then user verifies weather the given mobile number "9600066074" is displayed correctly or not


#Click on expense tab to get the total data for the user month wise
Then user clicks on navigation view and click on expense tab
Then user logs out and closes the application

