package com.xcart.demostore.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private ElementsCollection productPrices = $$(".price.product-price");

    private ElementsCollection addToCartList = $$(".add-to-cart-button span");

    private SelenideElement search = $("#search .input input");

    public List<String> getPriceList() {
        return productPrices.stream().map(SelenideElement::getText).collect(Collectors.toList());
    }

    public void searchByName(String item) {
        search.setValue(item).pressEnter();
    }

    public void addToCartRandomItem() {
        SelenideElement filterItem = addToCartList.stream()
                .findAny()
                .orElseThrow(() -> new RuntimeException("Item not found"));
        actions().moveToElement(filterItem).click(filterItem).perform();
    }
}
