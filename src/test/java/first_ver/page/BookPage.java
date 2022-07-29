package first_ver.page;

import first_ver.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class BookPage extends BasePage {

    public static WebElement element = null;

    public BookPage(WebDriver driver) {
        super(driver);
    }

    public WebElement sepetEkle(){

        element = findElement(By.id("button-cart"));
        return element;

    }

    public WebElement sepetUrunGostergesi(){

        element = findElement(By.id("cart-items"));
        return element;
    }

    public void sepetUrunKontrol(){

        element = findElement(By.id("cart-items"));
        if(Objects.equals(element.getText(), "0")){
            sepetEkle().click();
        }

    }

    public WebElement sepetTikla(){

        element = findElement(By.id("cart"));
        return element;
    }

    public WebElement sepeteGit(){

        element = findElement(By.id("js-cart"));
        return element;
    }

}
