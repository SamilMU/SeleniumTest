package first_ver.test;

import first_ver.base.BaseTest;
import first_ver.page.ProductPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ProductPageTest extends BaseTest {

    ProductPage productPage;

    @BeforeEach
    public void setUpTest(){
        productPage = new ProductPage(getDriver());
    }

    @Test
    public void productPageTest(){
        productPage.addToCart().checkCart().clickCart().goToCartPage();
    }

}
