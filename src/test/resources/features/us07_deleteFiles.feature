@us_07
Feature: As a user, I should be able to delete a file / folder.

  Background:
    Given user on the dashboard page
    When user clicks "Files" module

  Scenario: As a user, I should be able to delete a file / folder.

    And user click action-icon  from any file on the page
    And user choose "Delete f" option
    When user click "Deleted files" sub-module on the left side
    Then Verify the deleted file is displayed on the page.


