package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P08_WishList {

    //***************************************************** Locate WishList Buttons ***********************************//
    public List<WebElement> WishList_Button()
    {
        By buttons = By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]");
        return Hooks.driver.findElements(buttons);
    }

    //***************************************************** Locate Success Message ***********************************//
    public WebElement Success_Message()
    {
        By message = By.cssSelector("div[class=\"bar-notification success\"]");
        return Hooks.driver.findElement(message);
    }

    //*********************************************** Locate wish List Link *********************************************//
    public WebElement WishList_Link()
    {
        By link = By.cssSelector("a[class=\"ico-wishlist\"]");
        return Hooks.driver.findElement(link);
    }

    //********************************************** Locate Quantity field **************************************************//
    public WebElement Quantity()
    {
        By field = By.cssSelector("input[class=\"qty-input\"]");
        return Hooks.driver.findElement(field);
    }
}

