Feature: My Account Page Tests

  Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully
    Given I click on "My Account" link
    When I call the method "selectMyAccountOptions" and pass the parameter "Register"
    Then Verify a text "Register Account"

  Scenario: verifyUserShouldNavigateToLoginPageSuccessfully
    Given I click on "My Account" link
    When I call the method "selectMyAccountOptions" and pass the parameter "Login"
    Then Verify a text "Returning Customer"

  Scenario: verifyThatUserRegisterAccountSuccessfully
    Given I click on "My Account" link
    When I call the method "selectMyAccountOptions" and pass the parameter "Register"
    And I enter First Name
    And I enter Last Name
    And I enter Email
    And I enter Telephone
    And I enter Password
    And I enter Password Confirm
    And I select Subscribe "Yes" radio button
    And I click on the Privacy Policy checkbox
    And I click on the Continue button
    Then Verify a msg "Your Account Has Been Created!"
    When I click on the Continue button
    And I click on "My Account" link
    When I call the method "selectMyAccountOptions" and pass the parameter "Logout"
    Then Verify a text "Account Logout"
    When I click on the Continue button

  Scenario: verifyThatUserShouldLoginAndLogoutSuccessfully
    Given I click on "My Account" link
    When I call the method "selectMyAccountOptions" and pass the parameter "Login"
    And I enter Email address
    And I enter Password
    And I click on the Login button
    Then Verify a text "My Account"
    Given I click on "My Account" link
    When I call the method "selectMyAccountOptions" and pass the parameter "Logout"
    Then Verify a text "Account Logout"
    When I click on the Continue button
