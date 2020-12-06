Feature: Verify HomePage

  Scenario: Verify Paytm Page Title
    Given user land on "https://www.paytm.com" webpage
    When grab the page title
    Then Verify the page title

  Scenario: Verify broken link
    Given user land on "https://undostres.com.mx/invitar_amigos.php" webpage
    When links should be collected into one list
    Then verify if any link is broken or not
