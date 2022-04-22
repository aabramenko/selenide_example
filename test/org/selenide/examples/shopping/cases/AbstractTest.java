package org.selenide.examples.shopping.cases;

import org.selenide.examples.shopping.data.TestParameters;
import org.selenide.examples.shopping.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.Utils;
import static com.codeborne.selenide.Selenide.open;

public class AbstractTest {

    @BeforeMethod
    void beforeMethod() {

    }

    HomePage openHomePage() {
        Utils.log("open Home Page");
        open(TestParameters.HOME_PAGE_URL);
        return new HomePage();
    }

}
