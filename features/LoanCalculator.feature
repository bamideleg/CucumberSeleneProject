

# One dimensional data table
@tag
Feature: Loan calculatior
  As user I want to calculate my monthly payment plan

# The goal is to pass large amount of dataset
# Passing one dimensional dataset
# Passing two dimensional dataset
# Converting data in the form of key value pair

#
#
     #@tag1
  #Scenario: Loan calculatior
    #Given User navigate to https://www.calculators.org/
    #And click on loan link from the menu bar 
    #Then User I want to fill the loan form and get the monthly payment 
#       | 600000 |
#	      | 180000 |
#	      | 11     |
#	      | 4      |
#	      | 490    |
    #And Click on calculate button
    #Then Check that monthly is display1  
#	  Then check that interest rate is display1
#	  And Close the browser     
        #
#	     
	     
#-------------------------------------------------------------
# Two dimensional data table - The power of two dimensional is that the order of dataset doesn't matter
#
     @tag1
  Scenario: Loan calculatior
    Given User navigate to https://www.calculators.org/
    And click on loan link from the menu bar 
    Then User I want to fill the loan form and get the monthly payment 
        | Loan Amount    | 800000 |
	      | Upfront Fee    | 500000 |
	      | Interest Rate  | 7      |
	      | Term           | 25     |
	      | Payment PR Year| 700    |    
    And Click on calculate button
    Then Validate the Payment Amount  
	  Then Validate the total interest
	  And Close the browser10     
        
