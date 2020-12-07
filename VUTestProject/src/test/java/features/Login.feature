Feature: Register to Site

Scenario Outline: Registering with valid email
Given user is on home page to validate login
And Click on Signin link to land on Secure sign in Page
When User enters <Email> and clicks create account button
And User enters <FirstName>,<LastName>,<Password>,<Address>,<City>,<State>,<Country>,<PostCode>,<Mobile> and click register button
Then Verify that user is succesfully Registers


Examples: 

| FirstName | LastName |Email      | Password |Address   | City     | State         | PostCode | Mobile    | Country       |
| Sumit     | Mathur   | Txx@201.com |  Pass123 | Add1     | New York | New York      | 12345    | 01234567  | United States |

  Scenario Outline: Registering with invalid email
    Given user is on home page to validate login
      When Click on Signin link to land on Secure sign in Page
    And User enters Invalid <Email> and click on create account button
     Then Email error is displayed on page
     And close browsers

    Examples: 
      | username         | 
      | test99@gmailcom | 




