package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class seleniumFramework {
    private WebDriver driver;

    public seleniumFramework(){
        driver=Hooks.driver;
    }

    @When("^i open seleniumframework \"([^\"]*)\"$")
    public void i_open_seleniumframework(String url)  {

     driver.get(url);

    }

    @Then("^i should validate \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_should_validate_and(String title, String validateURL)  {


        Assert.assertEquals(driver.getCurrentUrl(),validateURL);

        Assert.assertTrue(driver.getTitle().contains(title));

    }




}
