package first_ver.pages;

import first_ver.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static first_ver.constants.AllConstants.*;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage pageLoadedCheck() {
        findElement(SLIDER);
        return this;
    }

    public MainPage fillSearchBox(String searchStr) {
        findElement(SEARCH_BOX).sendKeys(searchStr);
        return this;
    }

    public void searchPressEnter(){
        // Sendkeys method already completes the search, this method just re-searches.
        findElement(SEARCH_BOX).sendKeys(Keys.ENTER);
    }


}
