
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
 Scenario: Add customer details in column value
    Given telecom home page
    And user click the add customer details
    When user filling the all details
          |firstName|manish|
          |lastName|kandan|
          |email|maniya@123gmail.com|
          |address|omr thuraipakkam|
          |phone|7895468652|
    And user clicking on submit button
    Then user should be viewed customer id detail

 