Feature: Vena Dev Environment Solutions
  @Reg
  Scenario Outline: Verify Login
    Given User must land on login page
    When user login with "<username>" and "<password>"
    Then Verify user logged into profile with "<Profile_name>"
    And  User click on logout button

    Examples:
      | username                   | password        | Profile_name  |
      | vishal.chopra@axaxldev.com | C0mmunication@6 | Vishal Chopra |
  @Reg
   Scenario Outline: Login Test fail
      Given User must land on login page
      When user login with wrong "<username>" and "<password>" and click submit
      Then A pop up will "Incorrect username or password."

     Examples:
       | username                   | password        |
       | vishal.chopra@axaxld.com   | C0mmunication@6 |
    @Reg
     Scenario Outline: Verify forgot password functionality
       Given User must land on login page
       When user click on forgot pasword
       Then user navigated to forgot password webpage
       When user insert "<username>" email  address to get new password reset link on email
       Then Message Display "Thank you, we've got it!"


       Examples:
         | username                   |
         | vishal.chopra@axaxld.com   |