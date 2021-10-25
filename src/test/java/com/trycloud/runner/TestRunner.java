package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com/trycloud/step_definitions",
        plugin = {"html:target/cucumber.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target"
        },
        dryRun = false
         , tags = "@us_10"
)
public class TestRunner {
}