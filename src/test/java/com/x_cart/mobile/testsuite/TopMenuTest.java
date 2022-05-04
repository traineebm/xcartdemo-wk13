package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePg = new HomePage();
    ShippingPage shippingPg = new ShippingPage();
    NewArrivalsPage newPg = new NewArrivalsPage();
    ComingSoonPage comingSoonPg = new ComingSoonPage();
    ContactUsPage contactUsPg = new ContactUsPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        //1.1 Click on the “Shipping” link
        homePg.clickOnShippingLink();
        //1.2 Verify the text “Shipping”
        String actualShippingPageText = shippingPg.getShippingPageText();
        Assert.assertEquals(actualShippingPageText, "Shipping", "Error message");
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        //2.1 Click on the “New!” link
        homePg.clickOnNewLink();
        //2.2 Verify the text “New arrivals”
        String actualNewPageText = newPg.getNewArrivalsPageText();
        Assert.assertEquals(actualNewPageText, "New arrivals", "Error message");
    }

    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully(){
        //3.1 Click on the “Coming soon” link
        homePg.clickOnComingSoonLink();
        //3.2 Verify the text “Coming soon”
        String actualComingSoonPageText = comingSoonPg.getComingSoonPageText();
        Assert.assertEquals(actualComingSoonPageText, "Coming soon", "Error message");
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        //4.1 Click on the “Contact us” link
        homePg.clickOnContactUsLink();
        //4.2 Verify the text “Contact us”
        String actualContactUsPageText = contactUsPg.getContactUsPageText();
        Assert.assertEquals(actualContactUsPageText, "Contact us", "Error message");
    }
}
