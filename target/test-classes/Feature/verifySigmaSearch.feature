Feature: Search

  Scenario: Search for flight
    Given Open the browser
    When Enter valid Username "<login.username>" and Password "<login.password>"
    Then execute sucessfully
    When User click on go travel
    And click on fromcity and tocity
    And click on date
    And click on passanger and search flight
    Then User click on book tickets
