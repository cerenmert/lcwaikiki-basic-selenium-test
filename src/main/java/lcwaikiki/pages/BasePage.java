package lcwaikiki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage extends WebDriverHelper {

    By womanTab = By.cssSelector(".menu-nav > ul > li:nth-of-type(1)");
    By shirtSubCategory = By.cssSelector("li:nth-of-type(1)>.mega-menu>.flex-row>.flex-col.flex-col--zone-items>ul>li:nth-of-type(7) a");
    By myBasket = By.cssSelector("div:nth-of-type(2) > .header-dropdown-toggle");

    By mainHeaderLogo = By.cssSelector(".main-header-logo > svg");

    public BasePage(WebDriver webDriver) {
        super(webDriver);
    }

    public CategoryPage choseCategory() {
        WebElement elect = webDriver.findElement(womanTab);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(elect).perform();
        click(shirtSubCategory, 20);
        return new CategoryPage(webDriver);
    }

    public BasketPage goToBasketPage() {
        click(myBasket, 5);
        return new BasketPage(webDriver);
    }

    public void goToDashboard() {
        click(mainHeaderLogo, 5);
    }


}
