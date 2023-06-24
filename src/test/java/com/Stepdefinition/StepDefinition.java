package com.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.runner.RunnerClass;

import basecucumber.BaseClass;
import basecucumber.Pompage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver=RunnerClass.driver;
	public static Pompage p;
	@Given("user can able to launch the browser")
	public void user_can_able_to_launch_the_browser() {
		
	   driver.get("https://adactinhotelapp.com/");
	}

	@When("user can able to write the username")
	public void user_can_able_to_write_the_username() {
		 p=new Pompage(driver);
		 Input(p.getUsername(), "prabhube");
//	   WebElement username = driver.findElement(By.id("username"));
//	   username.sendKeys("prabhube");
	}

	@When("user can able to write the password")
	public void user_can_able_to_write_the_password() {
		Input(p.getPassword(), "Kasthuriraja1!");
//	   WebElement pass = driver.findElement(By.id("password"));
//	   pass.sendKeys("Kasthuriraja1!");
	}

	@Then("user can able to login the page")
	public void user_can_able_to_login_the_page() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

}
