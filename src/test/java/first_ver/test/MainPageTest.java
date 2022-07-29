package first_ver.test;


import first_ver.base.BaseTest;
import first_ver.page.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MainPageTest extends BaseTest {

    MainPage mainPage;

    @BeforeEach
    public void setUpTest(){
        System.out.println("Before action is taken");
        mainPage = new MainPage(getDriver());
    }

    @Test
    public void mainPageTest(){
        System.out.println("Test");
        mainPage.searchBox().sendKeys("roman");
        mainPage.searchButton().click();
    }

}

