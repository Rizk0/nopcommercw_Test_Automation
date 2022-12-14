package org.example.StepDefinition;

import org.example.Pages.P01_Registration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SD01_Registration {

    P01_Registration Reg_Page = new P01_Registration();

    @Given("User navigate to Register Page")
    public void Navigate_Register_Page()  {
        Reg_Page.Register_Link().click();
    }

    @And("^User selects a gender Type \"(.*)\"$")
    public void Select_Gender(String gender)
    {
        Reg_Page.Gender_Type(gender).click();
    }

    @And("^User Enters Firstname \"(.*)\" and Lastname \"(.*)\"$")
    public void Enter_First_Last_name(String Firstname , String Lastname)
    {
        Reg_Page.Firstname().sendKeys(Firstname);
        Reg_Page.Lastname().sendKeys(Lastname);
    }

    @And("^User Select His date of birth Day \"(.*)\" Month \"(.*)\" Year \"(.*)\"$")
    public void Select_DateOfBirth(String Day , String Month , String Year)
    {
        Select select = new Select(Reg_Page.Birth_Day());
        select.selectByValue(Day);

        select = new Select(Reg_Page.Birth_Month());
        select.selectByValue(Month);

        select = new Select(Reg_Page.Birth_Year());
        select.selectByValue(Year);
    }

    @And("^User Enters Email Address \"(.*)\"$")
    public void Enter_Email_Address(String Email)
    {
        Reg_Page.Email().sendKeys(Email);

    }

    @And("^User fills Password fields \"(.*)\" \"(.*)\"$")
    public void Fill_Password_Fields(String Password , String PasswordConfirm)
    {
        // Fill Password Field
        Reg_Page.Password().sendKeys(Password);
        // Fill Password Confirm Field
        Reg_Page.ConfirmPassword().sendKeys(PasswordConfirm);
    }

    @When("User Clicks on Register Button")
    public void Click_Register_Button() throws InterruptedException
    {
        Reg_Page.Register_Button().click();
        Thread.sleep(3000);
    }

    @Then("^User directed to successful register page \"(.*)\"$")
    public void Direct_to_Register_Successful_Page(String Url)
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl() , Url);
        soft.assertAll();
    }

    @And("^A success Message is displayed \"(.*)\"$")
    public void Success_Message(String Message)
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Reg_Page.Success_Message().getText() , Message);
        System.out.println(Reg_Page.Success_Message().getCssValue("color"));
        soft.assertAll();
    }

    @And("^The color of Success Message should be \"(.*)\"$")
    public void Success_Message_Color(String color)
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Reg_Page.Success_Message().getCssValue("color") , color);
        soft.assertAll();
    }

}
