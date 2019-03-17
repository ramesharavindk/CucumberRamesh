#Author: your.email@your.domain.com

Feature: To test Add customer

  Scenario: Reset Check
    Given The user is in add customer page
    And The user fill all the customer details
    When The user clicks Reset button
    Then I validate all fields is empty
 
