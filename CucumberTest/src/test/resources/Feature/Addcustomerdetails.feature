

Feature: Add customer details functionality validation
  
@tag
  Scenario: Add customer details
    Given The user is telecom home page
    And The user click the add customer details
    When The user filling the all details
   | mani | kandan | manish@123.com | turaippakam chennai | 94786585689 | 
    And The user clicking on submit button
    Then The user should be viewed customer id detail