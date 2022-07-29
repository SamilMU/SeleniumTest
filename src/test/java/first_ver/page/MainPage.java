package first_ver.page;

import first_ver.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    private static WebElement element = null;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void pageLoadedCheck(){

        element = findElement(By.id("desktop-banners"));
        if(element == null){
         throw new NotFoundException("Main Page is not loaded");
        }

    }

    public WebElement searchBox(){

        element = findElement(By.name("search_keyword"));
        return element;

    }

    public WebElement searchButton(){

        element = findElement(By.cssSelector(".common-sprite.button-search"));
        return element;

    }


}
