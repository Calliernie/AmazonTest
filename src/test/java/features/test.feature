Feature: Search feature
  Scenario: Searching for a shoe on Amazon US website
    Given I navigate to the Amazon US website
    And I type shoes in the search box
    And I click on the search icon
    When I select a shoe
    Then I should see the selected shoe with it's details
