@sd
Feature: Title of your feature
  I want to use this template for my feature file

  @dd
  Scenario: ADD Customer Detail
    Given user is in demoguru website
    And click add customer to give details
    When fill the required field
      | Dinesh | kumar | dinutalk@gmail.com | karur | 8825524233 |
      | Elango | k     | elango@gmail.com   | Erode | 7708255113 |
      | Dinesh | kumar | dinutalk@gmail.com | karur | 8825524233 |
    And click submit the form
    Then ID is generated or not
@dinu @hr
  Scenario: Tariff
    Given user is in demoguru site
    And click add tariff detail
    When fill the required tariff plan
      | Mr   | Flm  | Fim | Fsp | Lfm | Imc | Sm |
      | 1000 | 1000 | 500 | 100 |   1 |   5 |  1 |
      | 1200 | 1000 | 600 | 100 |   2 |   5 |  1 |
      | 1100 | 1000 | 600 | 150 |   1 |   5 |  1 |
    And click submit form to next step
    Then tariff paln is successfully done
