package first_ver.pages;

import first_ver.base.BasePage;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


import static first_ver.constants.AllConstants.*;

public class SearchPage extends BasePage {

    public static final Logger logger = LogManager.getLogger(ProductPage.class);

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void selectRandomProduct(int number) {

        // Results Div -> All results -> Pick random -> Get clickable grid of selected result -> Get name from the grid -> Click it.
        findElement(RESULT_TABLE).findElements(SEARCH_RESULTS).get(number).findElement(RESULT_SELECTABLE_GRID).findElement(SEARCH_RESULT_NAME).click();

        // Click method can misfire.
        if(getTitle().equals("roman için arama sonuçları")){
            findElement(RESULT_TABLE).findElements(SEARCH_RESULTS).get(number).findElement(RESULT_SELECTABLE_GRID).findElement(SEARCH_RESULT_NAME).click();
            logger.log(Level.DEBUG, "Misfired");
        }
        
    }

}
