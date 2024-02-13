Feature: Search and compare products on main and TopOffers Page

  Scenario: Product search on both Home and Offers Page
    Given User is on GreenCart page
    When  User searches with shortName Tom and extracts actual corresponding product name
    And   User opens TopDeal page
    Then  User searches for same Tom shortName on Offers page to verify that product exists
    And   Validate product name matches with homePage product name

  Scenario Outline: Multiple Products search on both Home and Offers Page
    Given User is on GreenCart page
    When  User searches with shortName <Name> and extracts actual corresponding product name
    Then  User searches for same <Name> shortName on Offers page to verify that product exists
    And   Validate product name matches with homePage product name

    Examples:
      | Name |
      | Tom  |
      | Pot  |
      | Stra |
