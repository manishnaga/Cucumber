package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CumcumberDd {
	static WebDriver driver;
	@Given("user is in home page")
	public void user_is_in_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikandan\\eclipse-workspace\\aa\\Cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("user click the add traiff plan link")
	public void user_click_the_add_traiff_plan_link() {
		 driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("user filling the traiff plan details {string},{string},{string},{string},{string},{string},{string}")
	public void user_filling_the_traiff_plan_details(String monthlyrent, String freeloc, String freeinternation, String freesms, String localperminutes, String internationalmins, String smscharge) {
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(monthlyrent);
		driver.findElement(By.xpath("//input[@id='local_minutes']")).sendKeys(freeloc);
		driver.findElement(By.xpath("//input[@id='inter_minutes']")).sendKeys(freeinternation);
		driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(freesms);
		driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(localperminutes);
		driver.findElement(By.xpath("//input[@id='inter_charges']")).sendKeys(internationalmins);
		driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(smscharge);
	}


	@When("user clicking the submit button")
	public void user_clicking_the_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("user will displayed traiff plan details")
	public void user_will_displayed_traiff_plan_details() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}



}
