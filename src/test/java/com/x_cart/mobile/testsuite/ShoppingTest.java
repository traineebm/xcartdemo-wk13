package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {

    HomePage homePg = new HomePage();
    SalePage salePg = new SalePage();
    BestSellersPage bestsellersPg = new BestSellersPage();
    ShoppingCartPage shoppingcartPg = new ShoppingCartPage();
    CheckoutPage checkoutPg = new CheckoutPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {

        // 1.1 Mouse hover on the “Hot deals” link
        homePg.mouseHoverOnHotDealsLink();
        //  1.2 Mouse hover on the “Bestsellers”  link and click
        homePg.mouseHoverOnBestSellersLinkAndClick();
        //1.3 Verify the text “Bestsellers”
        String actualBestSellersText = bestsellersPg.getBestSellersText();
        Assert.assertEquals(actualBestSellersText, "Bestsellers", "Error message");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestsellersPg.mouseHoverOnSortBy();
        bestsellersPg.mouseHoverAndClickOnNameAToZ();
        //1.5 Click on “Add to cart” button of the product “iphone”
        bestsellersPg.mouseHoverOnAppleIphone();
        Thread.sleep(2000);
        bestsellersPg.mouseHoverAndClickOnAddToCartButton();
        // 1.6 Verify the message “Product has been added to your cart” display in  green bar
        String actualAddProductSuccessText = bestsellersPg.getAddToCartProductSuccessText();
        Assert.assertEquals(actualAddProductSuccessText, "Product has been added to your cart", "Error message");
        //1.7 Click on X sign to close the message
        bestsellersPg.clickOnCloseButton();
        Thread.sleep(1000);
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        bestsellersPg.clickOnYourCartButton();
        Thread.sleep(2000);
        bestsellersPg.clickOnViewCartButton();
        //1.9 Verify the text “Your shopping cart - 1 item”
        String actualShoppingCartItemText = shoppingcartPg.getShoppingCartItemText();
        Assert.assertEquals(actualShoppingCartItemText, "Your shopping cart - 1 item", "Error message");
        // 1.10 Verify the Subtotal $299.00
        String actualSubTotalPrice = shoppingcartPg.getSubTotalPrice();
        Assert.assertEquals(actualSubTotalPrice, "$299.00", "Error message");
        // 1.11 Verify the total $309.73
        String actualTotal = shoppingcartPg.getExpectedTotal();
        Assert.assertEquals(actualTotal, "$309.73", "Error message");
        // 1.12 Click on “Go to checkout” button
        shoppingcartPg.clickOnGoToCheckOutButton();
        //1.13 Verify the text “Log in to your account”
        String actualLoginToYourAccountText = checkoutPg.getLoginToYourAccountText();
        Assert.assertEquals(actualLoginToYourAccountText, "Log in to your account", "Error message");
        // 1.14 Enter Email address
        checkoutPg.enterEmailAddressField("munirashah089@gmail.com");
        // 1.15 Click on “Continue” Button
        checkoutPg.clickOnContinueButton();
        //1.16 Verify the text “Secure Checkout”
        String actualSecureCheckoutText = checkoutPg.getSecureCheckoutText();
        Assert.assertEquals(actualSecureCheckoutText, "Secure Checkout", "Error message");
        // 1.17 Fill all the mandatory fields
        checkoutPg.enterFirstNameField("Munira");
        checkoutPg.enterLastNameField("Shah");
        checkoutPg.enterAddressField("10 Grant Road");
        //checkoutPg.setEnterCityNameField("London");
        //checkoutPg.selectCountryFromDropDown("United Kingdom");
        checkoutPg.enterStateNameField("United Kingdom");
        //checkoutPg.enterZipcodeField("WD24 4DX");

        //1.18 Check the checkbox “Create an account for later use”
        checkoutPg.clickOnCheckBoxAndCreateYourAccountForLaterUse();
        Thread.sleep(3000);
        //1.19 Enter the password
        checkoutPg.enterPasswordField("Asdfg13");
        Thread.sleep(5000);
        //1.20 Select the Delivery Method to “Local Shipping”
        checkoutPg.clickOnLocalShippingRadioButton();
        Thread.sleep(5000);
        // 1.21 Select Payment Method “COD”
        checkoutPg.setPaymentMethodToCOD();
        // 1.22 Verify the total $311.03
        String actualTotalAmountAfterShippingCostText = checkoutPg.getTheTotalAmountAfterShippingCostText();
        Assert.assertEquals(actualTotalAmountAfterShippingCostText, "Place order: $311.03", "Error message");
        Thread.sleep(2000);
        // 1.23 Click on “Place Order” Button
        checkoutPg.clickOnPlaceOrderButton();
        //1.24 Verify the text “Thank you for your order”
        String expectedThankYouForYourOrderText = "Thank you for your order";
        String actualThankYouForYourOrderText = checkoutPg.getThankYouForYourOrderText();
        Assert.assertEquals(actualThankYouForYourOrderText, expectedThankYouForYourOrderText, "Error message");
    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {

        // 1.1 Mouse hover on the “Hot deals” link
        homePg.mouseHoverOnHotDealsLink();
        //  1.2 Mouse hover on the “Bestsellers”  link and click
        homePg.mouseHoverOnBestSellersLinkAndClick();
        //1.3 Verify the text “Bestsellers”
        String actualBestSellersText = bestsellersPg.getBestSellersText();
        Assert.assertEquals(actualBestSellersText, "Bestsellers", "Error message");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestsellersPg.mouseHoverOnSortBy();
        bestsellersPg.mouseHoverAndClickOnNameAToZ();
        //1.5 Click on “Add to cart” button of the product “iphone”
        bestsellersPg.mouseHoverOnAppleIphone();
        Thread.sleep(2000);
        bestsellersPg.mouseHoverAndClickOnAddToCartButton();
        // 1.6 Verify the message “Product has been added to your cart” display in  green bar
        String actualAddProductSuccessText = bestsellersPg.getAddToCartProductSuccessText();
        Assert.assertEquals(actualAddProductSuccessText, "Product has been added to your cart", "error");
        //1.7 Click on X sign to close the message
        bestsellersPg.clickOnCloseButton();
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        bestsellersPg.clickOnYourCartButton();
        Thread.sleep(2000);
        bestsellersPg.clickOnViewCartButton();
        //1.9 Verify the text “Your shopping cart - 1 item”
        String actualShoppingCartItemText = shoppingcartPg.getShoppingCartItemText();
        Assert.assertEquals(actualShoppingCartItemText, "Your shopping cart - 1 item", "Error message");
        //1.10 Click on “Empty your cart” link
        shoppingcartPg.clickOnEmptyYourCartLink();

        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        switchToAlert();
        String expectedAlertMessage = "Are you sure you want to clear your cart?";
        String actualAlertMessage = getTextFromAlert();
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "error");
        //1.12 Click “Ok” on alert
        acceptAlert();
        //1.13 Verify the message “Item(s) deleted from your cart”
        String actualItemsDeletedText = shoppingcartPg.getItemsDeletedFromYourCartText();
        Assert.assertEquals(actualItemsDeletedText, "Item(s) deleted from your cart", "error");
        //1.14 Verify the text “Your cart is empty”
        String actualYourCartEmptyText = shoppingcartPg.getYourCartIsEmptyText();
        Assert.assertEquals(actualYourCartEmptyText, "Your cart is empty");
    }

}