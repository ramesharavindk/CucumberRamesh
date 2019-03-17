package org.telecommAddCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddCustomer {

	static WebDriver driver;

	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Aravind\\eclipse-TestNG\\CucumberRamesh\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");
		driver.manage().window().maximize();

	}

	@When("The user fill all the customer details")
	public void the_user_fill_all_the_customer_details() {
		driver.findElement(By.id("fname")).sendKeys("Ramesh");
		driver.findElement(By.id("lname")).sendKeys("K");
		driver.findElement(By.id("email")).sendKeys("rameshtest@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Thoraipakkam");
		driver.findElement(By.id("telephoneno")).sendKeys("9876543210");

	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the success message")
	public void the_user_should_see_the_success_message() {
		Assert.assertEquals("Please Note Down Your CustomerID",
				driver.findElement(By.xpath("//table//tr[2]//b")).getText());
	}

	@Then("The user should see the customer ID")
	public void the_user_should_see_the_customer_ID() {
		Assert.assertTrue(driver.findElement(By.xpath("//table//tr[1]//b")).isDisplayed());
	}

	@Then("The user should see the pop message please fill all fields")
	public void the_user_should_see_the_pop_message_please_fill_all_fields() {
		// Assert.assertEquals("please fill all fields",
		// driver.switchTo().alert().getText());
		String popUp = driver.switchTo().alert().getText();
		System.out.println(popUp);
		Assert.assertEquals("please fill all fields", popUp);
	}

	@When("The user clicks Reset button")
	public void the_user_clicks_Reset_button() {
		driver.findElement(By.xpath("//input[@value=\"Reset\"]")).click();
	}

	@Then("I validate all fields is empty")
	public void i_validate_all_fields_is_empty() {

		// Checking fname empty using assert
		String al = driver.findElement(By.id("fname")).getText();
		System.out.println("First name is:"+ al);
		Assert.assertEquals("", al);

		// Checking lname empty using getattribut and if condition
		WebElement lname = driver.findElement(By.id("lname"));
		String text1 = lname.getAttribute("value");
		if (text1.isEmpty()) {
			System.out.println("The lname is empty");
		}
		
	    // Checking email addr telephone empty using getattribut and if condition in single line
		WebElement email = driver.findElement(By.id("email"));
		WebElement addr = driver.findElement(By.name("addr"));
		WebElement telephoneno = driver.findElement(By.id("telephoneno"));
		if ((email.getAttribute("value").isEmpty()) && (addr.getAttribute("value").isEmpty())
				&& (telephoneno.getAttribute("value").isEmpty())) {
			System.out.println("Email, Adddr, Telephone field is empty");

		}

	}

}
