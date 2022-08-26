package com.Automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\pranjal.kumar\\eclipse-workspace\\Travel_SigmaCucumber\\src\\test\\resources\\Feature\\verifySigmaLogin.feature" }, 
glue = "com.Automation.StepDef", plugin = {
		"html:reports/reports.html", "json:target/cucumber.json", "rerun:target/rerun.txt"}, tags="@smoke")

public class Testrunner {

}