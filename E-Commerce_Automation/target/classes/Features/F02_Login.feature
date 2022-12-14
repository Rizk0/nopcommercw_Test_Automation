@Smoke
Feature: User should be able to Login to his account

  Scenario: User could Login Using Valid Credentials
    Given   User navigate to Login Page
    And     User Enters a valid Email address "Test1@example.com"
    And     User Enters a valid Password "Password123"
    When    User Clicks on Login Button
    ######## Expected Result ###################
    Then    User should be directed to Home Page "https://demo.nopcommerce.com/"
