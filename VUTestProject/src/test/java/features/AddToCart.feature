Feature: Add Item to cart

  Scenario Outline: Add Item to cart and validate cart
    Given user is on home page to validate cart
      And User clicks on <itemName> to land on product detail page
     When User enters <quantity> and clicks on addtocart button
     Then cart page is displayed with the correct <itemName>,<quantity>,<total>
     And close browsers
  
    Examples: 
  
      | itemName | quantity | total | 
      | Blouse   | 2        | $54   | 