



@tag
Feature: To check that application display accurate loan breakdown.
       Loan calculation feature

  @tag1
  Scenario: To validate loan calculaotr
    Given User is on https://www.calculators.org/
    And Click on Loan link
    Then enter the LoanAmount
    Then enter the Upfront_Fee
    Then enter the Interest_Rate
    Then enter the Term
    Then enter the Payment Per Year
    Then Click on Calculate button
    Then Check that monthly is display
    Then check that interest rate is display
    And close the browser

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |