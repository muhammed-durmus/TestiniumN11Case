package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import static constants.ProductPageLocators.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Random;
import java.util.List;

import static constants.HomePageLocators.nextPage;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }


    public ProductPage Product(){
        click(product);
        return this;
    }

    public ProductPage randomProduct(){
        List<WebElement> products = findElements(product);
        Random rand = new Random();
        int randomIndex = rand.nextInt(products.size());
        WebElement randomProduct = products.get(randomIndex);
        randomProduct.click();
        return this;
    }


}


