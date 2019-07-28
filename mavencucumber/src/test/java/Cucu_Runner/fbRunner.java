package Cucu_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Arumugam\\eclipse-workspace\\mavencucumber\\cucumberfeaturefile\\fb.feature"},glue= {"fb"})

public class fbRunner {
	
}
