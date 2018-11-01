package modules;

import helpers.log;
import org.testng.Reporter;
import pageObjects.HomePage;

public class SignOutAction {

    public static void execute(){

        HomePage.sign_out.click();

        log.info("signed out");

        //Reporter.log("Sign out is performed");
    }




}
