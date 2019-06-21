package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomersteps {
	static WebDriver driver;
	
	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikandan\\eclipse-workspace\\aa\\Cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() {
		driver.findElement(By.xpath("//h3//a[text()='Add Customer']")).click();
	    
	}

	@When("The user is filling all the details")
	public void the_user_is_filling_all_the_details() {
	    driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("mani");
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("kandan");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("manishya@gmail.com");
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("no 12A balamurugan garden thuraipakkam chennai");
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("8574695432");
	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	}

	@Then("The user should be displayed id")
	public void the_user_should_be_displayed_id() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	    
	}
	


}
