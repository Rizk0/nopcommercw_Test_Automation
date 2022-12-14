@Smoke
Feature: User can hover to different categories and select sub categories

    #### Login before Run Test scenario ##########
  Background: User Login using Valid credentials
    Given   User navigate to Login Page
    And     User Enters a valid Email address "Test@example.com"
    And     User Enters a valid Password "Password123"
    When    User Clicks on Login Button

    ####################################################### Test Scenarios ##################################################

   ############################################### Scenario 1. #############################################################

  Scenario: User can hover to computer category and select Desktops sub-category
    Given   User Navigates to Home Page
    When    User Hovers to Computer Category
    And     User Selects Desktops sub-category
    Then    User should be directed to sub-category page "https://demo.nopcommerce.com/desktops"