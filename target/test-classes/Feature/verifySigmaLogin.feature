
Feature: Validation of Login Scenario

#Author: Pranjal
@smoke
Scenario: Login with valid credential

Given Open the browser
When Enter valid Username "<login.username>" and Password "<login.password>"
Then execute sucessfully

  Examples:
   |login.username|login.password|
   |Username      |Password|
   