package com.xcart.demostore.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;

public class CartPage {

    private ElementsCollection itemsList = $$(".items .item-title a");

    public List<String> getItemsList() {
        return itemsList.stream().map(SelenideElement::getText).collect(Collectors.toList());
    }
}
