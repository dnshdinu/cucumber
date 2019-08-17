package com.stepdefinition;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/sample2.feature",glue="com.stepdefinition",plugin= {"html:target","json:target/report.json","rerun:src/test/resources/failed.txt"},
                   dryRun=false,monochrome=true,strict=true)

public class TestRunner {	

}