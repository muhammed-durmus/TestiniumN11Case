package constants;
import org.openqa.selenium.By;

public class ProductDetailsPageLocators {
    public static final By totalPrice = By.cssSelector(".priceDetail > .newPrice");
    public static final By addBasketButton = By.cssSelector("[title='Sepete Ekle']");
    public static final By goToBasket = By.xpath("//a[@class='myBasket ']");
}
