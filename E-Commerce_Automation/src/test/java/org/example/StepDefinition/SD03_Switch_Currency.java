package org.example.StepDefinition;

import org.example.Pages.P03_Switch_Currency;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SD03_Switch_Currency {

    P03_Switch_Currency Curr_Page = new P03_Switch_Currency();

    @Given("User Navigates to Home Page")
    public void Navigate_Home_Page()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("^User Selects \"(.*)\" Currency from Dropdown list$")
    public void Select_Euro_Currency(String currency) throws InterruptedException {
        Select select = new Select(Curr_Page.Currency_Select());
        select.selectByVisibleText(currency);
        Thread.sleep(2000);
    }

    @Then("^Prices of Displayed products should be in \"(.*)\" Currency$")
    public void Product_Price_Euro(String currency)
    {
        // Get number of Products in the page
        int count = Curr_Page.Products_Prices().size();

        // Iterate through each product to ensure that its price is displayed in Euro currency
        for(int i = 0 ; i < count ; i++)
        {
            String text = Curr_Page.Products_Prices().get(i).getText();
            Assert.assertTrue(text.contains(currency));
        }
    }
}
