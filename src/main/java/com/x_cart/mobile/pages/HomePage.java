package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By shippingLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Shipping')]");
    By newLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'New!')]");
    By comingSoonLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Coming soon')]");
    By contactUsLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Contact us')]");
    By hotDealsLink=By.cssSelector("ul[class='nav navbar-nav top-main-menu'] span[class='primary-title']");
    By bestSellersLink=By.linkText("Bestsellers");
    By saleLink=By.linkText("Sale");


    public void clickOnShippingLink() {
        clickOnElement(shippingLink);
    }

    public void clickOnNewLink() {
        clickOnElement(newLink);
    }

    public void clickOnComingSoonLink() {
        clickOnElement(comingSoonLink);
    }

    public void clickOnContactUsLink() {
        clickOnElement(contactUsLink);
    }
    public void mouseHoverOnHotDealsLink() {
        mouseHoverToElement(hotDealsLink);
    }
    public void mouseHoverOnSaleLinkAndClick() {
        mouseHoverToElementAndClick(saleLink);
    }

   public void mouseHoverOnBestSellersLinkAndClick() {
      mouseHoverToElementAndClick(bestSellersLink);
    }
}
