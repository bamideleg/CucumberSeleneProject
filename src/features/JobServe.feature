
# Data table text execution
@tag
Feature: Job Search functionalities
  Jobseeker should be able to search form job.

  @tag1
  Scenario Outline: Jobserve job search
    Given that user is on https://jobserve.co.uk
    And select the industry select <jobs> enter job <title> and click on search button
    Then user should see the corresponding job search result
    Then closed the browser

    Examples: 
      | jobs         | title      |
      | BA           | London     |
      | QA           | Manchester |
      | PM           | London     |
      | ADM          | Manchester |
      | Test Analyst | London     |
      | PO           | Manchester |
      
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
