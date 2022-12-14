package org.example.StepDefinition;

import org.example.Pages.P07_FollowUs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

public class SD07_FollowUs {

    P07_FollowUs follow_Page = new P07_FollowUs();

    @When("^User Scroll down to follow Us section and Click on \"(.*)\" Icon$")
    public void Click_Network_Icon(String network) throws InterruptedException {
        follow_Page.network_Icon(network).click();
        Thread.sleep(3000);
    }

    @Then("^User should be directed to Network Page \"(.*)\"$")
    public void Direct_Network_Page(String Url)
    {
        // Get the opened tabs currently
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        // Get index of current opened tab
        String currentTab = Hooks.driver.getWindowHandle();
        int index = Tabs.indexOf(currentTab);

        // Move driver to network tab to control it
        if(Tabs.size() > 1) {
            Hooks.driver.switchTo().window(Tabs.get(index + 1));
        }
        // Check the url of the page to ensure it is identical to the expected url
        Assert.assertEquals(Hooks.driver.getCurrentUrl() , Url , "User directed to the wrong page");

        // Close Network tab after checking
        Hooks.driver.close();

        // Move driver to website tab to control it
        Hooks.driver.switchTo().window(Tabs.get(index));
    }

}
