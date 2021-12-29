Feature: Application Login functionality
 
 
  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into application with "Jin" and password "1234"
    Then homepage is populated
    And Cards displayed are "true"
    
    
    
    Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into application with "John" and password "4567"
    Then homepage is populated
    And Cards displayed are "false"
