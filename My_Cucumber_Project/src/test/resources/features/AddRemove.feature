Feature:Adding and removing elements to HerokuApp
  @CGH
  Scenario: Add Remove element should be display
    Given User navigate to homepage
    Then  Add remove element should be displayed

    Scenario: Click on add element Add Element button  must dispalyed
      Given user is on home page
      When User click on on link
      Then user navigate to next page
      And Button must be displayed


  Scenario: User click on Add button , delete button should display
    Given user is on home page
    When  user moved to homepage then user will click on Add elemnet
    Then Display button must visible to user


  Scenario: User click on Delete button , only add button should display
    Given user is on home page
    When  user moved to homepage then user will click on Add elemnet
    And  click on delete element
    Then user is able to see only add button

