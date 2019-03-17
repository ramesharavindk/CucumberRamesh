#Author: Ramesh
@tag
Feature: To validate payment gateway

  @tag2
  Scenario Outline: Payment Gateway
    Given The user is in payment gateway page
    When The user select quantity "<quantity>"
    And The user click buynow button
    And The user fill the card details "<card_nmuber>","<month>","<year>","<cvv_code>"
    And The user click pay button
    Then The user should see the success message and order id

    Examples: 
      | quantity | card_nmuber      | month | year | cvv_code |
      |        1 | 4330030149383044 |    02 | 2026 |      233 |
      |        2 | 4330030149383044 |    03 | 2028 |      233 |
