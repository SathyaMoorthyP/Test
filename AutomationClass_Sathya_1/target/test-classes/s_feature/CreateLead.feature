Feature: CreateLead in LeafTap Application

Background:
Given Launch the Browser
And Load the URL

Scenario: CreateLead with all the required information
Given Enter the UserName 'DemoSalesManager'
And Enter the Password 'crmsfa'
When Click on Login 
Then Verify Home Page is Displayed
When Click on 'CRM/SFA' link
Then 'Myhome' page should  be displayed
When Click on 'Leads' link
Then 'MyLeads' page should  be displayed
When Click on 'Create Lead' link
Then 'Create Lead' page should  be displayed
#Given Enter the company name as 'Test Leaf'
#And Enter the first name as 'Shalini'
#And Enter the last name as 'Sathya'
#When Click on Create Lead button
#Then New Lead should be created
