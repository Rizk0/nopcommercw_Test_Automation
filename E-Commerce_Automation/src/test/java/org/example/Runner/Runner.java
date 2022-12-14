package org.example.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "org/example",
        plugin = {
                "pretty",
                "html:target/Cucumber.html",
                "json:target/Cucumber.json",
                "junit:target/Cucumber.xml",
                "rerun:target/Cucumber.txt",
        },
        tags = "@Smoke"
)

public class Runner extends AbstractTestNGCucumberTests {
}
