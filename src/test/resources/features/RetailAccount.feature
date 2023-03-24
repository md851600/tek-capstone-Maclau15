@all
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Jsmith15@gmail.com' and password 'Tek/123458'
    And User click on login button
    And User should be logged in into Account

  @Updatedinformation
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'firstName' and Phone 'phoneNumber'
    And User click on Update button
    Then user profile information should be updated

  @addpayment
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4000456743217880 | Alex       |              12 |           2026 |          125 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @EditDebitCard
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4000456743217000 | Alex       |              11 |           2026 |          135 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @RemoveDebitCard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @addAddres
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
      | value   | value    | value       | value         | value | value | value | value   |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
      | value   | value    | value       | value         | value | value | value | value   |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @RemoveAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed

  @Updatepassword
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword   | confirmPassword |
      | 'Tek/123458'     | 'Tek/1234589' | 'Tek/1234589'   |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'
