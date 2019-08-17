@dinu
Feature: Title of your feature
  I want to use this template for my feature file

  @dinu @we
  Scenario Outline: ADD Customer Details
    Given user is in demoguru web page
    And click add customer details
    When fill the required field"<firstname>","<lastname>","<email>","<addr>","<phno>"
    And click submit form to proceed
    Then ID get generated or not

    Examples: 
      | firstname | lastname | email              | addr  | phno       |
      | Dinesh    | kumar    | dinutalk@gmail.com | karur | 8825524233 |
      | Elango    | k        | elango@gmail.com   | Erode | 7708255113 |
@dnsh @er
  Scenario Outline: Tariff
    Given user is in demoguru page
    And click add tariff details
    When fill the required tariff plan"<Monthly Rental>","<Free Local Minutes>","<Free International Minutes>","<Free SMS Pack>","<Local Per Minutes Charges>","<International Per Minutes Charges>","<SMS Per Charges>"
    And click submit form to next page
    Then tariff paln is successfully entered

    Examples: 
      | Monthly Rental | Free Local Minutes | Free International Minutes | Free SMS Pack | Local Per Minutes Charges | International Per Minutes Charges | SMS Per Charges |
      |           1000 |               1000 |                        500 |           100 |                         1 |                                 5 |               1 |
      |           1200 |               1000 |                        600 |           100 |                         2 |                                 5 |               1 |
