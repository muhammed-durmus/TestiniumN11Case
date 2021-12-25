package test;
import base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.*;


public class MainTest extends BaseTest{
    HomePage homepage;
    LoginPage loginPage;
    ProductPage productPage;
    ProductDetailsPage productDetailsPage;
    BasketPage basketPage;
    private static Logger Log = LogManager.getLogger(MainTest.class);


    @Before
    public void before() {
        homepage = new HomePage(getWebDriver());
        loginPage = new LoginPage(getWebDriver());
        productPage = new ProductPage(getWebDriver());
        productDetailsPage = new ProductDetailsPage(getWebDriver());
        basketPage = new BasketPage(getWebDriver());
    }

    @Test
    public void test() throws InterruptedException {


        Log.info("Test başladı");
        Assert.assertEquals("n11.com - Hayat Sana Gelir", getWebDriver().getTitle());
        Log.info("Anasayfanın açıldığı görülür.");
        homepage.ClickLogin();
        loginPage.getUsername().getPassword().clickLogin();

        Assert.assertEquals(homepage.getUserName(),"muhammed durmuş");
        Log.info("Kullanıcı girişinin başarılı olduğu görülür.");
        homepage.ClickSearch();
        homepage.sendText("Bilgisayar");
        homepage.ClickSearchButton();
        homepage.NextPage();

        Thread.sleep(1000);
        productPage.randomProduct();
        String priceInProductDetail= productDetailsPage.getProductPrice();
        System.out.println(priceInProductDetail);
        productDetailsPage.addProductToBasket();
        productDetailsPage.goToBasketPage();

        String priceInBasket=basketPage.getProductBasketPrice();
        System.out.println(priceInBasket);
        Assert.assertEquals(priceInProductDetail,priceInBasket);
        Log.info("Ürün sayfasındaki fiyat ile sepetteki fiyatın aynı olduğu görülür.");

        basketPage.quantityRaiseButton();
        String quantityProductBasket= basketPage.quantityProductBasket();
        System.out.println(quantityProductBasket);
        Assert.assertEquals(quantityProductBasket,"2");
        Log.info("Sepette 2 adet ürün bulunduğu görülür.");

        basketPage.removeAllProduct();
        String emtptyBasketText= basketPage.getEmptyBasket();
        Assert.assertTrue(emtptyBasketText.contains("Sepetiniz Boş"));
        Log.info("Sepetin boş olduğu görülür.");

    }

    @After
    public void endDown(){
        Log.info("Test tamamlandı");
        getWebDriver().quit();
    }

}










