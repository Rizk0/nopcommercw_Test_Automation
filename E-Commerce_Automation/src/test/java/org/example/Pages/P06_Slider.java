package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P06_Slider {

    //****************************************** Locate Sliders Icons ******************************************************//
    public List<WebElement> sliders_Icons()
    {
        By sliders = By.cssSelector("div[class=\"nivo-controlNav\"] > a");
        return Hooks.driver.findElements(sliders);
    }

    //****************************************** Locate Sliders Screens ******************************************************//
    public List<WebElement> sliders_Screens()
    {
        By screens = By.cssSelector("div[id=\"nivo-slider\"] > a");
        return Hooks.driver.findElements(screens);
    }
}
