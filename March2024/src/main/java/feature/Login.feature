Feature: Login to the LeafTap Application

#Scenario: Positive Login | Create Lead

#Given Launch the Chrome Browser
#Then Enter URL and Maximize the Webpage
#Then Enter the UserName "Demosalesmanager"
#Then Enter the Password "crmsfa"
#And Click on the Login button
#Then Verify the Home Page is Displayed


Scenario Outline: Second Test

Given Launch the Chrome Browser
Then Enter URL and Maximize the Webpage
Then Enter the UserName <UserName>
Then Enter the Password <Password>
And Click on the Login button
Then Verify the Home Page is Displayed

Examples:
|UserName|Password|
|Demosalesmanager|crmsfa|

