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

public class PaymentGateway {

	static WebDriver driver;

	@Given("The user is in payment gateway page")
	public void the_user_is_in_payment_gateway_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Aravind\\eclipse-TestNG\\CucumberRamesh\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/payment-gateway/index.php");
		driver.manage().window().maximize();
	}

	@When("The user select quantity {string}")
	public void the_user_select_quantity(String quantity) {
		WebElement quan = driver.findElement(By.name("quantity"));
		Select s = new Select(quan);
		s.selectByVisibleText(quantity);
	}

	@When("The user click buynow button")
	public void the_user_click_buynow_button() {
		driver.findElement(By.xpath("//input[@value=\"Buy Now\"]")).click();
	}

	@When("The user fill the card details {string},{string},{string},{string}")
	public void the_user_fill_the_card_details(String card_nmuber, String month, String year, String cvv_code) {
		driver.findElement(By.id("card_nmuber")).sendKeys(card_nmuber);
		WebElement mon = driver.findElement(By.id("month"));
		Select s1 = new Select(mon);
		s1.selectByVisibleText(month);
		WebElement yea = driver.findElement(By.id("year"));
		Select s2 = new Select(yea);
		s2.selectByVisibleText(year);
		driver.findElement(By.id("cvv_code")).sendKeys(cvv_code);

	}

	@When("The user click pay button")
	public void the_user_click_pay_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the success message and order id")
	public void the_user_should_see_the_success_message_and_order_id() {
		Assert.assertEquals("Please Note Down Your OrderID", driver.findElement(By.xpath("//table//tr[2]//strong")).getText());
	}

}
