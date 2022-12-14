package org.example.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/Features"},
        glue = {"org/example"},


        plugin = {
                "pretty",
                "html:target/cucumberReports/cucumber-pretty.html",
                "json:target/cucumberReports/cucumber-TestReport.json",
                "rerun:target/cucumberReports/rerun.txt",
                "junit:target/cucumberReports/cukes.xml",
        },
        tags = "@Smoke")
public class testRunner extends AbstractTestNGCucumberTests {
}
