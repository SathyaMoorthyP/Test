Feature: Login to the leaftap application

#Scenario: Positive Login Scenario
#
#Given Launch the chrome browser
#And Load the URL and Maximize
#And Enter the username 
#And Enter the password
#When Click on the Login Button
#Then Verify the homepage is displayed

Scenario: Negative Login Scenario

Given Launch the chrome browser
And Load the URL and Maximize
And Enter the username as Demosalesmanager 
And Enter the password crmsf
When Click on the Login button
Then Verify the error message is displayed

Scenario Outline: Login Scenario

Given Launch the chrome browser
And Load the URL and Maximize
And Enter the username as <UserName> 
And Enter the password <Password>
When Click on the Login Button
Then Home page should be displayed

//Verify the homepage is displayed

Examples:
|UserName|Password|
|DemosalesManager|crmsfa|
|DemosalesManager|crmsfa|



