package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomertraiffplan {
	static WebDriver driver;
	@Given("The user is in telecom homepage")
	public void the_user_is_in_telecom_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan\\eclipse-workspace\\aa\\Cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("The user click add traiff plan link")
	public void the_user_click_add_traiff_plan_link() {
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		
	}

	@When("The user fill the add traiff plan details")
	public void the_user_fill_the_add_traiff_plan_details() {
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys("150");
		driver.findElement(By.xpath("//input[@id='local_minutes']")).sendKeys("600");
		driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys("400");
		driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys("200");
		driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys("800");
		driver.findElement(By.xpath("//input[@id='inter_charges']")).sendKeys("1200");
		driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys("25");
	}

	@When("The user click on submit option")
	public void the_user_click_on_submit_option() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("The user should be displayed traiff id")
	public void the_user_should_be_displayed_traiff_id() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	    
	}

}
