package uk.gov.dvla.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ErrorHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static uk.gov.dvla.utils.TestConstants.DEFAULT_WAIT;

/**
 * Class to keep Selenium Web Driver specific general methods
 */
public class DriverUtil {
    public static WebDriver driver = null;

    public static WebDriver getDriver() {
        if (driver != null) {

            return driver;
        }

        System.setProperty("webdriver.gecko.driver", "src/test/resources/webdrivers/geckodriver.exe");
        DesiredCapabilities capabilities = null;
        capabilities = DesiredCapabilities.firefox();
        capabilities.setJavascriptEnabled(true);
        driver = chooseDriver(capabilities);
        driver.manage().timeouts().setScriptTimeout(DEFAULT_WAIT,
                TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    /**
     * By default to web driver will be Firefox driver
     * <p>
     * Override it by passing -DWebDriver=Chrome to the command line arguments
     *
     * @param capabilities
     * @return
     */
    private static WebDriver chooseDriver(DesiredCapabilities capabilities) {
        String preferredDriver = System.getProperty("browser", "Firefox");
        boolean headless = System.getProperty("Headless", "true").equals("true");

        switch (preferredDriver.toLowerCase()) {
            case "phantomjs":
                return new PhantomJSDriver(capabilities);
            case "chrome":
                final ChromeOptions chromeOptions = new ChromeOptions();
                if (headless) {
                    chromeOptions.addArguments("--headless");
                }
                capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                System.out.println("********************* before driver created");
                ChromeDriver chromeDriver = new ChromeDriver();
                System.out.println("********************* after driver created");
                ErrorHandler handler = new ErrorHandler();
                handler.setIncludeServerErrors(false);
                chromeDriver.setErrorHandler(handler);
                return chromeDriver;
            default:
                FirefoxOptions options = new FirefoxOptions();
                if (headless) {
                    options.addArguments("-headless", "-safe-mode");
                }
                capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
                final FirefoxDriver firefoxDriver = new FirefoxDriver();
                return firefoxDriver;
        }
    }

    public static WebElement waitAndGetElementByCssSelector(WebDriver driver, String selector,
                                                            int seconds) {
        By selection = By.cssSelector(selector);
        return (new WebDriverWait(driver, seconds)).until( // wait until element is visible!
                ExpectedConditions.visibilityOfElementLocated(selection));
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


    public static void closeDriver() {
        if (driver != null) {
            try {
                driver.close();
            } catch (NoSuchMethodError nsme) {
                nsme.printStackTrace();
            } catch (NoSuchSessionException nsse) {
                nsse.printStackTrace();
            } catch (SessionNotCreatedException snce) {
                snce.printStackTrace();
            }

        }
    }
}

