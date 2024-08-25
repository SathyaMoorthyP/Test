Feature: Login to the leaps tap application

Scenario Outline: Positive Login

Given Launch the Chrome Browser
And Load the URL and Maximize
And Enter the user name as "<UserName>" 
And Enter the password as "<Password>"
When Click on the Login button
Then Verify the homepage is displayed

Examples: 
|UserName|Password|
|DemosalesManager|crmsfa|
|DemoCSR|crmsfa|

#Scenario: Negative Login
#
#Given Launch the Chrome Browser
#And Load the URL and Maximize
#And Enter the user name as 'Demosalesmanager'
#And Enter the password as 'crms'
#When Click on the Login button
#But Verify the error message is displayed

 

