package step_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import modules.ContactUsActions;
import modules.CreateAccountActions;
import modules.SignInAction;
import modules.SignOutAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObjects.ContactUs;
import pageObjects.CreateAccount;
import pageObjects.HomePage;
import pageObjects.SignIn;

import java.util.HashMap;
import java.util.List;


public class Ecommerce {

    private WebDriver driver;

    List<HashMap<String,String>> dataMap=DataHelper.data("SignInSignOut");
    List<HashMap<String,String>> dataMap2=DataHelper.data("CreateAccount");

    public Ecommerce (){

        driver=Hooks.driver;
        PageFactory.initElements(driver,HomePage.class);
        PageFactory.initElements(driver,SignIn.class);
        PageFactory.initElements(driver,ContactUs.class);
        PageFactory.initElements(driver,CreateAccount.class);
        PageFactory.initElements(driver, SignIn.CreateInitial.class);
    }


    @Given("^i open the automationPractice website$")
    public void i_open_the_automationPractice_website()  {

        driver.get("http://automationpractice.com/index.php?");

    }



    @When("^i sign in$")
    public void i_sign_in()  {

        // how to run the test for all the data

        SignInAction.Execute(dataMap.get(0));


    }

    @Then("^i sign out$")
    public void i_sign_out()  {

        SignOutAction.execute();



    }


    @Given("^i choose a \"([^\"]*)\" , enter the \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",upload the \"([^\"]*)\"$")
    public void i_choose_a_enter_the_upload_the(String header, String email, String orderNumber, String message, String file) {

        ContactUsActions.ExecuteContactUs(header,email,orderNumber,message,file);

    }

    @Then("^i should be able to submit the contact form$")
    public void i_should_be_able_to_submit_the_contact_form()  {

        Assert.assertTrue(ContactUs.successful_message.isDisplayed());

    }


    @Given("^i enter my details$")
    public void i_enter_my_details()  {

        System.out.println("driver=" + driver);

        CreateAccountActions.executeCreateAccount(driver,dataMap2.get(0));


    }

    @Then("^is should be able to sign up and validate \"([^\"]*)\"$")
    public void is_should_be_able_to_sign_up_and_validate(String url)  {

        Assert.assertEquals(url,driver.getCurrentUrl());

    }


}



