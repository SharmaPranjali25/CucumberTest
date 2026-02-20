Feature: Test login functionality
  Scenario: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to the home page

#  Scenario Outline: Check login functionality with multiple data
#    Given browser is open
#    And user is on login page
#    When user inputs "<username>" and "<password>"
#    And user clicks on login
#    Then user is navigated to the home page
#
#    Examples:
#      |username      |password     |
#      |standard_user |secret_sauce |
#      |problem_user  |secret_sauce |
#      |visual_user   |secret_sauce |




