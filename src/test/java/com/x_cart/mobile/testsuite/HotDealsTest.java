package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSellersPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.SalePage;
import com.x_cart.mobile.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {

    HomePage homePg = new HomePage();
    SalePage salePg = new SalePage();
    BestSellersPage bestsellersPg = new BestSellersPage();

    @Test
    public void verifySaleProductsArrangeAlphabetically() {
        //1.1 Mouse hover on the “Hot deals” link
        homePg.mouseHoverOnHotDealsLink();
        //1.2 Mouse hover on the “Sale” link and click
        homePg.mouseHoverOnSaleLinkAndClick();
        //1.3 Verify the text “Sale”
        String actualSaleText = salePg.getSaleText();
        Assert.assertEquals(actualSaleText, "Sale", "Error message");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        salePg.mouseHoverOnSortBy();
        salePg.mouseHoverAndClickOnOnNameAToZ();
        //1.5 Verify that the product arrange alphabetically
        String actualMessage = salePg.getProductArrangedAlphabetically();
        Assert.assertEquals(actualMessage, "Name A - Z", "Products not arranged alphabetically");
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() {
        //2.1 Mouse hover on the “Hot deals” link
        homePg.mouseHoverOnHotDealsLink();
        //2.2 Mouse hover on the “Sale” link and click
        homePg.mouseHoverOnSaleLinkAndClick();
        //2.3 Verify the text “Sale”
        String actualSaleText = salePg.getSaleText();
        Assert.assertEquals(actualSaleText, "Sale", "Error message");
        //2.4 Mouse hover on “Sort By” and select “Price Low-High”
        salePg.mouseHoverOnSortBy();
        salePg.mouseHoverAndClickOnPriceLowToHigh();
        //2.5 Verify that the product’s price arrange Low to High
        String actualPriceText = salePg.getPriceLowToHighText();
        Assert.assertEquals(actualPriceText, "Price Low - High", "Products not arranged by price order");
    }

    @Test
    public void verifySaleProductsArrangeByRates() {
        //3.1 Mouse hover on the “Hot deals” link
        homePg.mouseHoverOnHotDealsLink();
        //3.2 Mouse hover on the “Sale” link and click
        homePg.mouseHoverOnSaleLinkAndClick();
        //3.3 Verify the text “Sale”
        String actualSaleText = salePg.getSaleText();
        Assert.assertEquals(actualSaleText, "Sale", "Error message");
        //3.4 Mouse hover on “Sort By” and select “Rates”
        salePg.mouseHoverOnSortBy();
        salePg.mouseHoverAndClickOnRates();
        //3.5 Verify that the product’s price arrange Rates
        String actualRatesText = salePg.getRatesText();
        Assert.assertEquals(actualRatesText, "Rates", "Products not arranged by rates");
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
        //4.1 Mouse hover on the “Hot deals” link
        homePg.mouseHoverOnHotDealsLink();
        //4.2 Mouse hover on the “Bestsellers” link and click
        homePg.mouseHoverOnBestSellersLinkAndClick();
        //4.3 Verify the text “Bestsellers”
        String actualBestSellersText = bestsellersPg.getBestSellersText();
        Assert.assertEquals(actualBestSellersText, "Bestsellers", "Text doesn't match");
        //4.4 Mouse hover on “Sort By” and select “Name z-A”
        bestsellersPg.mouseHoverOnSortBy();
        bestsellersPg.mouseHoverAndClickOnNameZToA();
        //4.5 Verify that the product’s arrange by Z to A
        String actualText = bestsellersPg.getNameZToAText();
        Assert.assertEquals(actualText, "Name Z - A", "Products not arranged by Z - A");
    }

    @Test
    public void verifyBestSellersProductsArrangePriceHighToLow() {
        //5.1 Mouse hover on the “Hot deals” link
        homePg.mouseHoverOnHotDealsLink();
        //5.2 Mouse hover on the “Bestsellers” link and click
        homePg.mouseHoverOnBestSellersLinkAndClick();
        //5.3 Verify the text “Bestsellers”
        String actualBestSellersText = bestsellersPg.getBestSellersText();
        Assert.assertEquals(actualBestSellersText, "Bestsellers", "Text doesn't match");
        //5.4 Mouse hover on “Sort By” and select “Price High-Low”
        bestsellersPg.mouseHoverOnSortBy();
        bestsellersPg.mouseHoverAndClickOnPriceHighToLow();
        //5.5 Verify that the product’s price arrange High to Low
        String actualPriceText = bestsellersPg.getPriceHighToLowText();
        Assert.assertEquals(actualPriceText, "Price High - Low", "Products not arranged by price order");
    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() {
        //6.1 Mouse hover on the “Hot deals” link
        homePg.mouseHoverOnHotDealsLink();
        //6.2 Mouse hover on the “Bestsellers” link and click
        homePg.mouseHoverOnBestSellersLinkAndClick();
        //6.3 Verify the text “Bestsellers”
        String actualBestSellersText = bestsellersPg.getBestSellersText();
        Assert.assertEquals(actualBestSellersText, "Bestsellers", "Text doesn't match");
        //6.4 Mouse hover on “Sort By” and select “Rates”
        bestsellersPg.mouseHoverOnSortBy();
        bestsellersPg.mouseHoverAndClickOnRates();
        //6.5 Verify that the product’s arrange Rates
        String actualRatesText = bestsellersPg.getRatesText();
        Assert.assertEquals(actualRatesText, "Rates", "Error message");
    }
}