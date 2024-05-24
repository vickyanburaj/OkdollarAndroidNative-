package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"
        , "html:target/cucumber/report.html"
        , "summary"},snippets = SnippetType.CAMELCASE,
        dryRun = true,
        monochrome = true

,features = {"src/test/resources"}
,glue = {"com.qa.stepdef"})

public class testing{

}
