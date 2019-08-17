
   @resourse
   Feature: Title of your feature
  I want to use this template for my feature file

  @sanity @regression
  Scenario: Telecom
    Given user need to open telecom webpage
    And click add tariff plan
    When user need to fill the tariff plan
    |1000|1200|500|100|1|10|1|
    Then  user gets the message 
    
    Scenario: Telecom
    Given user need to open telecom web page
    And click add customer to fill form
    When user is filling the application form
    And click submit button to open next window
    Then user should see the customer id is generated or not
    