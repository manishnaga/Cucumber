
Feature: Add customer functionality validation
 

  Scenario: Add customer page
    Given The user is tele home page
    And The user click the add customer option
    When The user fill the all details
    |fisrtName|manish|
    |lastName|kandan|
    |email|maniya@123gmail.com|
    |address|omr thuraipakkam|
    |phone|7895468652|
    And The user click on submit button
    Then The user should be getting customer id


 