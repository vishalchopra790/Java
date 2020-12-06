	Feature: Application Login

Scenario Outline: Positive Valid user 
Given Intialize the browser with chrome
Given Navigate to "https://rahulshettyacademy.com"
Given Click on Login link on home and laded to secure login page
When User login into application with username <username> and password <password>
Then Verifu user is sucessfully login
And Close the browser

Examples:
|username                    |password           |
|vishalchopra790@gmail.com   |Vishal@18          |


Scenario Outline: Forgot Password   
Given Intialize the browser with chrome
And Navigate to "https://rahulshettyacademy.com"
And Click on Login link on home and laded to secure login page
When User login into application with username <username> and password <password>
Then Invalid credentials
Then User will navigate to forgot password page 
Then User will insert email for setting the password <username>
And Close the browser

Examples:
|username                    |password           |
|vishalchopra@gmail.com      |Vishal@18          |




