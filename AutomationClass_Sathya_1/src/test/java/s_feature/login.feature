Feature: Login LeafTap Applications

Background:
Given Launch the Browser
And Load the URL

Scenario Outline: Positive Login
And Enter the UserName <username>
And Enter the Password <password>
And Click on Login
Then Verify Home Page is Displayed

Examples:
|username|password|
#|DemoSalesManager|crmsfa|
#|Demo|csr|

