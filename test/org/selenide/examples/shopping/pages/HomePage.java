package org.selenide.examples.shopping.pages;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.selenide.examples.shopping.data.Locators;
import org.testng.internal.Utils;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends AbstractPage {

    public HomePage() {
        $(By.xpath(Locators.HOME_SEARCH)).should(Condition.appear);
    }

    public SearchResultPage search(String s) {
        Utils.log("search on the Home Page by [" + s + "]");
        $(By.xpath(Locators.HOME_SEARCH)).setValue(s);
        $(By.xpath(Locators.SEARCH_BUTTON)).click();
        return new SearchResultPage();
    }

}
