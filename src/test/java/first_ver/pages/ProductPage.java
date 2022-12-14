package first_ver.pages;

import first_ver.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static first_ver.constants.AllConstants.*;

public class ProductPage extends BasePage {

    private WebElement element;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage addToCart() {
        click(ADD_TO_CART_BUTTON);
        return this;
    }
    public ProductPage clickCart() {
        click(CART_BUTTON);
        return this;
    }

    public void goToCartPage() {
        click(GO_TO_CART_BUTTON);
    }


    public ProductPage checkCart() {

        element = findElement(CART_PRODUCT_COUNT);

        checkElementText(element,"1");

        return this;
    }

}
