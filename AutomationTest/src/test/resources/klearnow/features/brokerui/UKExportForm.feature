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
Feature: Validate uk export form functionality
Scenario: User is able to login into broker panel 
Given Login to broker panel with url "https://broker-staging.klearnow.com/broker-panel"
When User enters below credentials
|Email|Pwd|
|abhishekpal.singh@klearnow.com|123|
Then Print message user is logged in successfully

Scenario: User is able to login into broker panel 
Given Login to broker panel with url "https://broker-staging.klearnow.com/broker-panel"
When User enters below credentials
|Email|Pwd|
|abhishekpal.singh@klearnow.com|123|


