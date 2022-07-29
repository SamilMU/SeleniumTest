package first_ver.page;

import first_ver.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {

    private static WebElement element;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement selectBook(int number){

        element = findElement(By.id("product-table"));

        List<WebElement> allChildElements = element.findElements(By.className("product-cr"));

        return allChildElements.get(number).findElement(By.cssSelector(".grid_7.omega")).findElement(By.cssSelector(".name"));
    }
}
