package testRunner;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

import java.io.IOException;

public class stepDefinitions {
    //test
    WebDriver driver = new ChromeDriver();

    @Given("Open the Chrome browser and launch the application")
    public void open_the_chrome_browser_and_launch_the_application() {
        // Wrdddite code here that turns the phrase above into concrete actions

        driver.manage().window().maximize();
        String url = "https://global.hitachi-solutions.com/";
        driver.get(url);
//        throw new io.cucumber.java.PendingException();

    }


    @Then("Home page should be launched")
    public void home_page_should_be_launched() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
//driver.wait(10000);
        driver.findElement(By.className("hero-homepage")).isDisplayed();
        driver.close();


    }

    @When("Click the Search Icon with Blank Keyword")
    public void click_the_search_icon_with_blank_keyword() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // driver.wait(6000);
        driver.findElement(By.className("header-search")).click();
        driver.findElement(By.className("search-form-submit")).click();

    }

    @Then("Search Results Page should be displayed")
    public void search_results_page_should_be_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(By.className("results")).getText().toString();
        Thread.sleep(3000);
        driver.findElement(By.className("search-result")).isDisplayed();

        driver.close();
    }


    @When("Enter a valid keyword and click the search icon")
    public void click_the_search_icon_with_valid_keyword() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // driver.wait(6000);
        driver.findElement(By.className("header-search")).click();
        driver.findElement(By.id("site-search-keyword")).sendKeys("Azure");
        driver.findElement(By.className("search-form-submit")).click();

    }

    @Then("Search Results Page should be displayed with valid keyword")
    public void search_results_page_should_be_displayed_keyword() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(By.className("results")).getText().toString();
        Thread.sleep(5000);
        driver.findElement(By.className("search-result")).isDisplayed();

    }

    @Then("Validate if URL has the right keyword")
    public void validate_if_url_has_the_right_keyword() {
        // Write code here that turns the phrase above into concrete actions
        driver.getCurrentUrl().contains("azure");

    }

    @Then("Click the returned Search result snd verify if the user is able to navigate to respective pages")
    public void click_the_returned_search_result_snd_verify_if_the_user_is_able_to_navigate_to_respective_pages() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        driver.findElement(By.linkText("Azure Cost Optimization")).click();
        driver.close();
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "ss");
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        }

    }
}