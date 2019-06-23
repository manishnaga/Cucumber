package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddDetails {
	static WebDriver driver;
	@Given("The user is telecom home page")
	public void the_user_is_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikandan\\eclipse-workspace\\aa\\Cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("The user click the add customer details")
	public void the_user_click_the_add_customer_details() {
		driver.findElement(By.xpath("//h3//a[text()='Add Customer']")).click();
	}

	@When("The user filling the all details")
	public void the_user_filling_the_all_details(DataTable customerDetails) {
	    List<String> customerDetailList = customerDetails.asList(String.class);
	    System.out.println(customerDetailList);
	    driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(customerDetailList.get(0));
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(customerDetailList.get(1));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(customerDetailList.get(2));
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(customerDetailList.get(3));
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(customerDetailList.get(4));
	    
	}
	
	@When("The user clicking on submit button")
	public void the_user_clicking_on_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	@Then("The user should be viewed customer id detail")
	public void the_user_should_be_viewed_customer_id_detail() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}
}
