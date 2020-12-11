package homeWork10.desktop.pages;

import homeWork10.abstractClasses.BasePage;
import org.openqa.selenium.By;

public final class SearchResultPage extends BasePage {

    private static By productInSearchResult (String productId){
        return By.xpath(String.format("//a[@class='product__list--name'][contains(@href, '%s')]", productId));
    }

    public static void openProductDetails(String productId)
    {
        clickButton(productInSearchResult(productId));
    }

}
