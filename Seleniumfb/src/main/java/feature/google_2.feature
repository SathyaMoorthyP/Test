Feature: Login Google browser and search the content

Scenario Outline: Positive Outline

Given To load the <url>
And Maximize the browser
And Serach a content <searchword>
Then Verify the <datavalidation> and <textField> is displayed
And Navigate back to the back page

Examples:

|url|searchword|datavalidation|textField|
|https://www.google.co.in/|India|India|India|
|https://www.google.co.in/|Pakistan|Pakistan|Pakistan|