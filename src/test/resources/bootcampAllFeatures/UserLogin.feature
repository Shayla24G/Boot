Feature: This is for verify login 

Scenario: VERIFY USER CAN LOGIN 

Given Open "<URL>" application 
Then Click LOGIN link
Then Enter valid Username and Password
Then Click login
Then Verify user can login


