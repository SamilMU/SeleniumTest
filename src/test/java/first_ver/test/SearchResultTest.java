package first_ver.test;

import first_ver.base.BaseTest;
import first_ver.page.SearchPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class SearchResultTest extends BaseTest {

    SearchPage searchPage;

    @BeforeEach
    public void setUpTest(){
        System.out.println("Before action is taken");

        searchPage = new SearchPage(getDriver());
    }

    @Test
    public void searchPageTest(){
        System.out.println("Test");

        Random rand = new Random();
        int int_random = rand.nextInt(20);
        searchPage.selectBook(int_random).click();
    }

}
