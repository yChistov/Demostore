package com.xcart.demostore.steps;

import com.xcart.demostore.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePage_sd {

    HomePage homePage = new HomePage();

    @Given("^Open \"([^\"]*)\" page$")
    public void openPage(String page) {
        open(page);
    }

    @And("^Verify that every product price has \"([^\"]*)\" symbol before amount$")
    public void verifyThatEveryProductPriceHasSymbolBeforeAmount(String symbol) {
        homePage.getPriceList().forEach(s -> assertThat(s).startsWith(symbol));
    }

    @When("^Find \"([^\"]*)\" by search$")
    public void findBySearch(String item) {
        homePage.searchByName(item);
    }

    @When("^Add random item to cart$")
    public void addRandomItemToCart() {
        homePage.addToCartRandomItem();
    }
}
