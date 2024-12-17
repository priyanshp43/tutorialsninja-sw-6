Feature: Desktop Product Tests

  Scenario: verifyProductArrangeInAlphaBaticalOrder
    Given Mouse hover on "Desktops" Tab
    And click on "Desktops" tab
    When I click on "Show All Desktops"
    And I select "Sort By" position "Name: Z to A"
    Then Verify the products will arrange in descending order

  Scenario Outline: verifyProductAddedToShoppingCartSuccessFully
    Given Mouse hover on "Currency Dropdown" and click
    And Mouse hover on "£Pound Sterling" and click
    When Mouse hover on "Desktops" Tab
    And click on "Show All Desktops"
    And I select "Sort By" position "Name: A to Z"
    And I select product "<Product>"
    Then Verify the product name is "<Product>"
    And I enter quantity "1" using Select class
    And click on "Add to Cart" button
    Then Verify the message "Success: You have added <Product> to your shopping cart!"
    When I click on the link "shopping cart" displayed in the success message
    Then Verify the text "Shopping Cart"
    And Verify the product name is "<Product>"
    And Verify the model is "<Model>"
    And Verify the total price is "<Price>"

    Examples:
      | Product      | Model      | Price   |
      | HTC Touch HD | Product 1  | £74.73  |
      | iPhone       | Product 11 | £75.46  |
      | iPod Classic | Product 20 | £74.73  |
      | MacBook      | Product 16 | £368.73 |
      | MacBook Air  | Product 17 | £736.23 |
      | Sony VAIO    | Product 19 | £736.23 |

