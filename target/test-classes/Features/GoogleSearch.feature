Feature: Feature to test goodle search operation

  Background: 
    Given this will execute before each scenario as this is a common case that run before each scenario

  @SmokeTest
  Scenario: Case 1 validate if google search is working
    Given user if on google page
    When user enters text for search
    And user press enter button
    Then user is navigated to search results

  @SmokeTest
  Scenario: Case 2 validate if google search is working
    Given user if on google page
    When user enters text for search
    And user press enter button
    Then user is navigated to search results

  @SmokeTest
  Scenario: Case 3 validate if google search is working
    Given user if on google page
    When user enters text for search
    And user press enter button
    Then user is navigated to search results
