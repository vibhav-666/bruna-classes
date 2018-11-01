package step_definitions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * blocks of code that will run before of after each scenario
 */
public class Hooks {





 public static WebDriver driver;

 DesiredCapabilities capabilities=null;

 @Before
 public void openBrowser() throws MalformedURLException{

     log.info("************************Test Scenarios started********************");
     System.out.println("Opening Chrome Browser------------------------------");
     System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");

     // Class to manage options specific to ChromeDriver.
     ChromeOptions options = new ChromeOptions();
     options.addArguments("start-maximized");
     options.addArguments("--disable-extensions");
     options.addArguments("--disable-infobars");
     //this will collect the preferences
     Map<String,Object>prefs=new HashMap<String, Object>();
     // this will stop chrome asking if you want to save password
     prefs.put("credentials_enable_service",false);
     prefs.put("profile.password_manager_enabled",false);
     // this is doing the same as disable inforbars above , do we need it ?
     prefs.put("excludeSwitches", "enable-automation");
     // will this read all the preferences from the hashmap ?
     options.setExperimentalOption("prefs",prefs);
     capabilities=DesiredCapabilities.chrome();
     //capabilities.setVersion("latest");
     capabilities.setCapability("version","latest");
     //capabilities.setBrowserName("chrome");
     capabilities.setCapability("browserName","chrome");
     capabilities.setCapability(ChromeOptions.CAPABILITY,options);
     driver=new ChromeDriver(options);
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.manage().deleteAllCookies();



 }







    /**
     * will run after every scenario
     * will take screenshot at the last screen where test case failed.
     * attach the screenshot to the report output
     * close the chrome browser session
     *
     * @param scenario
     * @throws IOException
     */
    @After

    public void embedScreenshot(Scenario scenario) throws IOException {

        System.out.println("after test");

        if(scenario.isFailed()){
            // this is not calling our log class m whats the point of the log class???
            log.error("Test Scenarios Failed");
            try {
                //  log.error("Test Scenario Failed");

                System.out.println("in failed");
                //where is this writing??
                scenario.write("Current page URL is " + driver.getCurrentUrl());
                String scFileName = "Screenshot_" + System.currentTimeMillis();
                String screenShotFilePath = System.getProperty("user.dir") + "\\ExecutionReports\\FailedScreenShots" + "\\" + scFileName + ".png";
                // what is the advantage on  doing this and not as file
                byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                FileOutputStream fileOutputStream = new FileOutputStream(screenShotFilePath);
                //why this??
                System.out.println("screen3");
                fileOutputStream.write(screenShot);
                scenario.embed(screenShot, "image/png");

               // Reporter.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\target2\\cucumber-html-report\\embedded0.png");


            }catch(WebDriverException somePlatformsDontSupportScreenshots){

                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
//shouldnt this be under the next bracket ? right it will only log if the scenario fails
            log.info("**********Test Scenarios END********************");

        }
        driver.quit();
    }

}
