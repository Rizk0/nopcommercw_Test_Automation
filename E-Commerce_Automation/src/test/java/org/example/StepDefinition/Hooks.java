package org.example.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null ;

    @Before
    public void Open_Browser_Navigate_Website()
    {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver" , chromePath);

        driver = new ChromeDriver() ;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8 , TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public void Close_Browser()
    {
        driver.quit();
    }
}
