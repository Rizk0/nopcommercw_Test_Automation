package org.example.StepDefinition;

import org.example.Pages.P05_HoverCategory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class SD05_HoverCategory {

    P05_HoverCategory Hover_Page = new P05_HoverCategory();
    String SubCategoryText ;

    @When("User Hovers to Computer Category")
    public void Hover_to_Category() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(Hover_Page.Computer_Category()).perform();
        Thread.sleep(2000);
    }

    @And("User Selects Desktops sub-category")
    public void Select_SubCategory()
    {
        SubCategoryText = Hover_Page.Desktop_SubCategory().getText().toLowerCase().trim();

        Hover_Page.Desktop_SubCategory().click();

    }

    @Then("^User should be directed to sub-category page \"(.*)\"$")
    public void Direct_subCategory_Page(String Url)
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl() , Url);

        String PageTitle = Hover_Page.Desktop_PageTitle().getText().toLowerCase().trim();

        Assert.assertTrue(PageTitle.contains(SubCategoryText));
    }
}
