package step_definitions;

import config.Setup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locators.PageLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestSteps extends Setup {
    WebDriver driver = getDriver();
    PageLocators locators = new PageLocators();
    private String shoeName;

    @Given("I navigate to the Amazon US website")
    public void navigateToURL() throws InterruptedException {
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @And("I type shoes in the search box")
    public void typeShoesInSearchBox() {
        driver.findElement(By.xpath(locators.getSearchBox_xpath())).sendKeys("shoes");
    }

    @And("I click on the search icon")
    public void clickOnSearchIcon() throws InterruptedException {
        driver.findElement(By.xpath(locators.getSearchIcon_xpath())).click();
        Thread.sleep(5000);
    }

    @When("I select a shoe")
    public void selectAShoe() {
        WebElement selectedShoePlaceholder = driver.findElement(By.xpath("//img[@data-image-index='19']"));
        System.out.println(selectedShoePlaceholder.getAttribute("alt"));
        shoeName = selectedShoePlaceholder.getAttribute("alt");
        driver.findElement(By.xpath("//img[@data-image-index='19']")).click();
    }

    @Then("I should see the selected shoe with it's details")
    public void checkThatShoesShowsWithItsDetails() {
        String productTitle = driver.findElement(By.xpath("//h1[@id='title']")).getText();
        System.out.println(productTitle);
        Assert.assertTrue(shoeName.contains(productTitle));
    }
}
