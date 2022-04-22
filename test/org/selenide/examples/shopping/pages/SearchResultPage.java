package org.selenide.examples.shopping.pages;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.selenide.examples.shopping.data.Locators;

import static com.codeborne.selenide.Selenide.*;

public class SearchResultPage extends AbstractPage {

    public SearchResultPage() {
        $(By.xpath(Locators.getYouSearchedForLocator(""))).should(Condition.appear);
    }

}
