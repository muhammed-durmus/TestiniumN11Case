package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import static constants.ProductDetailsPageLocators.*;


public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver webDriver) {
        super(webDriver);}


    public String getProductPrice(){

        return findElement(totalPrice).getText();
    }

    public ProductDetailsPage addProductToBasket(){
        clickWithEvent(addBasketButton);
        return this;
    }

    public ProductDetailsPage goToBasketPage(){
       click(goToBasket);
        return this;
    }
}
