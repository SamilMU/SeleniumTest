package first_ver.constants;

import org.openqa.selenium.By;

public class AllConstants {
    /** Main Page */
    public static final By SLIDER= By.id("desktop-banners");
    public static final By SEARCH_BOX= By.name("search_keyword");
    public static final By SEARCH_BUTTON= By.cssSelector(".common-sprite.button-search");

    /** Search Page */
    public static final By RESULT_TABLE = By.id("product-table");
    public static final By SEARCH_RESULTS = By.className("product-cr");
    public static final By SINGLE_RESULT = By.cssSelector(".grid_7.omega");
    public static final By SEARCH_RESULT_NAME = By.cssSelector(".name");

    /** Product Page */
    public static final By ADD_TO_CART_BUTTON = By.id("button-cart");
    public static final By CART_PRODUCT_COUNT = By.id("cart-items");
    public static final By CART_BUTTON = By.id("cart");
    public static final By GO_TO_CART_BUTTON = By.id("js-cart");

    /** Cart Page */
    public static final By PRODUCT_QUANTITY_BOX = By.name("quantity");
    public static final By REFRESH_CART_BUTTON = By.cssSelector(".fa.fa-refresh.green-icon");
    public static final By EMPTY_CART_BUTTON = By.cssSelector(".remove");
    public static final By CART_UPDATE_NOTIFICATION = By.id("swal2-title");
    public static final By CART_INFO = By.className("cart-info");

}
