package first_ver.page;

import first_ver.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public static WebElement element = null;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement miktar(){

        element = findElement(By.name("quantity"));
        return element;

    }


    public WebElement sepetYenile(){

        element = findElement(By.cssSelector(".fa.fa-refresh.green-icon"));
        return element;
    }

    public WebElement sepetBosalt(){

        element = findElement(By.cssSelector(".remove"));
        return element;
    }
}
