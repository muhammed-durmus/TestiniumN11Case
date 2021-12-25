package constants;
import org.openqa.selenium.By;


public class BasketPageLocators {

    public static final By productPriceInCart = By.cssSelector("div.priceArea");
    public static final By quantityRaise = By.cssSelector(".spinnerUp");
    public static final By quantityProduct = By.className("quantity");
    public static final By deleteButton = By.cssSelector("[title='Sil']");
    public static final By emptyBasket = By.className("cartEmptyText");

}
