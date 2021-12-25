package constants;
import org.openqa.selenium.By;



public class HomePageLocators {

    public static final By LoginButton = By.className("btnSignIn");
    public static final By userLoginName = By.xpath("//a[@class='menuLink user']");
    public static final By searchTextbox = By.id("searchData");
    public static final By searchButton = By.className("searchBtn");
    public static final By nextPage = By.cssSelector("a[href='https://www.n11.com/arama?q=Bilgisayar&pg=2'");

}
