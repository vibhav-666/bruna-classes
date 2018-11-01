package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUs {


    @FindBy(how=How.ID,using="id_contact")
    public static WebElement id_contact;

    @FindBy(how=How.ID,using="email")
    public static WebElement email;

    @FindBy(how=How.ID,using="id_order")
    public static WebElement id_order;

    @FindBy(how=How.ID,using="fileUpload")
    public static WebElement fileUpload;

    @FindBy(how=How.ID,using="message")
    public static WebElement message;

    @FindBy(how=How.ID,using="submitMessage")
    public static WebElement submitMessage;

    @FindBy(how=How.XPATH,using=("//p[@class='alert alert-success']"))
    public static WebElement successful_message;




}
