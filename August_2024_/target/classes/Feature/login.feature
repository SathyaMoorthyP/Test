

Feature: Login to Leaf Tap Application
Scenario Outline: Positive Scenario
Given Launch the Browser
And Enter the URL
Then Enter username credentials as <UserName>
Then Enter password details as <Password>
Then Click on Login button
And Verify HomePage
Examples:
|UserName|Password|
|DemosalesManager|crmsfa|
|DemosalesManager|crmsfa|
