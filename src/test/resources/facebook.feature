@feature02
@regression
Feature: To validate the login functionality of Facebook

  Background: 
    Given To launch the browser and hit the facebook url

  Scenario: To test the invalid userName and invalid password
    When To pass the invalid userName in userName field
      | mama@gmail.com | venky@gmail.com | sanget@gmail.com | kumban@gmail.com | sabam@gmail.com | beebam@gmail.com |
    And To pass the invalid password in password field
      | sjs   | uhxa   | jalih  | sjiuq  |
      | 11111 |  88888 |  77777 | 111111 |
      | sssss | dddddd | bbbbbb | ccccc  |
    And To click the login button
    

  #Then To cloase the Browser
  @sanity
  Scenario Outline: To check with bulk of datas
    # Given To launch the browser and open the facebook url
    When To pass the bulk of datas"<userName>" in userName field
    And To pass the bulk of datas"<Password>" in Password field
    And To click the login button
    

    Examples: 
      | userName          | Password |
      | sara@gmail.com    |     1234 |
      | verra@gmail.com   |    87989 |
      | kadan11@gmail.com |     5678 |
