package org.example.StepDefinition;

import org.example.Pages.P06_Slider;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SD06_Slider {
    P06_Slider slider_Page = new P06_Slider();

    @When("^User Select Slider \"(.*)\"$")
    public void Select_Slider(int slider)
    {
        slider_Page.sliders_Icons().get(slider).click();
    }

    @And("^User Clicks on the product Link in the Slider \"(.*)\"$")
    public void Click_productLink(int slider)
    {
        slider_Page.sliders_Screens().get(slider).click();
    }

    @Then("^User should be directed to the product page \"(.*)\"$")
    public void Direct_product_Page(String Url)
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl() , Url , "User doesn't Navigate to product page");
    }
}
