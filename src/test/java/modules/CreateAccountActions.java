package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObjects.CreateAccount;
import pageObjects.HomePage;
import pageObjects.SignIn;

import java.util.HashMap;

public class CreateAccountActions {


    public static void executeCreateAccount (WebDriver driver,HashMap<String, String> map){


        HomePage.sign_in.click();
        SignIn.CreateInitial.email_create.sendKeys(map.get("email"));
        SignIn.CreateInitial.SubmitCreate.click();

        CreateAccount.id_gender2.click();
        CreateAccount.customer_firstname.sendKeys(map.get("firstName"));
        CreateAccount.customer_lastname.sendKeys(map.get("lastName"));
        //CreateAccount.email.sendKeys(map.get("email"));
        CreateAccount.passwd.sendKeys(map.get("password"));

        CreateAccount.days.click();
        new Select(CreateAccount.days).selectByValue(map.get("day"));

        CreateAccount.months.click();
        new Select(CreateAccount.months).selectByValue(map.get("month"));
        CreateAccount.years.click();
        new Select(CreateAccount.years).selectByValue(map.get("year"));

        //CreateAccount.firstname.sendKeys(map.get("firstName"));
        //CreateAccount.lastname.sendKeys(map.get("lastName"));
        CreateAccount.company.sendKeys(map.get("company"));
        CreateAccount.address1.sendKeys(map.get("address"));
        CreateAccount.address2.sendKeys(map.get("address2"));
        CreateAccount.city.sendKeys(map.get("city"));
        new Select(CreateAccount.id_state).selectByVisibleText(map.get("state"));


        CreateAccount.postcode.sendKeys(map.get("postCode"));
        new Select(CreateAccount.id_country).selectByVisibleText(map.get("country"));
        CreateAccount.info.sendKeys(map.get("info"));
        CreateAccount.phone.sendKeys(map.get("phone"));
        CreateAccount.phone_mobile.sendKeys(map.get("mobile"));
        CreateAccount.alias.clear();
        CreateAccount.alias.sendKeys(map.get("alias"));





        CreateAccount.submitAccount.click();





    }
}
