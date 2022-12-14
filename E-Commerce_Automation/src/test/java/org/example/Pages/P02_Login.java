package org.example.Pages;
import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {

    //*************************************************** Locate Login Link *************************************************//
    public WebElement Login_Link()
    {
        By log_link = By.cssSelector("a[class=\"ico-login\"]");
        return Hooks.driver.findElement(log_link);
    }

    //*************************************************** Locate Email Address Field *******************************************//
    public WebElement Email_Field()
    {
        By email = By.id("Email");
        return Hooks.driver.findElement(email);
    }

    //*************************************************** Locate Password Field *********************************************//
    public WebElement Password_Field()
    {
        By pass = By.id("Password");
        return Hooks.driver.findElement(pass);
    }

    //**************************************************** Locate Login Button ****************************************************//
    public WebElement Login_Button()
    {
        By button = By.cssSelector("button[class=\"button-1 login-button\"]");
        return Hooks.driver.findElement(button);
    }

    //************************************************  Locate "MY Account" tab *****************************************************//
    public WebElement myAccount_Tab()
    {
        By tab = By.cssSelector("a[class=\"ico-account\"]");
        return Hooks.driver.findElement(tab);
    }
}
