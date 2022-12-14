package lcwaikiki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage {
    By selectFirstProduct = By.cssSelector("div:nth-of-type(1).product-card.product-card--one-of-4");
    By wrapperTextOfShadow = By.cssSelector(".ab-test-507-wrapper");

    public CategoryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ProductPage selectOneProduct() {
        click(selectFirstProduct, 2);
        return new ProductPage(webDriver);
    }

    public void closeShadow() {
        click(wrapperTextOfShadow, 2);
    }


}
