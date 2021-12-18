@smoke
Feature: To validate the Login Functionality of Facebook page
Background:
Given  The user should Launch the Chrome Browser
When The user should type the url
And The user should maximize the window

Scenario: Validate with valid username with Invalid password

And The user should type the valid username and invalid password
And The user should click the Login button
Then The user should navigate to incorrect credential page



Scenario Outline: To validate with invalid username and invalid password

And The user should type the valid username "<user>" and invalid"<pass>" password
And The user should click the Login button
Then The user should navigate to incorrect credential page


Examples:
|user|pass|
|java|java@123|
|python|python@123|