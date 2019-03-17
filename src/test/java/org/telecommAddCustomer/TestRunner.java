package org.telecommAddCustomer;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\Ramesh Aravind\\eclipse-TestNG\\CucumberRamesh\\src\\test\\resources\\Features\\PaymentGateway.feature", 
	                   glue = "org.telecommAddCustomer",plugin = "html:target")
	
	public class TestRunner {
	

}
