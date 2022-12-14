package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_FollowUs {

    //***************************************************** Locate Clicked Network Icon ********************************/
    public WebElement network_Icon(String network)
    {
        By icon = By.cssSelector("li[class="+network+"]");
        return Hooks.driver.findElement(icon);
    }
}
