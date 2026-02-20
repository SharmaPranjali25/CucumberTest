Feature: Check homePage functionality

  Background: user must be logged in
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login


  Scenario: validate user is able to logout successfully
    Given user must be logged in
    When user clicks on three lines
    And user clicks on logout
    Then user logouts successfully

  Scenario: validate user is able to click on About section
    Given user must be logged in
    When user clicks on three lines
    And user clicks on About
    Then About page is displayed