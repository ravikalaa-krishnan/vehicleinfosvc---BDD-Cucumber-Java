package uk.gov.dvla.automation.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Runner class for the Cucumber tests
 */

@RunWith(Cucumber.class)
@CucumberOptions(tags = "~@ignorera", strict = true, monochrome = true,
        plugin = {
                "html:target/cucumber-reports/html",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/TEST-cucumber.xml"},
        //location of the BDD test scenarios feature files
        features = "classpath:features/",
        //location of the Step Definitions of the feature files
        glue = {"classpath:uk.gov.dvla.automation.cucumber.stepdefs"})
public class CucumberTestsRunner {


}
