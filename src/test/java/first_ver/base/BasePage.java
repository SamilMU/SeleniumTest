package first_ver.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void checkElement(By by){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public void checkElementText(WebElement element, String str) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, str));
    }
}
