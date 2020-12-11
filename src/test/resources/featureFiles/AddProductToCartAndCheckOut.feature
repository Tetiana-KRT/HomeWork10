Feature: Add a product to cart and check out
  As a guest user
  I want to be able to add a product to cart and check out
  So that I can the order summary
  Scenario: Navigate to the home page, search the product, add it to cart, check out, verify total amount
    Given An anonymous user opens Home page
    And The user searches for the product id "1934793"
    And The user is redirected to the Search result page
    And The user clicks on the product with the product id "1934793"
    And The user is redirected to the Product details page
    And The user clicks on Add to cart button
    And The user is redirected to Add product to cart popup
    And The user clicks on Check out button
    And The user is redirected to the Cart page
    And The user can view order summary
    | Subtotal | Total    |
    | ￥610.00 | ￥610.00 |
    And The user clicks on Check out in cart button
    And The user is redirected to the Register page
    And The user enters a guest e-mail address "test@user.com" to Email address field
    And The user enters a guest e-mail address "test@user.com" to Confirm email address field
    When The user clicks on Check out as guest button
    And The user is redirected to the Order summary page
    Then The user can see the final order review
      | Subtotal | Total    | Tax   |
      | ￥610.00 | ￥610.00 | ￥55.45|