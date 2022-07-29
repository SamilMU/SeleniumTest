package first_ver.pages;

import first_ver.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static first_ver.constants.AllConstants.*;

public class CartPage extends BasePage {

    public static WebElement element = null;

    public CartPage(WebDriver driver) {
        super(driver);
    }


    public CartPage refreshCartPage() {
        click(REFRESH_CART_BUTTON);
        return this;
    }

    public CartPage emptyCart() {
        click(EMPTY_CART_BUTTON);
        return this;
    }

    public CartPage updateCheck() {
        findElement(CART_UPDATE_NOTIFICATION);
        findElement(CART_UPDATE_NOTIFICATION_TEXT);
        return this;
    }

    public CartPage cartEmptyCheck() {
        checkElement(CART_INFO);
        return this;
    }


    public CartPage incrementProductQuantity() {

        element = findElement(PRODUCT_QUANTITY_BOX);

        int value = Integer.parseInt(element.getAttribute("value"));
        element.sendKeys(Keys.BACK_SPACE);
        element.sendKeys(String.valueOf(value + 1));

        return this;
    }


}
