package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.BasketPageLocators.*;
import static constants.HomePageLocators.searchTextbox;


public class BasketPage extends BasePage {
    public BasketPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getProductBasketPrice(){

        return findElement(productPriceInCart).getText();
    }
    public BasketPage quantityRaiseButton() {
        click(quantityRaise);
        return this;
    }

    public String quantityProductBasket(){
        return findElement(quantityProduct).getAttribute("value");
    }
    public BasketPage removeAllProduct () {
        click(deleteButton);
        return this;
    }

    public String getEmptyBasket(){

        return findElement(emptyBasket).getText();
    }

}
