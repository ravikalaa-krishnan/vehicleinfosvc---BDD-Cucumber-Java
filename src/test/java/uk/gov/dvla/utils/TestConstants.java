package uk.gov.dvla.utils;

/**
 * Class to keep all the test level constants in a single place
 */
public class TestConstants {

    // Pages under test

    //CSS Selectors - DVLA HOME_PAGE
    public static final String HOME_PAGE_URL = "https://www.gov.uk/get-vehicle-information-from-dvla";
    public static final String HOME_PAGE_TITLE = "#content > header > div > h1";
    public static final String HOME_PAGE_TEXT1 = "#content > div > div.content-block > div > section.intro > div > p:nth-child(1)";
    public static final String HOME_PAGE_TEXT2 = "#content > div > div.content-block > div > section.intro > div > p:nth-child(2)";
    public static final String START_BUTTON = "#get-started > a";

    //CSS Selectors - Vehicle Search page
    public static final String SEARCH_PAGE_URL = "https://vehicleenquiry.service.gov.uk/";
    public static final String SEARCH_PAGE_URI = "vehicleenquiry.service.gov.uk";
    public static final String SEARCH_PAGE_TITLE = "#content > form > div > div > h1";
    public static final String SEARCH_PAGE_TEXTBOX = "#Vrm";
    public static final String CONTINUE_BUTTON = "#content > form > div > div > div.form-group.no-bottom > fieldset > button";
    public static final String ERR_INFO ="#content > div > h3";


    //CSS Selectors - Confirm Vehicle page
    public static final String CONFIRM_VEHICLE_URL = "https://www.vehicleenquiry.service.gov.uk/ConfirmVehiclePage";
    public static final String VEHICLE_REG = "#pr3 > div > ul > li:nth-child(1) > span.reg-mark";
    public static final String VEHICLE_MAKE = "#pr3 > div > ul > li:nth-child(2) > span:nth-child(2) > strong";
    public static final String VEHICLE_COLOR = "#pr3 > div > ul > li:nth-child(3) > span:nth-child(2) > strong";
    public static final String PAGE_TITLE = "#pr3 > div > h1";

    //Selenium Web Driver
    public static final String CHROME_DRIVER = "webdriver.chrome.driver";
    //public static final String FIREFOX_DRIVER = "webdriver.chrome.driver";
//public static final String IE_DRIVER = "webdriver.chrome.driver";
    public static final String PROPERTY_BROWSER_KEY = "browser.property.key";
    public static final int DEFAULT_WAIT = 20;

    //Location of testdata files
    public static final String TESTDATA_DIR = "src/test/resources/testdata";

    //Supported File extenstions
    public static final String[] FILE_EXTNS = {"csv", "xlsx"};

}
