@sanity
Feature: To validate the Login Functionality of Facebook page
Background:
Given  The user should Launch the Chrome Browser
When The user should type the url
And The user should maximize the window

Scenario: Validate with valid username and valid password

And The user should type the valid username and invalid passwords
|santhosh|santhosh@123|asokan|asokan@123|
And The user should click the Login button
Then The user should navigate to incorrect credential page

Scenario: Validate with invalid username and valid password

 And The user should type the invalid username and valid passwords
 |santhosh|santhosh@123|asokan|asokan@123|
|santhosh|santhosh@123|thenmoli|thenmoli@123|
 |santhosh|santhosh@123|sathish|sathish@123|
 |Asokan|Asokan@123|Santhosh|santhosh@123|
 And The user should click the Login button
Then The user should navigate to incorrect credential page

Scenario: Validate with invalid username and invalid password

 And The user should type the invalid username and invalid passwords
 |user1|santhosh@123|
|pass1|sathish@123|
 |user2|thenmoli@123|
 |pass2|Asokan@123|
 And The user should click the Login button
Then The user should navigate to incorrect credential page


Scenario: Validate with invalid username and empty password

 And The user should type the invalid username and empty passwords
 |user|pass|
|sathish|sathish@123|
 |thenmoli|thenmoli@123|
 |Asokan|Asokan@123|
 And The user should click the Login button
Then The user should navigate to incorrect credential page
