package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class P01_Registration {

    //***************************************************** Locate Register Link element **********************************************************//
    public WebElement Register_Link()
    {
        By Reg_Link = By.cssSelector("a[class=\"ico-register\"]");

        return Hooks.driver.findElement(Reg_Link);
    }

    //************************************** Locate  Gender Field depending on the passed parameter ********************************************//
    public WebElement Gender_Type(String Type)
    {
        By typeRadioButton  = null ;

        if(Objects.equals(Type, "Male"))
        {
             typeRadioButton = By.id("gender-male");
        }
        else if(Objects.equals(Type, "Female"))
        {
             typeRadioButton = By.id("gender-female");
        }
        return Hooks.driver.findElement(typeRadioButton);
    }

    //*********************************************** Locate Firstname and Lastname Fields ********************************************************//
    public WebElement Firstname()
    {
        By firstNameField = By.id("FirstName");
        return Hooks.driver.findElement(firstNameField);
    }

    public WebElement Lastname()
    {
        By lastNameField = By.id("LastName");
        return Hooks.driver.findElement(lastNameField);
    }

    //***************************************** Locate Day , Month , and Year Dropdown Menus **********************************************//
    public WebElement Birth_Day()
    {
        By day = By.name("DateOfBirthDay");
        return Hooks.driver.findElement(day);
    }

    public WebElement Birth_Month()
    {
        By month = By.name("DateOfBirthMonth");
        return Hooks.driver.findElement(month);
    }

    public WebElement Birth_Year()
    {
        By year = By.name("DateOfBirthYear");
        return Hooks.driver.findElement(year);
    }

    //************************************************** Locate Email Field ******************************************************//
    public WebElement Email()
    {
        By email = By.id("Email");
        return Hooks.driver.findElement(email);
    }

    //************************************************* Locate Password Fields *****************************************************//
    public WebElement Password()
    {
        By pass = By.cssSelector("div[class=\"inputs\"] > input[id=\"Password\"]");
        return Hooks.driver.findElement(pass);
    }

    public WebElement ConfirmPassword()
    {
        By passConfirm = By.cssSelector("div[class=\"inputs\"] > input[id=\"ConfirmPassword\"]");
        return Hooks.driver.findElement(passConfirm);
    }

    //*********************************************** Locate Register Button ******************************************************//
    public WebElement Register_Button()
    {
        By Reg_Button = By.xpath("//div[@class=\"buttons\"]/button[@name=\"register-button\"]");
        return Hooks.driver.findElement(Reg_Button);
    }

    //******************************************** Locate Register Successful Message ********************************************//
    public WebElement Success_Message()
    {
        By message = By.cssSelector("div[class=\"result\"]");
        return Hooks.driver.findElement(message);
    }



}
