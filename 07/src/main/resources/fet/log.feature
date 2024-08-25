Feature: Login to TestLeaf Web Application

Scenario: Login TestLeaf - Negative Scenario

Given Launch the Browser
Then Load the URL and Maximize
Then Enter username as DemosalesManager
Then Enter password as crmsf
And Click on Login
Then verify error message is displayed

Scenario Outline: Login TestLeaf - Positive scenario

Given Launch the Browser
Then Load the URL and Maximize
Then Enter username as <UserName>
Then Enter password as <Password>
And Click on Login
Then MyHome message is displayed

Examples:
|UserName|Password|
|DemosalesManager|crmsfa|


#Examples:
#|UserName|Password|
#|DemosalesManager|crmsfa|
#|DemosalesManager|crmsfa|