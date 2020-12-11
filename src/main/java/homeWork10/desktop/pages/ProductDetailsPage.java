package homeWork10.desktop.pages;

import homeWork10.abstractClasses.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class ProductDetailsPage extends BasePage {

    @FindBy(xpath="//button[@id='addToCartButton']")
    public static WebElement addToCartButton;

}
