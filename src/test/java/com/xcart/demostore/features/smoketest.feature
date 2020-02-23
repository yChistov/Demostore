@smoketest
Feature: UI tests for this site https://demostore.x-cart.com/

  Scenario: Test case 1
    Given Open "https://demostore.x-cart.com/" page
    When Add random item to cart
    And Open cart and verify item is there

  Scenario: Test case 2
    Given Open "https://demostore.x-cart.com/" page
    And Verify that every product price has "$" symbol before amount

  Scenario: Test case 3
    Given Open "https://demostore.x-cart.com/" page
    When Find "Apple iPhone 8 Plus" by search
    And Add to cart
    Then Verify "Apple iPhone 8 Plus" is in cart