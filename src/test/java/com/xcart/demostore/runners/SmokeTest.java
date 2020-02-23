package com.xcart.demostore.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/cucumber-report/smoketest", "json:target/cucumber.json"},
        features = "src/test/java/com/xcart/demostore/features",
        glue = "com.xcart.demostore.steps",
        tags = "@smoketest")

public class SmokeTest {
}
