Feature: Login LeafTap Applications

Scenario Outline: Positive Login

Given Launch the Browser
And Load the URL
And Enter the UserName <username>
And Enter the Password <password>
And Click on Login
Then Verify Home Page is Displayed
And Click on Lead Button
And Click on Create Lead Button
And Enter company name
And Enter First Name Sathya
And Enter Last Name
And Click on Button


 
#And Verify Error Message is displayed

Examples:
|username|password|
|DemoSalesManager|crmsfa|
#|Demo|csr|

#Scenario: Negative Login scenario
#
#Given Launch the Browser
#And Load the URL
#And Enter the UserName Demosales
#And Enter the Password crmsfa
#And Click on Login
#And Verify Error Message is displayed