package org.example.StepDefinition;

import org.example.Pages.P02_Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class SD02_Login {

    P02_Login Log_Page = new P02_Login();

    @Given("User navigate to Login Page")
    public void Navigate_Login_Page()
    {
       Log_Page.Login_Link().click();
    }

    @And("^User Enters a valid Email address \"(.*)\"$")
    public void Enter_Valid_Email(String Email)
    {
        Log_Page.Email_Field().sendKeys(Email);
    }

    @And("^User Enters a valid Password \"(.*)\"$")
    public void Enter_Valid_Password(String Password)
    {
        Log_Page.Password_Field().sendKeys(Password);
    }

    @When("User Clicks on Login Button")
    public void Click_Login_Button()
    {
        Log_Page.Login_Button().click();
    }

    //******************************************** Expected Result ***************************************************//

    @Then("^User should be directed to Home Page \"(.*)\"$")
    public void Login_To_Account_Success(String Url)
    {
        SoftAssert soft = new SoftAssert();

        soft.assertEquals(Url , Hooks.driver.getCurrentUrl());
        soft.assertTrue(Log_Page.myAccount_Tab().isDisplayed());

        soft.assertAll();
    }
}
