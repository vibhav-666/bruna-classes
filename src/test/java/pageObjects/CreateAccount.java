package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {


    @FindBy(how=How.XPATH,using="//input[@name='id_gender' and @value='1']")
    public static WebElement id_gender1;

    @FindBy(how=How.XPATH,using="//input[@name='id_gender' and @value='2']")
    public static WebElement id_gender2;

    @FindBy(how=How.XPATH,using="//input[@name='customer_firstname']")
    public static WebElement customer_firstname;

    @FindBy(how=How.XPATH,using="//input[@name='customer_lastname']")
    public static WebElement customer_lastname;

    @FindBy(how=How.ID,using="email")
    public static WebElement email;

    @FindBy(how=How.XPATH,using="//input[@name='passwd']")
    public static WebElement passwd;

    @FindBy(how=How.XPATH,using="//*[@id=\"days\"]")
    public static WebElement days;

    @FindBy(how=How.XPATH,using="//*[@id=\"months\"]")
    public static WebElement months;

    @FindBy(how=How.XPATH,using="//*[@id=\"years\"]")
    public static WebElement years;

    @FindBy(how=How.XPATH,using="//input[@name='newsletter']")
    public static WebElement newsletter;

    @FindBy(how=How.XPATH,using="//input[@name='optin']")
    public static WebElement optin;

    @FindBy(how=How.XPATH,using="//input[@name='firstname']")
    public static WebElement firstname;

    @FindBy(how=How.XPATH,using="//input[@name='lastname']")
    public static WebElement lastname;

    @FindBy(how=How.XPATH,using="//input[@name='company']")
    public static WebElement company;

    @FindBy(how=How.XPATH,using="//input[@name='address1']")
    public static WebElement address1;

    @FindBy(how=How.XPATH,using="//input[@name='address2']")
    public static WebElement address2;

    @FindBy(how=How.XPATH,using="//input[@name='city']")
    public static WebElement city;

    @FindBy(how=How.XPATH,using="//select[@id='id_state']")
    public static WebElement id_state;

    @FindBy(how=How.XPATH,using="//input[@name='postcode']")
    public static WebElement postcode;

    @FindBy(how=How.XPATH,using="//select[@id='id_country']")
    public static WebElement id_country;

    @FindBy(how=How.XPATH,using="//*[@name='other']")
    public static WebElement info;

    @FindBy(how=How.XPATH,using="//input[@name='phone']")
    public static WebElement phone;

    @FindBy(how=How.XPATH,using="//input[@name='phone_mobile']")
    public static WebElement phone_mobile;

    @FindBy(how=How.XPATH,using="//input[@name='alias']")
    public static WebElement alias;

    @FindBy(how=How.XPATH,using="//button[@name='submitAccount']")
    public static WebElement submitAccount;



}
