package first_ver.page;

import first_ver.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static first_ver.constants.AllConstants.*;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void selectBook(int number){
        // Get All the results
        List<WebElement> allChildElements = findElement(RESULT_TABLE).findElements(SEARCH_RESULTS);
        // Select one at random.
        allChildElements.get(number).findElement(SINGLE_RESULT).findElement(SEARCH_RESULT_NAME).click();

    }
}
