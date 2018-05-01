package uk.gov.dvla.services.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static uk.gov.dvla.utils.TestConstants.*;

/**
 * dvla home page - related web elements are kept in this class
 */
public class HomePage {


    public static WebElement clickStartButton(WebDriver driver) {
        return driver.findElement(By.cssSelector(START_BUTTON));
    }

    public static WebElement startButtonInfo(WebDriver driver) {
        return driver.findElement(By.cssSelector(START_BUTTON));
    }

    public static WebElement getTitleInfo(WebDriver driver) {
        return driver.findElement(By.cssSelector(HOME_PAGE_TITLE));
    }

    public static WebElement getText1Info(WebDriver driver) {
        return driver.findElement(By.cssSelector(HOME_PAGE_TEXT1));
    }

    public static WebElement getText2Info(WebDriver driver) {
        return driver.findElement(By.cssSelector(HOME_PAGE_TEXT2));
    }
}
