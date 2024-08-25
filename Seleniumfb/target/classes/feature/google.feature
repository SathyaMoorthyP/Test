Feature: Login Google browser and serach the content

Scenario: Positive scenarioo

Given To load the url
And Maximize the browser
And Enter the seraching data 'Bruce Lee'
Then Verify the 'Bruce Lee' and 'Bruce Lee' is displayed
And Navigate back to search page


Scenario Outline: Positive scenario

Given To load the url
And Maximize the browser
And Enter the seraching data <searchField> 
Then Verify the <dataValidation> and <textValue> is displayed
And Navigate back to search page

Examples: 
|searchField|dataValidation|textValue|
|Hustle Karate|Hustle Karate|Hustle Karate|
#|https://www.google.co.in/|James Bond|James Bond|James Bond|
#|https://www.google.co.in/|Bruce Lee|Bruce Lee|Bruce Lee|
#|https://www.google.co.in/|Mike Tyson|Mike Tyson|Mike Tyson|