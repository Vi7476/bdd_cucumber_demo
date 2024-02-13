Feature: find needed product and add required quantity to cart
@addProductsToCart
  Scenario Outline: Find Tomato, verify productName, add 3 pieces to cart, verify checkout page
    Given User is on GreenCart page
    When  User searches with shortName <Name> and extracts actual corresponding product name
    And   Adds "3" pieces of product to cart
    Then  user proceeds to checkout page
    And   verify that user is able to enter promocode
    And   verify that user is able to place an order

    Examples:
      | Name |
      | Tom  |