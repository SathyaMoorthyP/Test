Feature: Login to the leaftaps Application


#Scenario Outline: Positive Login
#Given Launch the Browser
#And Launch the URL and maximize the browser
#And Enter the username as <username>
#And Enter the password as <password>
#When Click the Login button
#Then Verify the home page
#
#Exmaple:
#|username|password|
#|DemoSalesManager|crmsfa|
#//|Demo|crm|

Scenario: Negative Login
Given Launch the Browser
And Launch the URL and maximize the browser
And Enter the username as demosalesmanager
And Enter the password as crmsfa
When Click the Login button
Then Verify the home page