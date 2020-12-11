package homeWork10.desktop;

import io.cucumber.java.Before;

import static homeWork10.driver.WebDriverFactory.initializeDriver;

public class BeforeClass {
    @Before
    public void setUp() {
        initializeDriver();
    }
}
