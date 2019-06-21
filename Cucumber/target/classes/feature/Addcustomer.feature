
Feature: Add customer functional validation

  Scenario: 
    Given The user is in telecom home page
    And The user click on add customer
    When The user is filling all the details
    And The user click on submit button
    Then The user should be displayed id

 Scenario: 
    Given The user is in tele homepage
    And The user click on traiff plan
    When The user is filling traiff plan details
    And The user is click on submit option
    Then The user should able to confirmation plan