Feature: Login into Application
 
Scenario Outline: Positive test validating login
Given Initialize the browser and Navigate to "http://qaclickacademy.com" Site
When Click on login link in home page to land on secure sign in page
Then User navigate to login page
When Users enters <username> and <password> and login
Then Verify that user is successfully logged in
And Close browser
 
Examples:
|username		        |password	|
|kizuryuukaze@gmail.com	|q1w2e3		|
|test99@gmail.com	    |123456		|