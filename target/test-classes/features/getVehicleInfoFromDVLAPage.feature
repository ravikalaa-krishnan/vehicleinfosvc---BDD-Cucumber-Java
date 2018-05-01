@wip

Feature: Get Vehicle Information from DVLA

    As a user I can search for a vehicle information on the DVLA website
    so that I can retrieve information which are currently holded by DVLA for that vehicle

    Background:
      Given I navigate to the vehicle information check homepage
      When I see the homepage is visible

Scenario: get-vehicle-information-from-dvla home page' text information
    Then I should see the title as "Get vehicle information from DVLA"
    And I should see the text as "Check online to find out what information the Driver and Vehicle Licensing Agency (DVLA) holds about a vehicle."
    And I should also see the text as "You’ll need the vehicle’s registration number."


Scenario: start-now button appears on the homepage
    Then I should see the button with text as "Start now"


Scenario: clicking the start now button redirects to vehicle searchpage
    When I click the start now button
    Then I should see the vehiclesearchpage



