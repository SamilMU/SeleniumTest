package first_ver.test;

import first_ver.base.BaseTest;
import first_ver.page.CartPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartPageTest extends BaseTest {

    CartPage cartPage;

    @BeforeEach
    public void setUpTest(){
        cartPage = new CartPage(getDriver());
    }

    @Test
    public void cartPageTest(){
        cartPage.incrementProductQuantity().refreshCartPage().updateCheck().emptyCart().cartEmptyCheck();
        quitDriver();
    }
}
