package com.company.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
        glue = "com/company/step_definitions"
        //tags = "@DeletePlace"
        ,dryRun = true,
        monochrome =true,
        plugin = {
                "json:target/jsonReports/cucumber.json",
                "rerun:target/rerun.txt"})
public class CukesRunner {
}