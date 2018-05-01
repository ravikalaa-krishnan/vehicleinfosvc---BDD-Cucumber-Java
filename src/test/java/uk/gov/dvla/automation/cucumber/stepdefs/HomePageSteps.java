package uk.gov.dvla.automation.cucumber.stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.gov.dvla.services.page.HomePage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static uk.gov.dvla.utils.DriverUtil.driver;
import static uk.gov.dvla.utils.DriverUtil.getDriver;
import static uk.gov.dvla.utils.TestConstants.HOME_PAGE_URL;
import static uk.gov.dvla.utils.TestConstants.SEARCH_PAGE_URI;

/**
 * Class to capture the browser actions in dvla Home page
 * Contains Steps implementations for cucumber
 */
public class HomePageSteps {
    public HomePage dvlaHomePage;
    public static int i = 1;

    //protected static WebDriver driver;
    @Before
    public void beforeEachScenario(Scenario scenario) {


        System.out.println("------------------------------");
        System.out.println("Starting -> " + scenario.getName() + " " + scenario.getStatus());

    }

    @After
    public void afterEachScenario(Scenario scenario) throws Exception {
        captureScreenShot(driver, scenario.getName());

        System.out.println("Completed -> " + scenario.getName() + " " + scenario.getStatus());
        System.out.println("------------------------------");

    }

    @Given("^I navigate to the vehicle information check homepage$")
    public void iNavigateToTheVehicleInformationCheckHomepage() throws Throwable {
        driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get(HOME_PAGE_URL);
        HomePage.getTitleInfo(driver).getText();


    }

    @Then("^I should see the title as \"([^\"]*)\"$")
    public void iShouldSeeTheTitleAs(String expected) throws Throwable {
        String actualTitle = HomePage.getTitleInfo(driver).getText();
        assertThat(actualTitle, is(equalTo(expected)));
    }

    @And("^I should see the text as \"([^\"]*)\"$")
    public void iShouldSeeTheTextAs(String expected) throws Throwable {
        String sectionTxt1 = HomePage.getText1Info(driver).getText();
        assertThat(sectionTxt1, is(equalTo(expected)));
    }

    @Then("^I should see the button with text as \"([^\"]*)\"$")
    public void iShouldSeeTheButtonWithTextAs(String expected) throws Throwable {
        String button = HomePage.startButtonInfo(driver).getText();
        assertThat(button, is(equalTo(expected)));
    }

    @And("^I click the start now button$")
    public void iClickTheStartNowButton() throws Throwable {
        HomePage.clickStartButton(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        assertThat(driver.getCurrentUrl(), is(containsString(SEARCH_PAGE_URI)));

    }

    @When("^I see the homepage is visible$")
    public void iSeeTheHomepageIsVisible() throws Throwable {
        String actualTitle = HomePage.getTitleInfo(driver).getText();
    }

    @And("^I should also see the text as \"([^\"]*)\"$")
    public void iShouldAlsoSeeTheTextAs(String expected) throws Throwable {
        String sectionTxt2 = HomePage.getText2Info(driver).getText();
        assertThat(sectionTxt2, is(equalTo(expected)));
    }


    @Then("^I should see the searchpage$")
    public void iShouldSeeTheSearchpage() throws Throwable {
        driver.navigate().forward();


    }

    public static void captureScreenShot(WebDriver driver, String scenario) throws Exception {
        String path;
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        File SrcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);

        String filename = new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());


        //Move image file to new destination
        try {

            File destFile = new File("./screenshotsFromTesting/" + scenario + filename);
            FileUtils.copyFile(SrcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Then("^I should see the vehiclesearchpage$")
    public void iShouldSeeTheVehiclesearchpage() throws Throwable {
        driver.navigate().forward();

    }
}
