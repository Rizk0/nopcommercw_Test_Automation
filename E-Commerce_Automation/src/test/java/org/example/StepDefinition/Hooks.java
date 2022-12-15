
package org.example.StepDefinition;

        import io.cucumber.java.After;
        import io.cucumber.java.Before;
        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.util.concurrent.TimeUnit;

public class Hooks {

    // Declration Webdriver
    public static WebDriver driver = null;


    @Before
    public static void openbrowser() {

        // 1- Define Bridge WebDriver Manager
        WebDriverManager.chromedriver().setup();

        // 2- create object from chrome browser
        driver = new ChromeDriver();

        //3- Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 4- navigate to url
        driver.get("https://demo.nopcommerce.com/");


    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }
}
