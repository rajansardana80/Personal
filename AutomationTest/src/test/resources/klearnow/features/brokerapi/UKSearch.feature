#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Serach shipment api

  Scenario: Validate search api for a shipment id
    Given User make use of shipment search api
        Given User make use of shipment search api1
    
   # When User search for shipmnet id "KX-I5H7-6796"
    #Then Validate the status code is 200
  #  And Validate customer is "lifestyle@klearexpress.us"
