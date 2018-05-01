$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CheckAllVehicles.feature");
formatter.feature({
  "line": 1,
  "name": "Vehicle registration check based on the input test data files from /src/test/resources/testdata folder filtered by xlsx and csv format",
  "description": "",
  "id": "vehicle-registration-check-based-on-the-input-test-data-files-from-/src/test/resources/testdata-folder-filtered-by-xlsx-and-csv-format",
  "keyword": "Feature"
});
formatter.before({
  "duration": 290752,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Registration Numbers are passed one by one to the dvla page and",
  "description": "confirm the vehicle make and color against the input test data files",
  "id": "vehicle-registration-check-based-on-the-input-test-data-files-from-/src/test/resources/testdata-folder-filtered-by-xlsx-and-csv-format;registration-numbers-are-passed-one-by-one-to-the-dvla-page-and",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the vehicle search page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "start the vehicle check",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "verify all the vehicles in \u0027xlsx,csv\u0027 files from the list of files",
  "keyword": "Then "
});
formatter.match({
  "location": "VehicleSearchPageSteps.iNavigateToTheVehicleSearchPage()"
});
formatter.result({
  "duration": 9739467252,
  "status": "passed"
});
formatter.match({
  "location": "VehicleSearchPageSteps.startTheVehicleCheck()"
});
formatter.result({
  "duration": 332151759,
  "status": "passed"
});
formatter.match({
  "location": "VehicleSearchPageSteps.verifyAllTheVehiclesInXlsxCsvFilesFromTheListOfFiles()"
});
formatter.result({
  "duration": 599231957,
  "status": "passed"
});
formatter.after({
  "duration": 131502860,
  "status": "passed"
});
formatter.after({
  "duration": 114156502,
  "status": "passed"
});
formatter.uri("features/VehicleSearchByRegistrationNum.feature");
formatter.feature({
  "line": 3,
  "name": "Vehicle Search by Registration Number",
  "description": "\r\nAs a user I can search for a vehicle information on the DVLA website\r\nso that I can retrieve information which are currently holded by DVLA for that vehicle",
  "id": "vehicle-search-by-registration-number",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.before({
  "duration": 97181,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to the vehicle search home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should see the searchpage",
  "keyword": "When "
});
formatter.match({
  "location": "VehicleSearchPageSteps.iNavigateToTheVehicleSearchHomePage()"
});
formatter.result({
  "duration": 468597007,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSeeTheSearchpage()"
});
formatter.result({
  "duration": 9148811,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "ViewVehicle page text information",
  "description": "",
  "id": "vehicle-search-by-registration-number;viewvehicle-page-text-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I should see the page title as \"Enter the registration number of the vehicle\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Enter the registration number of the vehicle",
      "offset": 32
    }
  ],
  "location": "VehicleSearchPageSteps.iShouldSeeThePageTitleAs(String)"
});
formatter.result({
  "duration": 27842664,
  "status": "passed"
});
formatter.after({
  "duration": 99991823,
  "status": "passed"
});
formatter.after({
  "duration": 96911669,
  "status": "passed"
});
formatter.before({
  "duration": 55307,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to the vehicle search home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should see the searchpage",
  "keyword": "When "
});
formatter.match({
  "location": "VehicleSearchPageSteps.iNavigateToTheVehicleSearchHomePage()"
});
formatter.result({
  "duration": 311324672,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSeeTheSearchpage()"
});
formatter.result({
  "duration": 16917737,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "continue button appears on the vehicle search home page",
  "description": "",
  "id": "vehicle-search-by-registration-number;continue-button-appears-on-the-vehicle-search-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I should see the button text as \"Continue\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Continue",
      "offset": 33
    }
  ],
  "location": "VehicleSearchPageSteps.iShouldSeeTheButtonTextAs(String)"
});
formatter.result({
  "duration": 40040026,
  "status": "passed"
});
formatter.after({
  "duration": 98855282,
  "status": "passed"
});
formatter.after({
  "duration": 96054424,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "user provides valid registration number",
  "description": "",
  "id": "vehicle-search-by-registration-number;user-provides-valid-registration-number",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "I provide the registration number as \"\u003cregistrationNum\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I click the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should now see the vehicle confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I should see the color as \"\u003ccolor\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see the make as \"\u003cmake\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "vehicle-search-by-registration-number;user-provides-valid-registration-number;",
  "rows": [
    {
      "cells": [
        "registrationNum",
        "color",
        "make"
      ],
      "line": 28,
      "id": "vehicle-search-by-registration-number;user-provides-valid-registration-number;;1"
    },
    {
      "cells": [
        "OV10JPX",
        "silver",
        "volvo"
      ],
      "line": 29,
      "id": "vehicle-search-by-registration-number;user-provides-valid-registration-number;;2"
    },
    {
      "cells": [
        "PL05XRU",
        "silver",
        "toyota"
      ],
      "line": 30,
      "id": "vehicle-search-by-registration-number;user-provides-valid-registration-number;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 83750,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to the vehicle search home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should see the searchpage",
  "keyword": "When "
});
formatter.match({
  "location": "VehicleSearchPageSteps.iNavigateToTheVehicleSearchHomePage()"
});
formatter.result({
  "duration": 263270004,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSeeTheSearchpage()"
});
formatter.result({
  "duration": 9640641,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "user provides valid registration number",
  "description": "",
  "id": "vehicle-search-by-registration-number;user-provides-valid-registration-number;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I provide the registration number as \"OV10JPX\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I click the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should now see the vehicle confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I should see the color as \"silver\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see the make as \"volvo\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "OV10JPX",
      "offset": 38
    }
  ],
  "location": "VehicleSearchPageSteps.iProvideTheRegistrationNumberAs(String)"
});
formatter.result({
  "duration": 43118600,
  "status": "passed"
});
formatter.match({
  "location": "VehicleSearchPageSteps.iClickTheContinueButton()"
});
formatter.result({
  "duration": 335674361,
  "status": "passed"
});
formatter.match({
  "location": "VehicleSearchPageSteps.iShouldNowSeeTheVehicleConfirmationPage()"
});
formatter.result({
  "duration": 82110180,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "silver",
      "offset": 27
    }
  ],
  "location": "VehicleSearchPageSteps.iShouldSeeTheColorAs(String)"
});
formatter.result({
  "duration": 26720345,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "volvo",
      "offset": 26
    }
  ],
  "location": "VehicleSearchPageSteps.iShouldSeeTheMakeAs(String)"
});
formatter.result({
  "duration": 29732552,
  "status": "passed"
});
formatter.after({
  "duration": 91714476,
  "status": "passed"
});
formatter.after({
  "duration": 100846697,
  "status": "passed"
});
formatter.before({
  "duration": 70713,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to the vehicle search home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should see the searchpage",
  "keyword": "When "
});
formatter.match({
  "location": "VehicleSearchPageSteps.iNavigateToTheVehicleSearchHomePage()"
});
formatter.result({
  "duration": 718049180,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSeeTheSearchpage()"
});
formatter.result({
  "duration": 8645527,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "user provides valid registration number",
  "description": "",
  "id": "vehicle-search-by-registration-number;user-provides-valid-registration-number;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I provide the registration number as \"PL05XRU\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I click the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should now see the vehicle confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I should see the color as \"silver\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see the make as \"toyota\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "PL05XRU",
      "offset": 38
    }
  ],
  "location": "VehicleSearchPageSteps.iProvideTheRegistrationNumberAs(String)"
});
formatter.result({
  "duration": 40107578,
  "status": "passed"
});
formatter.match({
  "location": "VehicleSearchPageSteps.iClickTheContinueButton()"
});
formatter.result({
  "duration": 324342144,
  "status": "passed"
});
formatter.match({
  "location": "VehicleSearchPageSteps.iShouldNowSeeTheVehicleConfirmationPage()"
});
formatter.result({
  "duration": 48994871,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "silver",
      "offset": 27
    }
  ],
  "location": "VehicleSearchPageSteps.iShouldSeeTheColorAs(String)"
});
formatter.result({
  "duration": 19414807,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "toyota",
      "offset": 26
    }
  ],
  "location": "VehicleSearchPageSteps.iShouldSeeTheMakeAs(String)"
});
formatter.result({
  "duration": 18475393,
  "status": "passed"
});
formatter.after({
  "duration": 87482771,
  "status": "passed"
});
formatter.after({
  "duration": 84327164,
  "status": "passed"
});
formatter.before({
  "duration": 73478,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to the vehicle search home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should see the searchpage",
  "keyword": "When "
});
formatter.match({
  "location": "VehicleSearchPageSteps.iNavigateToTheVehicleSearchHomePage()"
});
formatter.result({
  "duration": 236367938,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSeeTheSearchpage()"
});
formatter.result({
  "duration": 11734371,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "user provides invalid registration number",
  "description": "",
  "id": "vehicle-search-by-registration-number;user-provides-invalid-registration-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "I provide the registration number as \"GV65RRR\"",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "I click the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I should see the text on vehicle confirmation page as \"Vehicle details could not be found\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "GV65RRR",
      "offset": 38
    }
  ],
  "location": "VehicleSearchPageSteps.iProvideTheRegistrationNumberAs(String)"
});
formatter.result({
  "duration": 37968023,
  "status": "passed"
});
formatter.match({
  "location": "VehicleSearchPageSteps.iClickTheContinueButton()"
});
formatter.result({
  "duration": 348294025,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vehicle details could not be found",
      "offset": 55
    }
  ],
  "location": "VehicleSearchPageSteps.iShouldSeeTheTextOnVehicleConfirmationPageAs(String)"
});
formatter.result({
  "duration": 33064348,
  "status": "passed"
});
formatter.after({
  "duration": 103943047,
  "status": "passed"
});
formatter.after({
  "duration": 93630437,
  "status": "passed"
});
formatter.uri("features/getVehicleInfoFromDVLAPage.feature");
formatter.feature({
  "line": 3,
  "name": "Get Vehicle Information from DVLA",
  "description": "\r\n  As a user I can search for a vehicle information on the DVLA website\r\n  so that I can retrieve information which are currently holded by DVLA for that vehicle",
  "id": "get-vehicle-information-from-dvla",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.before({
  "duration": 51751,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to the vehicle information check homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I see the homepage is visible",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.iNavigateToTheVehicleInformationCheckHomepage()"
});
formatter.result({
  "duration": 1290492845,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iSeeTheHomepageIsVisible()"
});
formatter.result({
  "duration": 22389879,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "get-vehicle-information-from-dvla home page\u0027 text information",
  "description": "",
  "id": "get-vehicle-information-from-dvla;get-vehicle-information-from-dvla-home-page\u0027-text-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I should see the title as \"Get vehicle information from DVLA\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should see the text as \"Check online to find out what information the Driver and Vehicle Licensing Agency (DVLA) holds about a vehicle.\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should also see the text as \"You’ll need the vehicle’s registration number.\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Get vehicle information from DVLA",
      "offset": 27
    }
  ],
  "location": "HomePageSteps.iShouldSeeTheTitleAs(String)"
});
formatter.result({
  "duration": 21514463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Check online to find out what information the Driver and Vehicle Licensing Agency (DVLA) holds about a vehicle.",
      "offset": 26
    }
  ],
  "location": "HomePageSteps.iShouldSeeTheTextAs(String)"
});
formatter.result({
  "duration": 20254273,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You’ll need the vehicle’s registration number.",
      "offset": 31
    }
  ],
  "location": "HomePageSteps.iShouldAlsoSeeTheTextAs(String)"
});
formatter.result({
  "duration": 20097046,
  "status": "passed"
});
formatter.after({
  "duration": 108636559,
  "status": "passed"
});
formatter.after({
  "duration": 97508579,
  "status": "passed"
});
formatter.before({
  "duration": 62022,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to the vehicle information check homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I see the homepage is visible",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.iNavigateToTheVehicleInformationCheckHomepage()"
});
formatter.result({
  "duration": 251785300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iSeeTheHomepageIsVisible()"
});
formatter.result({
  "duration": 22477578,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "start-now button appears on the homepage",
  "description": "",
  "id": "get-vehicle-information-from-dvla;start-now-button-appears-on-the-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "I should see the button with text as \"Start now\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Start now",
      "offset": 38
    }
  ],
  "location": "HomePageSteps.iShouldSeeTheButtonWithTextAs(String)"
});
formatter.result({
  "duration": 19734792,
  "status": "passed"
});
formatter.after({
  "duration": 106252472,
  "status": "passed"
});
formatter.after({
  "duration": 100593869,
  "status": "passed"
});
formatter.before({
  "duration": 65972,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I navigate to the vehicle information check homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I see the homepage is visible",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.iNavigateToTheVehicleInformationCheckHomepage()"
});
formatter.result({
  "duration": 238343157,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iSeeTheHomepageIsVisible()"
});
formatter.result({
  "duration": 23609378,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "clicking the start now button redirects to vehicle searchpage",
  "description": "",
  "id": "get-vehicle-information-from-dvla;clicking-the-start-now-button-redirects-to-vehicle-searchpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I click the start now button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I should see the vehiclesearchpage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iClickTheStartNowButton()"
});
formatter.result({
  "duration": 373363879,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSeeTheVehiclesearchpage()"
});
formatter.result({
  "duration": 10698172,
  "status": "passed"
});
formatter.after({
  "duration": 16371786,
  "status": "passed"
});
formatter.after({
  "duration": 25638321,
  "status": "passed"
});
});