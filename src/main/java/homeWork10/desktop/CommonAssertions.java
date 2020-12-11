package homeWork10.desktop;

import homeWork10.abstractClasses.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static homeWork10.driver.WebDriverFactory.getDriver;

public class CommonAssertions extends BasePage {
    public static void verifyFieldEquals(WebElement field, String value)
    {
        Assert.assertEquals(value, field.getText());
    }

    public static void verifyFieldContains(WebElement field, String value)
    {
        Assert.assertTrue(field.getText().contains(value));
    }

    public static void verifyPageIsOpen(String pageName)
    {
        Assert.assertTrue(getDriver().getTitle().contains(BasePage.getPageTitle(pageName)));
    }

}
