package first_ver.test;


import first_ver.base.BaseTest;
import first_ver.page.BookPage;
import first_ver.page.CartPage;
import first_ver.page.MainPage;
import first_ver.page.SearchPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;

import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AllTests extends BaseTest {

    SearchPage searchPage;
    MainPage mainPage;
    BookPage bookPage;
    CartPage cartPage;

    @BeforeEach
    public void setUpTest(){
        System.out.println("Before action is taken");
        mainPage = new MainPage(getDriver());
        searchPage = new SearchPage(getDriver());
        bookPage = new BookPage(getDriver());
        cartPage = new CartPage(getDriver());
    }

    @Test
    @Order(1)
    public void mainPageTest() throws Exception {
        System.out.println("Test");
        mainPage.pageLoadedCheck();
        mainPage.searchBox().sendKeys(readFromCsv("testfile.csv"));
        mainPage.searchButton().click();
    }

    @Test
    @Order(2)
    public void searchPageTest(){
        System.out.println("Test");

        Random rand = new Random();
        int int_random = rand.nextInt(10);
        searchPage.selectBook(int_random).click();
    }

    @Test
    @Order(3)
    public void bookPageTest(){
        System.out.println("Test");

        bookPage.sepetEkle().click();
        bookPage.sepetUrunKontrol();
        bookPage.sepetTikla().click();
        bookPage.sepeteGit().click(); //Gotta wait the previous
    }

    @Test
    @Order(4)
    public void cartPageTest(){
        System.out.println("Test");

        int value = Integer.parseInt(cartPage.miktar().getAttribute("value"));
        value++;
        cartPage.miktar().sendKeys(Keys.BACK_SPACE);
        cartPage.miktar().sendKeys(String.valueOf(value));
        cartPage.sepetYenile().click();
        cartPage.sepetBosalt().click();
        quitDriver();
    }


}
