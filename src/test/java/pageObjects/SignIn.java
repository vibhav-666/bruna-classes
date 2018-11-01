package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn {


    @FindBy(how=How.ID,using="email")
    public static WebElement email;

    @FindBy(how=How.ID,using="passwd")
    public static WebElement passwd;

    @FindBy(how=How.ID,using="SubmitLogin")
    public static WebElement submitLogin;

    @FindBy(how=How.LINK_TEXT,using="Forgot your password?")
    public static WebElement forgotten_password;


    public static class CreateInitial {

        @FindBy(how=How.ID,using="email_create")
        public static WebElement email_create;

        @FindBy(how=How.ID,using="SubmitCreate")
        public static WebElement SubmitCreate;


    }



}
