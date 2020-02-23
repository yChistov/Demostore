package com.xcart.demostore.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class SearchPage {

    private SelenideElement addToCartButton = $(".add-to-cart span");

    private SelenideElement viewCartButton = $(".item-buttons .cart span");

    public void addToCard() {
        actions().moveToElement(addToCartButton).click(addToCartButton).perform();
    }

    public void clickViewCartButton() {
        viewCartButton.click();
    }
}
