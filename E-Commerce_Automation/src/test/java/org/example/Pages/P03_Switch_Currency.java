package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class P03_Switch_Currency {

    //************************************************* Locate Currency selector ***********************************************/
    public WebElement Currency_Select()
    {
        By curr = By.cssSelector("select[id=\"customerCurrency\"]");
        return Hooks.driver.findElement(curr);
    }

    public List<WebElement> Products_Prices()
    {
        By prices = By.cssSelector("span[class=\"price actual-price\"]");
        return Hooks.driver.findElements(prices);
    }

}
