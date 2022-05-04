package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {

    By saleText = By.xpath("//h1[@id='page-title']");
    By sortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By productsNameAToZ = By.xpath("//a[contains(text(),'Name A - Z')]");
    By productsNameAToZText = By.xpath("//span[contains(text(),'Name A - Z')]");
    By priceLowToHigh = By.xpath("//a[contains(text(),'Price Low - High')]");
    By priceLowToHighText = By.xpath("//span[contains(text(),'Price Low - High')]");
    By rates = By.xpath("//a[contains(text(),'Rates')]");
    By ratesText = By.xpath("//span[contains(text(),'Rates')]");


    public String getSaleText(){
        return getTextFromElement(saleText);
    }

    public void mouseHoverOnSortBy(){
        mouseHoverToElement(sortBy);
    }

    public void mouseHoverAndClickOnOnNameAToZ(){
        mouseHoverToElementAndClick(productsNameAToZ);
    }

    public String getProductArrangedAlphabetically(){
            return getTextFromElement(productsNameAToZText);
    }
    public void mouseHoverAndClickOnPriceLowToHigh(){
        mouseHoverToElementAndClick(priceLowToHigh);
    }
    public String getPriceLowToHighText(){
        return getTextFromElement(priceLowToHighText);
    }
    public void mouseHoverAndClickOnRates(){
        mouseHoverToElementAndClick(rates);
    }
    public String getRatesText(){
        return getTextFromElement(ratesText);
    }
}
