package homeWork10.desktop.pages;

import homeWork10.abstractClasses.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class RegisterPage extends BasePage {

    @FindBy(xpath="//input[@id='guest.email']")
    static
    WebElement guestEmailInput;
    @FindBy(xpath="//input[@id='guest.confirm.email']")
    static
    WebElement confirmGuestEmailInput;
    @FindBy(xpath="//button[.='Check Out as a Guest']")
    public static
    WebElement checkOutAsGuestButton;

    public static void setGuestEmail(String fieldName, String guestEmail)
    {
            setField(getEmailField(fieldName), guestEmail);
    }

    public static void clickCheckOutAsGuestButton()
    {
        clickButton(checkOutAsGuestButton);
    }
    private static WebElement getEmailField(String fieldName){
        switch (fieldName) {
            case "Confirm email address":
                return confirmGuestEmailInput;
            default:
                return guestEmailInput;
        }
    }
}


