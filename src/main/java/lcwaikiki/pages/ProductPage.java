package lcwaikiki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    By selectedSize = By.cssSelector(".option-size a:nth-of-type(3)");
    By addBasketButton = By.cssSelector("a#pd_add_to_cart");

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectSize() {
        click(selectedSize, 2);
    }

    public void addToBasket() {
        click(addBasketButton, 2);
    }

}
