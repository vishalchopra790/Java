Feature: CheckBox Module

  Scenario: Checkbox functionality
    Given user is on home page
    Then i should see checkbox link
    When I clicked on checkbox module
    Then I should navigated to new page and verify checkbox heading
    And I should see two checkboxes
    And By default checkbox2 should be  selected
    When I check checkbox1 and uncheck checkbox2
    Then Only checkbox1 should be selected and checkbox2 unchecked