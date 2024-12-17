Feature: Laptops and Notebooks Page Tests

  Scenario: verifyProductsPriceDisplayHighToLowSuccessfully
    Given Mouse hover on Laptops & Notebooks tab
    And click on Laptops & Notebooks tb
    When I click on Show All Laptops & Notebooks
    And I select "Sort By" "Price (High > Low)"
    Then Verify the product prices will arrange in High to Low order

  Scenario: verifyThatUserPlaceOrderSuccessfully
    Given Mouse hover on Laptops & Notebooks Tb
    And click on Laptops & Notebooks tb
    When I click on Show All Laptops & Notebooks
    And I select "Sort By" "Price (High > Low)"
    And I select product MacBook
    Then Verify text  "MacBook"
    And click on Add To Cart button
    Then Verify a message "Success: You have added MacBook to your shopping cart!"
    When I click on the link shopping cart displayed in the success message
    Then Verify txt "Shopping Cart"
    And Verify the product name "MacBook"
    And I change quantity to "2"
    And click on Update tab
    Then Verify the msg "Success: You have modified your shopping cart!"
    And Verify the total is "£737.45"
    When I click on the "Checkout" button
    Then Verify txt "Checkout"
    And Verify text "New Customer"
    When I click on the "Guest Checkout" radio button
    And click on Continue tab
    And I fill the mandatory fields
    And click on Continue button
    And I add comments about my order into the text area
    And I check the "Terms & Conditions" checkbox
    And click on Continue button
    Then Verify a message "Warning: Payment method required!"
