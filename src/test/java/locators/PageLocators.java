package locators;

import config.Setup;
import org.openqa.selenium.WebDriver;

public class PageLocators extends Setup {
    WebDriver driver = getDriver();

    private String searchBox_xpath = "//input[@id='twotabsearchtextbox']";
    private String searchIcon_xpath = "//input[@id='nav-search-submit-button']";

    public String getSearchBox_xpath() {
        return searchBox_xpath;
    }

    public String getSearchIcon_xpath() {
        return searchIcon_xpath;
    }
}
