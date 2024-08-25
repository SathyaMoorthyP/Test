Feature: Login to the LeafTap Application

Background: 
Given Launch the Chrome Browser
Then Get the URL and Maximize the webpage

Scenario: Positive Login

And Enter the Username as Demosalesmanager
And Enter the Password as crmsfa
And Click on the Login button
Then Verify Homepage is Displayed

Scenario Outline: Negative Login

And Enter the Username as <Username>
And Enter the Password as <Password>
And Click on the Login button
Then Verify ErrorMessage is Displayed

Examples:
|Username|Password|
|DemosalesManager|crmsf|
|DemosalesManager|crmsf|


