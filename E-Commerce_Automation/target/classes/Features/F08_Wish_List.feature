@Smoke
Feature: User could add products to Wish List

  Scenario: A success Message Appears when user Add product to wish list
    Given   User Navigates to Home Page
    When    User Clicks on WishList button of product number "2"
    ######################### Expected Result ########################
    Then    A success Message is displayed to inform user that Product has been added to WishList
    And     The color of WishList Success Message should be "#4bb07a"

    Scenario: Quantity of the product increases after adding product to wish list
      Given   User Navigates to Home Page
      When    User Clicks on WishList button of product number "2"
      And     User Navigates to wish list page
      ####################### Expected Result #####################
      Then    Quantity of the product should be increased in wish list page

