@Smoke
Feature: User could follow website accounts int follow us section

  #### Login before Run Test scenario ##########
  Background: User Login using Valid credentials
    Given   User navigate to Login Page
    And     User Enters a valid Email address "Test@example.com"
    And     User Enters a valid Password "Password123"
    When    User Clicks on Login Button

   ####################################################### Test Scenarios ##################################################

   ############################################### Scenario 1. #############################################################

  Scenario Outline: User could navigate to networks Links of the Website (Facebook , Twitter , ... )
    Given  User Navigates to Home Page
    When   User Scroll down to follow Us section and Click on "<Network>" Icon
    Then   User should be directed to Network Page "<Link>"

    Examples:
    |Network | Link |
    |facebook| https://www.facebook.com/nopCommerce    |
    |twitter | https://twitter.com/nopCommerce         |
    |rss     | https://demo.nopcommerce.com/new-online-store-is-open|
    |youtube | https://www.youtube.com/user/nopCommerce|