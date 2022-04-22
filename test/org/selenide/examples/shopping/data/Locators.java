package org.selenide.examples.shopping.data;

public class Locators {

    public static String CART_ICON = "//*[contains(@class, 'shop_info')]//*[@class='mini-cart-icon']";

    public static String HOME_SEARCH = "//*[@id='js-site-search-input']";

    public static String SEARCH_BUTTON = "//button[contains(@class, 'search_button')]";

    public static String getYouSearchedForLocator(String s) {
        if (s.length() > 0) {
            s = '"' + s + '"';
        }
        return "//*[@class='results']/h1[contains(text(), '" + TestData.YOU_SEARCHED_FOR + " " + s + "')]";
    }

    public static String SEARCH_FIRST_RESULT_CART_ICON = "//*[@class='product__listing product__grid']/*[@class='product-item'][1]//button[contains(@class, 'shopping-cart')]";

    public static String ADDED_TO_CART_TITLE = "//*[@id='colorbox']//*[text()='Added to Your Shopping Bag']";

    public static String MODAL_ITEM_NAME = "//*[@class='add-to-cart-item']//a[@class='name']";

    public static String MODAL_ITEM_PRICE = "//*[@class='add-to-cart-item']//*[@class='price']";

    public static String MODAL_ITEM_QUANTITY = "//*[@class='add-to-cart-item']//*[@class='qty']";

    public static String MODAL_ITEM_SIZE = "//*[@class='add-to-cart-item']//*[@class='itemSize']";
}
