package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends Utility {

    By loginToYourAccountText = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailTextBox = By.id("email");
    By continueButton = By.xpath("(//button[contains(@class,'regular-button anonymous-continue-button submit')])[1]");
    By secureCheckoutText = By.xpath("//h1[@class='title']");

    By enterFirstname = By.xpath("//input[@id='shippingaddress-firstname']");
    By enterLastname = By.xpath("//input[@id='shippingaddress-lastname']");
    By enterAddress = By.xpath("//input[@id='shippingaddress-street']");
    By enterCityName = By.id("shippingaddress-city");
    By enterCountryName = By.id("shippingaddress-country-code");
    By enterStateName = By.xpath("//input[@id='shippingaddress-custom-state']");
    By profileCheckbox = By.xpath("//input[@id='create_profile']");
    By enterPassword = By.xpath("//input[@id='password']");
    By enterZipCode = By.id("shippingaddress-zipcode");
   // By localShippingRadioButton = By.xpath("//span[normalize-space()='Local shipping']");
    By localShippingRadioButton = By.id("method128");
    By codRadioButton = By.xpath("//span[contains(text(),'COD')]");
    By totalAmountAfterShippingCostText = By.xpath("(//span[normalize-space()='Place order: $311.03'])[1]");
    By placeOrderButton = By.xpath("//button[contains(@class,'btn regular-button regular-main-button place-order submit')]");
    By thankYouForYourOrderText = By.id("page-title");

    public String getLoginToYourAccountText(){
        return getTextFromElement(loginToYourAccountText);
    }
    public void enterEmailAddressField(String email){
        sendTextToElement(emailTextBox,email);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public String getSecureCheckoutText(){
        return getTextFromElement(secureCheckoutText);
    }
    public void enterFirstNameField(String firstname){
        sendTextToElement(enterFirstname,firstname);
    }
    public void enterLastNameField(String lastname){
        sendTextToElement(enterLastname,lastname);
    }
    public void enterAddressField(String address){
        sendTextToElement(enterAddress,address);
    }
    public void setEnterCityNameField(String cityname){
        sendTextToElement(enterCityName,cityname);
    }
    public void selectCountryFromDropDown(String countryname){
        selectByValueFromDropDown(enterCountryName,countryname);
    }
    public void enterStateNameField(String statename){
        sendTextToElement(enterStateName,statename);
    }
    public void clickOnCheckBoxAndCreateYourAccountForLaterUse(){
        clickOnElement(profileCheckbox);
    }
    public void enterPasswordField(String password){
        sendTextToElement(enterPassword,password);
    }
    public void enterZipcodeField(String zipcode){
        sendTextToElement(enterZipCode,zipcode);
    }
    public void clickOnLocalShippingRadioButton(){
        clickOnElement(localShippingRadioButton);
    }
    public void setPaymentMethodToCOD(){
        clickOnElement(codRadioButton);
    }
    public String getTheTotalAmountAfterShippingCostText(){
        return getTextFromElement(totalAmountAfterShippingCostText);
    }
    public void clickOnPlaceOrderButton(){
        clickOnElement(placeOrderButton);
    }
    public String getThankYouForYourOrderText(){
        return getTextFromElement(thankYouForYourOrderText);
    }

}
