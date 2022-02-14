#Author: rajan.sardana@klearnow.com
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

Feature: USA Import Form

#@Prod
#Scenario: USA Import Form Fields Getting Saved On Entering Data In Them
#Given Login To Broker Panel Using Below Staging Credentials
#|rajan.sardana.8@klearnow.com|123|
#|rajan.sardana.9@klearnow.com|123|
#Given Login To Broker Panel Using Below Prod Credentials
#|name|pwd|
#|rajan.sardana.8@klearnow.com|123|
#|rajan.sardana.9@klearnow.com|123|
#When Broker Searches Shipment Id Using Advance Search
#Then Shipment Id Gets Displayed To Broker
#
#Data Driven
#Scenario Outline: Validate login functionality.
#Given Login to broker panel .
#When Enter "<name>"
#Examples:
#|name|
#|rajan|
#|incorrectpwd|

Scenario: ok
Given Login to broker panel
When User enter username "abhishekpal.singh@klearnow.com"
And User enter password "123"

#Scenario: ok1
#Given Login to broker panel3
#When User enter username "abhishekpal.singh@klearnow.com"
#And User enter password "123"

#Scenario: 
#Given Login to broker panel
#When User enter below credentials1
#|Email|Pwd|
#|abhishekpal.singh@klearnow.com|123|

#Scenario: 
#Given Login to broker panel
#When User enter below credentials2
#|Email|
#|abhishekpal.singh@klearnow.com|
#And User enter password "123"






