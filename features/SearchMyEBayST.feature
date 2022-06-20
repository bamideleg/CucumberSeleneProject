
@tag
Feature: Product search testing using scenario outline

//Background:
//  Given User is on https://ebay.com


  @tag2
  Scenario Outline: To test for using different dataset
    Given User is on https://ebay.com
    Given enter product name <Product_Name>
    And click on submit button
#    Then application should return the products including the count
    And Close the browser1
    
    Examples: 
      | Product_Name  | 
      | Tv            |     
      | Ball          |     
      | Book          |     
      | Ball          | 