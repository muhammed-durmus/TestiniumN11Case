package page;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.LoginPageLocators.*;
import static base.BasePage.*;


public class LoginPage extends BasePage{


    public LoginPage(WebDriver webDriver){
        super(webDriver);
    }

    public LoginPage getUsername(){

        sendKeys(username, "m.drms1905@gmail.com");
        return this;
    }

    public LoginPage getPassword(){

        sendKeys(password, "*******");
        return this;
    }

    public LoginPage clickLogin() throws InterruptedException {

        click(LoginButton);

        return this;
    }

}
