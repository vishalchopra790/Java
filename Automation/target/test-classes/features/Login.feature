Feature: Application Login

Scenario: Home page default login
Given User is on the Netbanking landing page
When User login into application with username "vishal" name and password "4311"
Then Home page is populated
And Cards are displayed "true" 

Scenario: Home page default login
Given User is on the Netbanking landing page
When User login into application with username "jhn" name and password "4311"
Then Home page is populated
And Cards are displayed "false"