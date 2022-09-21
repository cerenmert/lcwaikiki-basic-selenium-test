package lcwaikiki.pages;

import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {

    @Test
    public void shouldGoToCategory() {
        BasePage basePage = new BasePage(webDriver);
        CategoryPage categoryPage = basePage.choseCategory();
        ProductPage productPage = categoryPage.selectOneProduct();
        productPage.selectSize();
        productPage.addToBasket();
        basePage.goToBasketPage();
        basePage.goToDashboard();
    }

}
