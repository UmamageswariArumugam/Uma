package Cucu_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Arumugam\\eclipse-workspace\\mavencucumber\\cucumberfeaturefile",glue=("Cucu_Steps"))

public class Runner {

}
