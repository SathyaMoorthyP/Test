Feature: CreateLead Functionality in LeafTaps

#Background: 
#Given Launch the chrome browser
#And Load the URL and Maximize

Scenario: CreateLead with mandatory informations
Given Enter the username as Demosalesmanager
And Enter the password crmsfa
When Click on the Login button
Then Home page should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' Page should be Displayed
When Click on 'Leads' link
Then 'My Leads' Page should be Displayed
When Click on 'Create Lead' link
Then 'Create Lead' Page should be Displayed
#Given Enter the company name as 'Google'
#And Enter the first name as 'Sathya'
#And Enter the last name as 'Moorthy'
#And Click on Create Lead button
#Then New Lead should be created

  