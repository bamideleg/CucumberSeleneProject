

@tag
Feature: Ebay search product search functionality will be use to test the application 
with different dataset as per use case.


#Adding background enable tester to reuse common steps such as Use is onthe homepage. 

Background:
  Given User is on https://ebay.com
 

  @tag1
  Scenario: Test ebay search functionality
    And enter product name Ball
    And click on submit button
#    Then application should return the products including the count
    And Close the browser1
    
     @tag3
  Scenario: Test ebay search functionality
    And enter product name Shirt
    And click on submit button
#    Then application should return the products including the count
    And Close the browser1
     
     
         @tag4
  Scenario: Test ebay search functionality
    And enter product name TV
    And click on submit button
#    Then application should return the products including the count
    And Close the browser1
    
             @tag
  Scenario: Test ebay search functionality
    And enter product name Bags
    And click on submit button
#    Then application should return the products including the count
    And Close the browser1