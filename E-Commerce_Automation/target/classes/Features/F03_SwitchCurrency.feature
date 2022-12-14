@Smoke
Feature: User can switch between currencies

  #### Login before Run Test scenario ##########
  Background: User Login using Valid credentials
    Given   User navigate to Login Page
    And     User Enters a valid Email address "Test@example.com"
    And     User Enters a valid Password "Password123"
    When    User Clicks on Login Button

  ####################################################### Test Scenarios ##################################################

  ############################################### Scenario 1. #############################################################

  Scenario Outline: User can Select Euro Currency For shopping
    Given   User Navigates to Home Page
    When    User Selects "<Currency>" Currency from Dropdown list
    ########## Expected Result #######################
    Then    Prices of Displayed products should be in "<Sign>" Currency

    Examples:
    |Currency | Sign |
    |Euro     |€     |
    |US Dollar|$     |





