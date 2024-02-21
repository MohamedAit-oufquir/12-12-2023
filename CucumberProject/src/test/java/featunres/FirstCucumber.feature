Feature: Login test
  Scenario: Valid username and valid password should able to login
    Given I navigate to the orangeHRM site
    And I add valid username
    And I add valid password
    When I click on the Login Button
    Then I should be in the dashboard page
    And I close the browser

    Scenario:
      Given I navigate to the orangeHRM site
      And I add valid username "Admin"
      And I add valid password "admin123"
      When I click on the Login Button
      Then I should be in the dashboard page
      And I close the browser

      Scenario Outline: Add multiple date
        Given I navigate to the orangeHRM site
        And I add valid username <username>
        And I add valid password <password>
        When I click on the Login Button
        Then I should be in the dashboard page <status>
        And I close the browser
        Examples:
        |username|password|status|
        |"Admin"   |"admin123"|"pass"|
        |"Admin"    |"1234"    |"fail"|
        |"Admin123"|"Admin123"|"fail"|
        |"Admin1235"|"1231"|"fail"|

