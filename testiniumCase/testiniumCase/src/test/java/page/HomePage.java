package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.BasketPageLocators.productPriceInCart;
import static constants.HomePageLocators.*;
import static constants.ProductDetailsPageLocators.totalPrice;

public class HomePage extends BasePage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage ClickLogin(){
        click(LoginButton);
        return this;
    }
    public String getUserName(){

        return findElement(userLoginName).getText();
    }
    public HomePage ClickSearch() {
        click(searchTextbox);
        return this;
    }
    public HomePage sendText(String value){
        sendKeys(searchTextbox, value);
        return this;
    }

    public HomePage ClickSearchButton(){
        click(searchButton);
        return this;
    }

    public HomePage NextPage(){
        click(nextPage);
        return this;
    }


}
