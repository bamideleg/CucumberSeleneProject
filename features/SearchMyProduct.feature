
Feature: Search your product use case


# Two dimensional data table
Scenario: Verify that user is able to search and see the list of match products
   Given that user is on https://ebay.com
   When User enter the search keyword and click on submit
        | Product Name | Shirt |
   Then application should return the products including the count  
   And Close the browser
   
#---------------------------------------------------------------------------------   
   
# One dimensional data table   
   #Scenario: Verify that user is able to search and see the list of match products
   #Given that user is on https://ebay.com
   #When User enter the search keyword and click on submit
        #| Cups | 
        #| Suit |
   #Then Close the browser
       #
      
 

