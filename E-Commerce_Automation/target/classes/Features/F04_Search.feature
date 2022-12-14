@Smoke
Feature: User could search for products in search box

  #### Login before Run Test scenario ##########
  Background: User Login using Valid credentials
    Given   User navigate to Login Page
    And     User Enters a valid Email address "Test@example.com"
    And     User Enters a valid Password "Password123"
    When    User Clicks on Login Button

   ####################################################### Test Scenarios ##################################################

   ############################################### Scenario 1. #############################################################

  Scenario Outline: User Could search for Products using Product name
    Given   User clicks on Search box
    And     User enter a product name as "<product name>" to search for
    When    User Clicks on Search Button
    ############ Expected Result ####################
    Then   User directed to Search Page "https://demo.nopcommerce.com/search?q="
    And    User could find relative products to the product name "<product name>"

    Examples:
    |product name|
    |book        |
    |Apple       |
    |Cam         |


       ############################################### Scenario 2. #############################################################

  Scenario Outline: User Could search for Products using SKU
    Given   User clicks on Search box
    And     User enter a product name as "<product SKU>" to search for
    When    User Clicks on Search Button
    ############ Expected Result ####################
    Then   User directed to Search Page "https://demo.nopcommerce.com/search?q="
    And    User could find the corresponding product to the entered SKU "<product SKU>"

    Examples:
      |product SKU|
      |SCI_FAITH   |
      |APPLE_CAM   |
      |SF_PRO_11   |