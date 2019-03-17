package org.telecommAddCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegisterInsurance {
	
	static WebDriver driver;
	
	@Given("The user is in insurance register page")
	public void the_user_is_in_insurance_register_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Aravind\\eclipse-TestNG\\CucumberRamesh\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
	}

	@When("The user fill all insurance details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_all_insurance_details(String user_title, String user_firstname, String user_surname, String user_phone, String user_dateofbirth_1i, String user_dateofbirth_2i, String user_dateofbirth_3i, String user_licenceperiod, String user_occupation_id, String user_address_attributes_street, String user_address_attributes_city, String user_address_attributes_county, String user_address_attributes_postcode, String user_user_detail_attributes_email, String user_user_detail_attributes_password, String user_user_detail_attributes_password_confirmation) {
	    
		WebElement title = driver.findElement(By.id("user_title"));
		Select s= new Select(title);
		s.selectByVisibleText(user_title);
	    driver.findElement(By.id("user_firstname")).sendKeys(user_firstname);
	    driver.findElement(By.id("user_surname")).sendKeys(user_surname);
	    driver.findElement(By.id("user_phone")).sendKeys(user_phone);
	    WebElement year = driver.findElement(By.id("user_dateofbirth_1i"));
	    Select s2= new Select(year);
		s2.selectByVisibleText(user_dateofbirth_1i);
	    WebElement month = driver.findElement(By.id("user_dateofbirth_2i"));
	    Select s3= new Select(month);
		s3.selectByVisibleText(user_dateofbirth_2i);
	    WebElement date = driver.findElement(By.id("user_dateofbirth_3i"));
	    Select s4= new Select(date);
		s4.selectByVisibleText(user_dateofbirth_3i);
	    WebElement period = driver.findElement(By.id("user_licenceperiod"));
	    Select s5= new Select(period);
		s5.selectByVisibleText(user_licenceperiod);
	    WebElement occupation = driver.findElement(By.id("user_occupation_id"));
	    Select s6= new Select(occupation);
		s6.selectByVisibleText(user_occupation_id);
	    driver.findElement(By.id("user_address_attributes_street")).sendKeys(user_address_attributes_street);
	    driver.findElement(By.id("user_address_attributes_city")).sendKeys(user_address_attributes_city);
	    driver.findElement(By.id("user_address_attributes_county")).sendKeys(user_address_attributes_county);
	    driver.findElement(By.id("user_address_attributes_postcode")).sendKeys(user_address_attributes_postcode);
	    driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys(user_user_detail_attributes_email);
	    driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys(user_user_detail_attributes_password);
	    driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys(user_user_detail_attributes_password_confirmation);
	}

	@When("The user clicks the create button")
	public void the_user_clicks_the_create_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the message insurance created")
	public void the_user_should_see_the_message_insurance_created() {
		Assert.assertEquals("Insurance Broker System - Login", driver.getTitle());
	}

}
