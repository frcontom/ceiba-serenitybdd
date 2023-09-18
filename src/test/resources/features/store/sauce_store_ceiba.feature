Feature: Search by keyword

  @store
  Scenario: Store Sauce Sucess shopping cart
    Given that an user is on login page
    When  he login with account
      | username | standard_user |
      | password | secret_sauce |
    And he validate user intro a your account
    And  he select an articles
      | 1 |
      | 2 |
      | 4 |
    And he open cart visible products selected
    And he confirm order on shopping cart
    And he add data user for purchase
      | firstname | 'Ceiba'    |
      | lastname  | 'Software' |
      | zipcode   | 18172      |
    And  he should be to see confirm purchase message
    Then he validate the purchase message