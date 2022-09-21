package lcwaikiki.pages;

import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {

    @Test
    public void shouldGoToCategory() {
        BasePage basePage = new BasePage(webDriver);
        CategoryPage categoryPage = basePage.choseCategory();
        //this shadow is not displayed everytime
        categoryPage.closeShadow();
        ProductPage productPage = categoryPage.selectOneProduct();
        //this shadow is displayed if one of the sizes of the product is out of stock
        productPage.closeShadow();
        productPage.selectSize();
        productPage.addToBasket();
        basePage.goToBasketPage();
        basePage.goToDashboard();
    }

}
