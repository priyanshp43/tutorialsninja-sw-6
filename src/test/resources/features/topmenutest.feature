Feature: Top Menu Navigation Tests

  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given Mouse hover on Desktops Tab
    And click on Desktops tab
    When I call the selectMenu method and pass the menu "Show All Desktops"
    Then Verify the txt "Desktops"

  Scenario: verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
    Given Mouse hover on Laptops & Notebooks Tab
    And click on Laptops & Notebooks tab
    When I call the selectMenu method and pass the menu "Show All Laptops & Notebooks"
    Then Verify the txt "Laptops & Notebooks"

  Scenario: verifyUserShouldNavigateToComponentsPageSuccessfully
    Given Mouse hover on Components Tab
    And click on Components tab
    When I call the selectMenu method and pass the menu "Show All Components"
    Then Verify the txt "Components"