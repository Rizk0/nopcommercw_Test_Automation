package org.example.StepDefinition;

import org.example.Pages.P04_Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SD03_Search {

    P04_Search search_Page = new P04_Search();

    //***************************************************** Scenario Outline 1. **********************************************//

    @Given("User clicks on Search box")
    public void Click_Search_Box()
    {
        search_Page.Search_Box().click();
    }

    @And("^User enter a product name as \"(.*)\" to search for$")
    public void Enter_Product_name(String subName)
    {
        search_Page.Search_Box().sendKeys(subName);
    }

    @When("User Clicks on Search Button")
    public void Click_Search_Button() throws InterruptedException {
        search_Page.Search_Button().click();
        Thread.sleep(3000);
    }

    //**************************************************** Expected Result *******************************************//

    @Then("^User directed to Search Page \"(.*)\"$")
    public void Direct_Search_Page(String Url)
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(Url));
        soft.assertAll();
    }

    @And("^User could find relative products to the product name \"(.*)\"$")
    public void Search_Results(String subName)
    {
        // Get number of found Products
        int count = search_Page.Search_Results().size();
        /*
         Loop through each product to ensure that it is relevant to the subName entered in Search box
         */
        for(int i = 0 ; i < count ; i++)
        {
            String productName = search_Page.Search_Results().get(i).getText().toLowerCase();
            Assert.assertTrue(productName.contains(subName.toLowerCase()));
        }
    }

    ///************************************************ Scenario Outline 3. ********************************************************//
    @And("^User could find the corresponding product to the entered SKU \"(.*)\"$")
    public void SKU_Result(String SKU)
    {
        search_Page.Search_Result().click();
        Assert.assertTrue(search_Page.Product_SKU().getText().contains(SKU));
    }
}
