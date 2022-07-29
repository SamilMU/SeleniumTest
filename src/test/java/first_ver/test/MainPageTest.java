package first_ver.test;


import first_ver.base.BaseTest;
import first_ver.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class MainPageTest extends BaseTest {

    MainPage mainPage;

    @BeforeEach
    public void setUpTest() {
        System.out.println("Before action is taken");
        mainPage = new MainPage(getDriver());
    }

    @Test
    public void mainPageTest() throws IOException {
        mainPage.pageLoadedCheck().fillSearchBox(readFromCsv("testfile.csv")).clickSearchButton();
        quitDriver();
    }

}

