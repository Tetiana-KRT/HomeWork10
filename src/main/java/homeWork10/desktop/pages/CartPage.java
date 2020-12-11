package homeWork10.desktop.pages;

import homeWork10.abstractClasses.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

import static homeWork10.desktop.CommonAssertions.verifyFieldEquals;

public final class CartPage extends BasePage {

    @FindBy(xpath="//div[@class='col-xs-6 cart-totals-right text-right']")
    static
    WebElement subtotal;
    @FindBy(xpath="//div[@class='col-xs-6 cart-totals-right text-right grand-total']")
    static
    WebElement total;
    @FindBy(xpath="//div[@class='cart__actions']//button[contains(text(),'Check Out')]")
    public static
    WebElement checkOutButtonInCart;

    public static void verifyEqualsValue(Map<String,String> map)
    {
        map.forEach((k,v) -> verifyFieldEquals(getTotalByType(k),v));
    }

    private static WebElement getTotalByType(String totalType){
        switch (totalType) {
            case "Total":
                return total;
            default:
                return subtotal;
        }
    }
}

