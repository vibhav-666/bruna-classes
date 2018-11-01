package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {



    @FindBy(how = How.XPATH,using = "//a[@title='Log in to your customer account']")
    public static WebElement sign_in;

    @FindBy(how = How.XPATH,using = "//a[@title='Contact Us']")
    public static WebElement contact_us;

    @FindBy(how=How.XPATH, using="//a[@title='Log me out']")
    public static WebElement sign_out;

    @FindBy(how=How.ID, using="search_query_top")
    public static WebElement search_query_top;

    @FindBy(how=How.XPATH, using="View my shopping cart")
    public static WebElement shopping_card;


    public static class HeaderPage{

        @FindBy(how = How.XPATH,using = "//a[@title='Women']")
        public static WebElement menu_women;

        @FindBy(how = How.XPATH,using = "//a[@title='Dresses']")
        public static WebElement menu_dresses;

        @FindBy(how = How.XPATH,using = "//a[@title='T-shirts']")
        public static WebElement menu_tshirts;



        public static class Dresses{

            @FindBy(how = How.XPATH,using = "//a[@title='Summer Dresses']")
            public static WebElement summer_dresses;

            @FindBy(how = How.XPATH,using = "//a[@title='Casual Dresses']")
            public static WebElement casual_dresses;

            @FindBy(how = How.XPATH,using ="//a[@title='Evening Dresses']")
            public static WebElement evening_dresses;


        }

        public static class Women{

            @FindBy(how = How.XPATH,using = "//a[@title='Summer Dresses']")
            public static WebElement summer_dresses;

            @FindBy(how = How.XPATH,using = "//a[@title='Casual Dresses']")
            public static WebElement casual_dresses;

            @FindBy(how = How.XPATH,using ="//a[@title='Evening Dresses']")
            public static WebElement evening_dresses;

            @FindBy(how = How.XPATH,using = "//a[@title='T-shirts']")
            public static WebElement menu_tshirts;

            @FindBy(how = How.XPATH,using = "//a[@title='Blouses']")
            public static WebElement menu_blouses;


        }
    }

}
