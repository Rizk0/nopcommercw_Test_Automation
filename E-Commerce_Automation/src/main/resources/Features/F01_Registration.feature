@Smoke
Feature: User could register with a new account
  Scenario: User can create new account using valid credentials
    Given User navigate to Register Page
    And   User selects a gender Type "Male"
    And   User Enters Firstname "Abdulrahman" and Lastname "Ayman"
    And   User Select His date of birth Day "1" Month "10" Year "1997"
    And   User Enters Email Address "Test1@example.com"
    And   User fills Password fields "Password123" "Password123"
    When  User Clicks on Register Button
    #######Expected Result#########
    Then  User directed to successful register page "https://demo.nopcommerce.com/registerresult/1?returnUrl=/"
    And   A success Message is displayed "Your registration completed"
    And   The color of Success Message should be "rgba(76, 177, 124, 1)"