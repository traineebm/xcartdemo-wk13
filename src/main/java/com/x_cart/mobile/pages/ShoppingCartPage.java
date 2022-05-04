package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartItemText = By.xpath("//h1[contains(text(),'Your shopping cart - 1 item')]");
    By subtotal=By.xpath("//ul[@class='sums']/li/span");
    By expectedTotal=By.xpath("//li[@class='total']/span/span[1]");
    By goToCheckOutButton=By.xpath("//span[contains(text(),'Go to checkout')]");

    By emptyYourCartLink = By.xpath("//a[contains(text(),'Empty your cart')]");
    By itemsDeletedFromYourCartText = By.id("status-messages");
    By yourCartIsEmptyText = By.xpath("//h1[contains(text(),'Your cart is empty')]");


    public String getShoppingCartItemText(){
        return getTextFromElement(shoppingCartItemText);
    }
    public String getSubTotalPrice(){
        return getTextFromElement(subtotal);
    }
    public String getExpectedTotal(){
        return getTextFromElement(expectedTotal);
    }
    public void clickOnGoToCheckOutButton(){
        clickOnElement(goToCheckOutButton);
    }

    public void clickOnEmptyYourCartLink(){
        clickOnElement(emptyYourCartLink);
    }
    public String getItemsDeletedFromYourCartText(){
        return getTextFromElement(itemsDeletedFromYourCartText);
    }
    public String getYourCartIsEmptyText(){
        return getTextFromElement(yourCartIsEmptyText);
    }

}
