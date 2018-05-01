Feature: Vehicle registration check based on the input test data files from /src/test/resources/testdata folder filtered by xlsx and csv format

  Scenario: Registration Numbers are passed one by one to the dvla page and
    confirm the vehicle make and color against the input test data files
    Given I navigate to the vehicle search page
    And start the vehicle check
    Then verify all the vehicles in 'xlsx,csv' files from the list of files

