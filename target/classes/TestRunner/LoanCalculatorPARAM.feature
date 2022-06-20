
# One dimensional data table

#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: To validate loan calculator
    #Given User navigates to https://www.calculators.org/
    #And Click on Loan link1
    #Then enter the Loan amount,Upfront_Fee,Interest Rate,Term and Years
        #| 900000 |
        #| 300000 |
        #| 10     |
        #| 8      |
        #| 10000  |  
    #Then Click on Calculate button1
    #Then Validate the payment amount
    #Then Validate the total interest rate 
    #And Close the browser11
        #
 
# ----------------------------------------------------------------------	   
# Two dimensional data table - The power of two dimensional is that the order of dataset doesn't matter.	      

@tag
Feature: Title of your feature
  I want to use this template for my feature file


  @tag1
  Scenario: To validate loan calculator
    Given User navigates to https://www.calculators.org/
    And Click on Loan link1
    Then enter the Loan amount,Upfront_Fee,Interest Rate,Term and Years
        | Loan amount   | 900000 |
        | Upfront Fee   | 300000 |
        | Interest Rate | 10     |
        | Term          | 8      |
        | Years         | 10000  |  
    Then Click on Calculate button1
    Then Validate the payment amount
    Then Validate the total interest rate 
    And Close the browser11
        