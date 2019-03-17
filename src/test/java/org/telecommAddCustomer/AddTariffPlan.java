package org.telecommAddCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddTariffPlan {

	static WebDriver driver;

	@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Aravind\\eclipse-TestNG\\CucumberRamesh\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
		driver.manage().window().maximize();
	}

	@When("The user fill all tariff plan details {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_all_tariff_plan_details(String rental1, String local_minutes, String inter_minutes,
			String sms_pack, String minutes_charges, String inter_charges, String sms_charges) {
		driver.findElement(By.id("rental1")).sendKeys(rental1);
		driver.findElement(By.id("local_minutes")).sendKeys(local_minutes);
		driver.findElement(By.id("inter_minutes")).sendKeys(inter_minutes);
		driver.findElement(By.id("sms_pack")).sendKeys(sms_pack);
		driver.findElement(By.id("minutes_charges")).sendKeys(minutes_charges);
		driver.findElement(By.id("inter_charges")).sendKeys(inter_charges);
		driver.findElement(By.id("sms_charges")).sendKeys(sms_charges);
		
	}
	
	@When("The user clicks the submit button tariff")
	public void the_user_clicks_the_submit_button_tariff() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the message you add tariff plan")
	public void the_user_should_see_the_message_you_add_tariff_plan() {
		Assert.assertEquals("Congratulation you add Tariff Plan", driver.findElement(By.tagName("h2")).getText());	
	}

}
