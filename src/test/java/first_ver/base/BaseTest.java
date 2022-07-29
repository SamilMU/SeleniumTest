package first_ver.base;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BaseTest {

    private static WebDriver driver = null;


    @BeforeAll
    public static void setUp(){

        System.setProperty("webdriver.chrome.driver","E:\\Testinium\\chromedriver.exe");
        setDriver(new ChromeDriver());
        getDriver().get("https://www.kitapyurdu.com");

    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setDriver(WebDriver driver){
        BaseTest.driver = driver;
    }

    public void quitDriver(){
        getDriver().quit();
    }

    public static String readFromCsv(String path) throws FileNotFoundException {

        StringBuilder returnStr = new StringBuilder();
            Scanner sc = new Scanner(new File(path));
            sc.useDelimiter(",");
            while(sc.hasNext()){
                returnStr.append(sc.next());
            }

        return returnStr.toString();
    }
}
