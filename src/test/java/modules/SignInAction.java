package modules;

import helpers.DataHelper;
import helpers.log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pageObjects.HomePage;
import pageObjects.SignIn;

import java.util.HashMap;
import java.util.List;

public class SignInAction {


      public static void Execute( HashMap<String,String> map){

          HomePage.sign_in.click();

          log.info("Click on sign in action");

          SignIn.email.sendKeys(map.get("username"));

          log.info("email entered");

          SignIn.passwd.sendKeys(map.get("password"));

          log.info("password entered");

          SignIn.submitLogin.click();

          log.info("click action performed");

          // this will write messages in HTML testNG reports

          //Reporter.log("SignIn Action is successfully perfomred");


      }
}
