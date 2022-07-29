package first_ver.test;


import first_ver.base.BaseTest;
import first_ver.pages.ProductPage;
import first_ver.pages.CartPage;
import first_ver.pages.MainPage;
import first_ver.pages.SearchPage;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTest extends BaseTest {

    SearchPage searchPage;
    MainPage mainPage;
    ProductPage productPage;
    CartPage cartPage;

    @BeforeEach
    public void setUpTest() {
        mainPage = new MainPage(getDriver());
        searchPage = new SearchPage(getDriver());
        productPage = new ProductPage(getDriver());
        cartPage = new CartPage(getDriver());
    }

    @Test
    @Order(1)
    public void mainPageTest() throws IOException {
        mainPage.pageLoadedCheck().fillSearchBox(readFromCsv("testfile.csv")).searchPressEnter();
    }

    @Test
    @Order(2)
    public void searchPageTest() {
        Random rand = new Random();
        int int_random = rand.nextInt(20);
        searchPage.selectRandomProduct(int_random);
    }

    @Test
    @Order(3)
    public void productPageTest() {
        productPage.addToCart().checkCart().clickCart().goToCartPage();
    }

    @Test
    @Order(4)
    public void cartPageTest() {
        cartPage.incrementProductQuantity().refreshCartPage().updateCheck().emptyCart().cartEmptyCheck();
        quitDriver();
    }


}
