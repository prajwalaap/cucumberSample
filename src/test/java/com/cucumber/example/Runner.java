package com.cucumber.example;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:/cucumberSample/src/test/resources/test/FizzBuzz.feature",glue = "/cucumberSample/src/test/java/com/cucumber/example",
plugin = {"html:target/html-test-report","json:target/json-test-report.json","junit:target/junit-xml-report.xml" })
public class Runner extends AbstractTestNGCucumberTests{
}
