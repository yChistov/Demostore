package com.xcart.demostore.steps;

import com.xcart.demostore.pages.CartPage;
import com.xcart.demostore.pages.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static com.codeborne.selenide.Selenide.sleep;

public class CartPage_sd {

    SearchPage searchPage = new SearchPage();

    CartPage cartPage = new CartPage();

    @Then("^Verify \"([^\"]*)\" is in cart$")
    public void verifyProductIsInCart(String item) {
        searchPage.clickViewCartButton();
        cartPage.getItemsList().stream()
                .filter(elem -> elem.contains(item))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Result with item [" + item + "] not found"));
    }

    @And("^Open cart and verify item is there$")
    public void openCartAndVerifyItemIsThere() {
        searchPage.clickViewCartButton();
    }
}
