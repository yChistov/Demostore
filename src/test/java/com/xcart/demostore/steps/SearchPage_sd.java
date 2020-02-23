package com.xcart.demostore.steps;

import com.xcart.demostore.pages.SearchPage;
import cucumber.api.java.en.And;

public class SearchPage_sd {

    SearchPage searchPage = new SearchPage();

    @And("^Add to cart$")
    public void addToCart() {
        searchPage.addToCard();
    }
}
