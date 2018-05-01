package uk.gov.dvla.services.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static uk.gov.dvla.utils.TestConstants.*;

/**
 * Confirm Vehicle Page - to store all the web elements
 */
public class ConfirmVehiclePage {

    public static WebElement getTitleInfo(WebDriver driver) {
        return driver.findElement(By.cssSelector(PAGE_TITLE));
    }

    public static WebElement getRegistrationNumber(WebDriver driver) {
        return driver.findElement(By.cssSelector(VEHICLE_REG));
    }

    public static WebElement getVehicleMake(WebDriver driver) {
        return driver.findElement(By.cssSelector(VEHICLE_MAKE));
    }

    public static WebElement getVehicleColor(WebDriver driver) {
        return driver.findElement(By.cssSelector(VEHICLE_COLOR));
    }
}
