package com.example.jacocobddunittest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src/test/resources/cucumber" }, plugin = { "pretty", "html: cucumber-html-reports",
				"json: cucumber-html-reports/cucumber.json" })
public class CucumberTest {

}
