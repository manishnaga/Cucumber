package com.stepdefinition;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Testdetails {
	static WebDriver driver;
	@Given("telecom home page")
	public void telecom_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikandan\\eclipse-workspace\\aa\\Cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("user click the add customer details")
	public void user_click_the_add_customer_details() {
		driver.findElement(By.xpath("//h3//a[text()='Add Customer']")).click();
	}

	@When("user filling the all details")
	public void user_filling_the_all_details(DataTable customerDetails) {
		Map<String,String> customerDetailmap = customerDetails.asMap(String.class, String.class);
		System.out.println(customerDetailmap);
	    driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(customerDetailmap.get("firstName"));
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(customerDetailmap.get("lastName"));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(customerDetailmap.get("email"));
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(customerDetailmap.get("address"));
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(customerDetailmap.get("phone"));
	}

	@When("user clicking on submit button")
	public void user_clicking_on_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("user should be viewed customer id detail")
	public void user_should_be_viewed_customer_id_detail() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}


}
