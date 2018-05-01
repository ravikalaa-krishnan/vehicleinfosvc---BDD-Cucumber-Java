package uk.gov.dvla.automation.cucumber.stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.gov.dvla.services.FilesLookupSvc;
import uk.gov.dvla.services.model.FileInfo;
import uk.gov.dvla.services.model.VehicleInfo;
import uk.gov.dvla.services.page.VehicleSearchPage;
import uk.gov.dvla.utils.HelperUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static uk.gov.dvla.utils.DriverUtil.getDriver;
import static uk.gov.dvla.utils.TestConstants.*;


/**
 * Class to capture the browser actions in vehicle search page
 * Contains Steps implementations for cucumber
 */
public class VehicleSearchPageSteps {
    public WebDriver driver;
    private List<FileInfo> fileList = new ArrayList<>();
    private List<VehicleInfo> vehicleList = new ArrayList<>();


    @Given("^I navigate to the vehicle search home page$")
    public void iNavigateToTheVehicleSearchHomePage() throws Throwable {
        driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        if (driver != null) {
            driver.get(SEARCH_PAGE_URL);
        }
        wait = new WebDriverWait(driver, 50);


    }

    @When("^I see the vehicle search home page is visible$")
    public void iSeeTheVehicleSearchHomePageIsVisible() throws Throwable {
        VehicleSearchPage.getTitlePageInfo(driver).isDisplayed();

    }

    @Then("^I should see the page title as \"([^\"]*)\"$")
    public void iShouldSeeThePageTitleAs(String expected) throws Throwable {
        String actual = VehicleSearchPage.getTitlePageInfo(driver).getText();
        assertThat(actual, is(equalTo(expected)));
    }

    @Then("^I should see the button text as \"([^\"]*)\"$")
    public void iShouldSeeTheButtonTextAs(String expected) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        assertThat(driver.getCurrentUrl(), is(containsString(SEARCH_PAGE_URI)));
        String actual = VehicleSearchPage.getContinueButtonInfo(driver).getText();
        assertThat(actual, is(equalTo(expected)));

    }

    @And("^I click the continue button$")
    public void iClickTheContinueButton() throws Throwable {
        VehicleSearchPage.clickContinueButton(driver).click();

    }

    @After
    public void afterEachScenario(Scenario scenario) throws Exception {
        driver = getDriver();
        captureScreenShot(driver, scenario.getName());

        System.out.println("Completed -> " + scenario.getName() + " " + scenario.getStatus());
        System.out.println("------------------------------");

    }


    @When("^I provide the registration number as \"([^\"]*)\"$")
    public void iProvideTheRegistrationNumberAs(String regNum) throws Throwable {
        driver.findElement(By.cssSelector(SEARCH_PAGE_TEXTBOX)).sendKeys(regNum);
        WebDriverWait wait = new WebDriverWait(driver, 30);

    }

    @Then("^I should see the color as \"([^\"]*)\"$")
    public void iShouldSeeTheColorAs(String expectedColor) throws Throwable {
        String actualColor = driver.findElement(By.cssSelector(VEHICLE_COLOR)).getText();
        assertThat(actualColor, is(equalToIgnoringCase(expectedColor)));
    }

    @Then("^I should see the make as \"([^\"]*)\"$")
    public void iShouldSeeTheMakeAs(String expectedMake) throws Throwable {
        String actualColor = driver.findElement(By.cssSelector(VEHICLE_MAKE)).getText();
        assertThat(actualColor, is(equalToIgnoringCase(expectedMake)));
    }

    @Then("^I should now see the vehicle confirmation page$")
    public void iShouldNowSeeTheVehicleConfirmationPage() throws Throwable {
        driver.navigate().forward();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(By.cssSelector(VEHICLE_MAKE)).isDisplayed();
    }

    public static void captureScreenShot(WebDriver driver, String scenario) throws Exception {
        String path;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String filename = new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());


        //Move image file to new destination
        try {

            File destFile = new File("./screenshotsFromTesting/" + scenario + filename);
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Then("^I should see the text on vehicle confirmation page as \"([^\"]*)\"$")
    public void iShouldSeeTheTextOnVehicleConfirmationPageAs(String expected) throws Throwable {
        driver.navigate().forward();
        String actualTxt = driver.findElement(By.cssSelector(ERR_INFO)).getText();
        assertThat(actualTxt, is(equalToIgnoringCase(expected)));
    }

    @Given("^I navigate to the vehicle search page$")
    public void iNavigateToTheVehicleSearchPage() throws Throwable {
        driver = getDriver();
        driver.get(SEARCH_PAGE_URL);
        Thread.sleep(5000);
    }

    @And("^start the vehicle check$")
    public void startTheVehicleCheck() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        assertThat(driver.getCurrentUrl(), is(containsString(SEARCH_PAGE_URI)));
        VehicleSearchPage vsp = new VehicleSearchPage();
        VehicleSearchPage.clickContinueButton(driver).click();
    }

    @And("^verify all the vehicles in 'xlsx,csv' files from the list of files$")
    public void verifyAllTheVehiclesInXlsxCsvFilesFromTheListOfFiles() throws Throwable {
        FilesLookupSvc fls = new FilesLookupSvc();

        fileList = fls.filterByFilesByExtensions(Arrays.asList(FILE_EXTNS));
        vehicleList = fls.getMasterTestDataFromTestFiles(fileList);
        HelperUtils.objectsToHashmap(vehicleList);
    }
}
