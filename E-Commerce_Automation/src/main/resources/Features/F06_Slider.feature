@Smoke
Feature: User could navigate between sliders

  #### Login before Run Test scenario ##########
  Background: User Login using Valid credentials
    Given   User navigate to Login Page
    And     User Enters a valid Email address "Test@example.com"
    And     User Enters a valid Password "Password123"
    When    User Clicks on Login Button

   ####################################################### Test Scenarios ##################################################

   ############################################### Scenario 1. #############################################################

  Scenario Outline: User could select a slider and navigate to the product page in the slider
    Given   User Navigates to Home Page
    When    User Select Slider "<number>"
    And     User Clicks on the product Link in the Slider "<number>"
    ######## Expected Result #####################
    Then User should be directed to the product page "<link>"

    Examples:
    |number|link|
    |0     |https://demo.nopcommerce.com/nokia-lumia-1020|
    |1     |https://demo.nopcommerce.com/iphone-6|