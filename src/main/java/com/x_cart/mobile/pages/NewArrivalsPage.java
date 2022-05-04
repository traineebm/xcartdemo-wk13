package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewArrivalsPage extends Utility {

    By newArrivalsPageText = By.xpath("//h1[contains(text(),'New arrivals')]");

    public String getNewArrivalsPageText() {
        return getTextFromElement(newArrivalsPageText);
    }
}
