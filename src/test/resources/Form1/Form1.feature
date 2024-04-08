
@tag
Feature: Simpleform

  @Smoke
  Scenario: To validate textbox functionalities
    Given user open a chrome browser and enters a url
    When user enters values of firstname, lastname, Email, contact number, message
    And user clicks on submit button
    Then A pop up alert message should be displayed

 