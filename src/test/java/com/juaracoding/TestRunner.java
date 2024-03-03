package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/features/Recruitment.feature",
                     glue = "com.juaracoding",
                    plugin = {"pretty","html:target/cucumber-report.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
