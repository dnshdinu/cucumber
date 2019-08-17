@dinu
Feature: Title of your feature
  I want to use this template for my feature file

  @dinu @dd
  Scenario: Telecom
    Given user is in telecom web page
    And click add customer
    When fill the form
      | firstname | Dinesh             |
      | lastname  | kumar              |
      | email     | dinutalk@gmail.com |
      | addr      | karur              |
      | phno      |         8825524233 |
    And click submit
    Then id get generated
@sd
  Scenario: Tariff
    Given user is in telecom page
    And click add tariff
    When fill the tariff plan
      | Monthly Rental                    | 1000 |
      | Free Local Minutes                | 1500 |
      | Free International Minutes        |  500 |
      | Free SMS Pack                     |  100 |
      | Local Per Minutes Charges         |    1 |
      | International Per Minutes Charges |    5 |
      | SMS Per Charges                   |    1 |
    And click submit form
    Then completed successfully
