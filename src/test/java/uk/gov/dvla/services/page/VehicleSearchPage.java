package uk.gov.dvla.services.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static uk.gov.dvla.utils.TestConstants.*;

/**
 * Vehicle Search Page - related web elements are found here
 */
public class VehicleSearchPage {
    public static WebElement clickContinueButton(WebDriver driver) {
        return driver.findElement(By.cssSelector(CONTINUE_BUTTON));
    }

    public static WebElement getContinueButtonInfo(WebDriver driver) {
        return driver.findElement(By.cssSelector(CONTINUE_BUTTON));
    }

    public static WebElement getTitlePageInfo(WebDriver driver) {
        return driver.findElement(By.cssSelector(SEARCH_PAGE_TITLE));
    }

    public static WebElement setRegistrationNumber(WebDriver driver) {
        return driver.findElement(By.cssSelector(SEARCH_PAGE_TEXTBOX));
    }

}
