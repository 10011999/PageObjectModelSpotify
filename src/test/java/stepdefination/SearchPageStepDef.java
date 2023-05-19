package stepdefination;

import com.bridgelabz.pages.SearchPage;
import com.bridgelabz.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchPageStepDef {
    LoginPage loginPage = new LoginPage();
    SearchPage searchPage;

    @Given("launch url {string} and login using email {string} and password {string}")
    public void launch_url_and_login_using_email_and_password(String url, String username, String password) {

        searchPage = loginPage.initialLogin(url, username, password);
    }

    @When("click on search")
    public void click_on_search() throws InterruptedException {
        Thread.sleep(2000);
        searchPage.clickOnSearch();
    }

    @And("search a track {string}")
    public void search_a_track(String track) {
        searchPage.writeOnSearchField(track);
    }

    @Then("verify the title {string}")
    public void verify_the_title(String title) throws InterruptedException {
        Thread.sleep(2000);
        String actualTitle = searchPage.verifyTitle();
        Assert.assertEquals("Title is not matching...", title, actualTitle);
    }

    @Then("verify currentURL {string}")
    public void verify_current_url(String currentURL) throws InterruptedException {
        Thread.sleep(2000);
        String actualCurrentURL = searchPage.getCurrentURL();
        Assert.assertEquals("Current URL is not matching...", currentURL, actualCurrentURL);
    }

    @Then("search page close driver")
    public void close_driver() {
        searchPage.closeDriver();
    }
}
