package first_ver.pages;

import first_ver.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static first_ver.constants.AllConstants.*;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void selectRandomProduct(int number) {

        // Select a result
        WebElement randomSelectedProduct = findElement(RESULT_TABLE).findElements(SEARCH_RESULTS).get(number);
        // Go to product Page
        randomSelectedProduct.findElement(RESULT_SELECTABLE_GRID).findElement(SEARCH_RESULT_NAME).click();

    }
}
