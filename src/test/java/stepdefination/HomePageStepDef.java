package stepdefination;

import com.bridgelabz.pages.HomePage;
import com.bridgelabz.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePageStepDef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage;
    @Given("home page launch url {string} and login using email {string} and password {string}")
    public void launch_url_and_login_using_email_and_password_HomePage(String url, String username, String password) {

        homePage = loginPage.initialLogins(url, username, password);
    }
    @Then("verify home page the title {string}")
    public void verify_the_home_title(String title) throws InterruptedException {
        Thread.sleep(2000);
        String actualTitle = homePage.verifyTitle();
        Assert.assertEquals("Title is not matching...", title, actualTitle);
    }
    @Then("home page close driver")
    public void close_home_page_driver() {
        homePage.closeDriver();
    }
}
