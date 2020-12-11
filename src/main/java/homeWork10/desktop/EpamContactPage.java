package homeWork10.desktop;

import homeWork10.abstractClasses.BasePage;
import homeWork10.constants.TextConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homeWork10.driver.WebDriverFactory.getDriver;

public class EpamContactPage extends BasePage {

    @FindBy(xpath="//div[@class='text']//span[contains(text(),'University Drive')]")
    static
    WebElement epamAddress;

    public void navigateToEpamContactPage() {
        getDriver().get(TextConstants.EPAM_CONTACT_URL);
    }

    public static String getEpamAddress(){
        return epamAddress.getText();
    }
}
