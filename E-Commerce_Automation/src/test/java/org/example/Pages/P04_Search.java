package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_Search {

    //****************************************************** Locate Search Box ***************************************************//
    public WebElement Search_Box()
    {
        By box = By.id("small-searchterms");
        return Hooks.driver.findElement(box);
    }

    //****************************************************** Locate Search Button *************************************************//
    public WebElement Search_Button()
    {
        By btn = By.cssSelector("button[type=\"submit\"]");
        return Hooks.driver.findElement(btn);
    }

    //******************************************************* Locate Search Results *************************************************//
    public List<WebElement> Search_Results()
    {
        By results = By.cssSelector("h2[class=\"product-title\"]");
        return Hooks.driver.findElements(results);
    }

    //***************************************************** Locate Search with SKU Element ***************************************//
    public WebElement Search_Result()
    {
        By results = By.cssSelector("h2[class=\"product-title\"]");
        return Hooks.driver.findElement(results);
    }

    //**************************************************** Locate Product SKU **************************************************//
    public WebElement Product_SKU()
    {
        By sku = By.cssSelector("div[class=\"sku\"]>span[class=\"value\"]");
        return Hooks.driver.findElement(sku);
    }
}
