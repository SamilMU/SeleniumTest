package first_ver.page;

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
        findElement(REFRESH_CART_BUTTON).click();
        return this;
    }

    public CartPage emptyCart() {
        findElement(EMPTY_CART_BUTTON).click();
        return this;
    }

    public CartPage updateCheck() {
        findElement(CART_UPDATE_NOTIFICATION);
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
