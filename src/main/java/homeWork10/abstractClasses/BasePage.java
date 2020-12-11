package homeWork10.abstractClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static homeWork10.constants.TextConstants.*;
import static homeWork10.desktop.fragments.AddProductToCartPopup.checkOutButton;
import static homeWork10.desktop.pages.CartPage.checkOutButtonInCart;
import static homeWork10.desktop.pages.ProductDetailsPage.addToCartButton;
import static homeWork10.desktop.pages.RegisterPage.checkOutAsGuestButton;
import static homeWork10.driver.WebDriverFactory.getDriver;

public class BasePage
{

    public BasePage()
    {
        PageFactory.initElements(getDriver(), this);
    }

    public Boolean isElementPresent(By locator)
    {
        return getDriver().findElements(locator).size() > 0;
    }

    public BasePage setField(By field, String value)
    {
        getDriver().findElement(field).sendKeys(value);
        return this;
    }
    public static void setField(WebElement field, String value)
    {
        field.sendKeys(value);
    }

    public static void clickButton(By locator)
    {
        getDriver().findElement(locator).click();
    }

    public static void clickButton(WebElement locator)
    {
        locator.click();
    }
    public static void clickButton(String buttonName)
    {
        getButton(buttonName).click();
    }

    public static String getPageTitle(String pageName){
        switch (pageName) {
            case "Cart":
                return CART_TITLE;
            case "Product details":
                return PRODUCT_DETAILS_TITLE;
            case "Order summary":
                return ORDER_SUMMARY_TITLE;
            case "Register":
                return REGISTER_TITLE;
            case "Search result":
                return SEARCH_RESULT_TITLE;
            default:
                return "No such page";
        }
    }

    public static WebElement getButton(String buttonName){
        switch (buttonName) {
            case "Check out":
                return checkOutButton;
            case "Check out in cart":
                return checkOutButtonInCart;
            case "Check out as guest":
                return checkOutAsGuestButton;
            default:
                return addToCartButton;
        }
    }

}
