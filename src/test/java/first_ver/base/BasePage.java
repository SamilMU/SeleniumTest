package first_ver.base;

import first_ver.pages.ProductPage;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public static final Logger logger = LogManager.getLogger(ProductPage.class);
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement findElement(By by){
        try{
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        }catch (Exception e){
            logger.log(Level.DEBUG, e);
            driver.quit();
        }
        return driver.findElement(by);
    }

    public void checkElement(By by){
        try{
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        }catch (Exception e){
            logger.log(Level.DEBUG, e);
            driver.quit();
        }
    }

    public void checkElementText(WebElement element, String str) {
        try{
        wait.until(ExpectedConditions.textToBePresentInElement(element, str));
        }catch (Exception e){
            logger.log(Level.DEBUG, e);
            driver.quit();
        }
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

}
