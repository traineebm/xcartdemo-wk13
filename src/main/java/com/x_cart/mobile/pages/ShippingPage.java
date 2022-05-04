package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShippingPage extends Utility {

    By shippingPageText = By.xpath("//h1[@id='page-title']");

    public String getShippingPageText() {
        return getTextFromElement(shippingPageText);
    }

}
