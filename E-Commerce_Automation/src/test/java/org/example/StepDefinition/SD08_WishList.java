package org.example.StepDefinition;

import org.example.Pages.P08_WishList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SD08_WishList {

    P08_WishList wishListPage = new P08_WishList();

    @When("^User Clicks on WishList button of product number \"(.*)\"$")
    public void Click_WishList_Button(int product) throws InterruptedException {
        wishListPage.WishList_Button().get(product).click();
        Thread.sleep(3000);
    }

    @Then("A success Message is displayed to inform user that Product has been added to WishList")
    public void Success_Message_Displayed()
    {
        SoftAssert soft = new SoftAssert() ;
        // Check if the success message is displayed
        soft.assertTrue(wishListPage.Success_Message().isDisplayed());
        soft.assertAll();
    }

    @And("^The color of WishList Success Message should be \"(.*)\"$")
    public void WishList_Success_Message_Color(String color)
    {
        SoftAssert soft = new SoftAssert() ;
        // Convert Color value from rgba to Hex
        String rgba = wishListPage.Success_Message().getCssValue("background-color") ;
        String hex = Color.fromString(rgba).asHex();
        // Check the actual color against the expected
        soft.assertEquals(hex , color , "Color is not the same");
        soft.assertAll();
    }

    //***************************************************** Scenario 2 ***************************************************//

    @And("User Navigates to wish list page")
    public void Navigate_WishList_Page()
    {
        // Wait until Success Message Disappear
        WebDriverWait wait = new WebDriverWait(Hooks.driver , Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(wishListPage.Success_Message()));
        // navigate to wish list page
        wishListPage.WishList_Link().click();
    }

    @Then("Quantity of the product should be increased in wish list page")
    public void Quantity_check()
    {
        String Quantity = wishListPage.Quantity().getAttribute("value");

        // Check if Quantity is higher than 0
        Assert.assertTrue(Integer.parseInt(Quantity) > 0 );
    }
}
