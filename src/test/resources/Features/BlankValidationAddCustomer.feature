#Author: your.email@your.domain.com

Feature: To test Add customer

  Scenario: Blank Validation Add Customer
    Given The user is in add customer page
    When The user clicks the submit button
    Then The user should see the pop message please fill all fields