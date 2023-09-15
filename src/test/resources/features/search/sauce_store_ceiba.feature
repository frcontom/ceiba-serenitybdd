Feature: Search by keyword

  @store
  Scenario: Store Sauce Sucess shopping cart
    Given that an user is on login page
    When  he login with account
      | username | standard_user |
      | password | secret_sauce |
    And  he select an article
      | 1 |
      | 2 |
      | 4 |
    And   he confirm order on shopping cart
    And  he add data user for purchase
      | firstname | 'Ceiba'    |
      | lastname  | 'Software' |
      | zipcode   | 18172      |
    Then  he should be to see confirm purchase message