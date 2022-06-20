#Regular expression concept was applied to run different tests on url.

#@tag
#Feature: Job search
   #Job search paramerisation using scenario Outline.
#
  #@tag1
 #Scenario: Job search using dynamic data
    #Given that user is on https://jobserve.co.uk
    #When I enter the job title Software testing and job location London. Click search button
    #When I should see the number of the jobs find  and the job title
    #And close the browser4
    #
    #
    #
    #
 #@tag2
 #Scenario: Job search using dynamic data
    #Given that user is on https://jobserve.co.uk
    #When I enter the job title Project Manager and job location Manchester. Click search button
    #When I should see the number of the jobs find  and the job title
    #And close the browser4
#
 #@tag3
 #Scenario: Job search using dynamic data
    #Given that user is on https://jobserve.co.uk
    #When I enter the job title Release Manager and job location York. Click search button
    #Then I should see the number of the jobs find  and the job title
    #And close the browser4

#--------------------------------------------------------------------------------------------------
# Code 2 - Example table paramerisation 


@tag
Feature: Job searh functionality.
   Job search paramerisation using scenario Outline.

  @tag2
  Scenario Outline: Paramerisation using scenario outline and Examples table
    Given that I navigates to https://jobserve.co.uk
    When I enter the job "<title>" and job "<location>" . Click search button
    When I should see the number of the jobs find  and the job title
    And close the browser4

   Examples: 
     | title             | location | 
     | Software testing  | London   |
     | Business Analyst  | Leeds    | 
     | Automation tester | London   |
     | Product Analyst   | Leeds    |
     | QA Analyst        | London   |
     | Product Owner     | Leeds    |   
     
     


