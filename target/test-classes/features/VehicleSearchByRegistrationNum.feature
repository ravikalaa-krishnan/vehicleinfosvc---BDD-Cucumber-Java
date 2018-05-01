@wip

Feature: Vehicle Search by Registration Number

  As a user I can search for a vehicle information on the DVLA website
  so that I can retrieve information which are currently holded by DVLA for that vehicle

  Background:
    Given I navigate to the vehicle search home page
    When I should see the searchpage

  Scenario: ViewVehicle page text information
    Then I should see the page title as "Enter the registration number of the vehicle"



  Scenario: continue button appears on the vehicle search home page
    Then I should see the button text as "Continue"


  Scenario Outline: user provides valid registration number
    When I provide the registration number as "<registrationNum>"
    And I click the continue button
    Then I should now see the vehicle confirmation page
    And I should see the color as "<color>"
    And I should see the make as "<make>"
    Examples:
    |registrationNum|color  |make   |
    |OV10JPX        |silver |volvo  |
    |PL05XRU        |silver |toyota |


    Scenario:user provides invalid registration number
      When I provide the registration number as "GV65RRR"
      And I click the continue button
      Then I should see the text on vehicle confirmation page as "Vehicle details could not be found"










