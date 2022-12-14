package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_HoverCategory {

    //*********************************************** Locate Computer Category ********************************************//
    public WebElement Computer_Category()
    {
        By cat = By.cssSelector("a[href=\"/computers\"]");
        return Hooks.driver.findElement(cat);
    }

    //*********************************************** Locate Desktop Sub-Category ********************************************//
    public WebElement Desktop_SubCategory()
    {
        By subCat = By.cssSelector("a[href=\"/desktops\"]");
        return Hooks.driver.findElement(subCat);
    }

    //*********************************************** Locate Desktop Sub-Category Page Title ***************************************//
    public WebElement Desktop_PageTitle()
    {
        By title = By.cssSelector("div[class=\"page-title\"]> h1");
        return Hooks.driver.findElement(title);
    }


}

