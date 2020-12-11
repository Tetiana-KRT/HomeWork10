package homeWork10.desktop.fragments;

import homeWork10.abstractClasses.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homeWork10.constants.TextConstants.ADD_PRODUCT_TO_CART_TITLE;

public final class AddProductToCartPopup extends BasePage {

    @FindBy(xpath="//a[contains(text(),'Check Out')]")
    public static
    WebElement checkOutButton;
    @FindBy(xpath="//div[@id='cboxTitle']//span[@class='headline-text']")
    static
    WebElement popupTitle;

    public void clickCheckOutButton()
    {
        clickButton(checkOutButton);
    }

    public static void verifyAddProductToCartPopupIsOpen()
    {
        Assert.assertTrue(popupTitle.getText().contains(ADD_PRODUCT_TO_CART_TITLE));
    }
}

