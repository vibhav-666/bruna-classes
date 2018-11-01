package modules;

import helpers.log;
import org.openqa.selenium.support.ui.Select;
import pageObjects.ContactUs;
import pageObjects.HomePage;

public class ContactUsActions {


 public static void ExecuteContactUs(String header, String email, String orderNumber, String message, String file){


     //click on Contact us
     HomePage.contact_us.click();
     log.info("contact us page");

     new Select(ContactUs.id_contact).selectByVisibleText(header);
     log.info("selected the header");

     ContactUs.id_order.sendKeys(orderNumber);
     log.info("entered the order number");

     ContactUs.email.sendKeys(email);
     log.info("entered the email");


     ContactUs.message.sendKeys(message);
     log.info("entered the message");



     ContactUs.fileUpload.sendKeys(file);
     log.info("entered the file path");


     ContactUs.submitMessage.click();
     log.info("contact form submited");


 }



}
