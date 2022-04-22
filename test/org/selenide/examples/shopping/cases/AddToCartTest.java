package org.selenide.examples.shopping.cases;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.selenide.examples.shopping.data.Locators;
import org.selenide.examples.shopping.data.TestData;
import org.selenide.examples.shopping.pages.HomePage;
import org.selenide.examples.shopping.utils.Utils;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class AddToCartTest extends AbstractTest {

    HomePage homePage;
    String itemName = "";
    String itemSize = "";
    String itemPrice = "";
    String itemQuantity = "";

    @Test
    public void checkHomePage() {
        Utils.testHeader("Open and check Home Page");
        homePage = openHomePage();
        $(By.xpath(Locators.CART_ICON)).should(Condition.appear);
    }

    @Test(dependsOnMethods = "checkHomePage")
    public void searchGood() {
        Utils.testHeader("Search a good");
        homePage.search(TestData.SEARCH_TEXT);
        $(By.xpath(Locators.getYouSearchedForLocator(TestData.SEARCH_TEXT))).should(Condition.appear);
        $(By.xpath(Locators.SEARCH_FIRST_RESULT_CART_ICON)).should(Condition.appear);
    }

    @Test(dependsOnMethods = "searchGood")
    public void addGoodToCart() {
        Utils.testHeader("Add a good to the cart");
        $(By.xpath(Locators.SEARCH_FIRST_RESULT_CART_ICON)).click();
        $(By.xpath(Locators.ADDED_TO_CART_TITLE)).should(Condition.appear);

        itemName = $(By.xpath(Locators.MODAL_ITEM_NAME)).getText().trim();
        itemPrice = $(By.xpath(Locators.MODAL_ITEM_PRICE)).getText().trim();
        itemQuantity = $(By.xpath(Locators.MODAL_ITEM_QUANTITY)).getText().trim();
        itemSize = $(By.xpath(Locators.MODAL_ITEM_SIZE)).getText().trim();

        Utils.log("NAME :: " + itemName);
        Utils.log("PRICE :: " + itemPrice);
        Utils.log("QUANTITY :: " + itemQuantity);
        Utils.log("SIZE :: " + itemSize);
    }

}
