
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: cucumber datadriven
   Given user is in home page
    And user click the add traiff plan link
    When user filling the traiff plan details "<monthly rental>","<free loc>","<free internation>","<free sms>","<local per minutes>","<international mins>","<sms charge>"
    And user clicking the submit button
    Then user will displayed traiff plan details
   
    
    Examples: 
      | monthly rental  | free loc | free internation  | free sms | local per minutes | international mins | sms charge | 
      | 100 | 201| 300  | 10 | 400 | 500| 601 |
      | 102  | 204 | 210  | 25 | 402 | 502 | 605 |
      | 105  | 206 | 310  | 38 | 405 | 504 | 610 |