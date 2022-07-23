@RetailPageTesting
Feature: RetailPage

  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username ‘username’ and password 'pass’
    And User click on Login button
    Then User should be logged in to MyAccount dashboard
#@777
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with below information
      | company | website   | taxID | paymentMethod | payeeName |
      | apple   | apple.com |  2222 | cheque        | apple     |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message
#@00
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName   | abaNumber | swiftCode | accountName | accountNumber |
      | kabul bank |    464958 |     28356 | Ahmad       |      12457896 |
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName | email          | telephone |
      | Robert    | Madiston | 1243@gmail.com | 916161623 |
    And User click on Continue button
    Then User should see a success message 'Success: Your account has been successfully updated.'
