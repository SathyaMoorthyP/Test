Feature: CreateLead in LeafTap Application

Background:
Given Launch the Browser
And Open the URL and maximize it

Scenario: CreateLead with all the required information
Given Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'Myhome' page should  be displayed
When Click on 'Leads' link
Then 'MyLeads' page should  be displayed
When Click on 'Create Lead' link
Then 'Create Lead' page should  be displayed
Given Enter the company name as 'Test Leaf'
And Enter the first name as 'Shalini'
And Enter the last name as 'Sathya'
When Click on Create Lead button
Then New Lead should be created
