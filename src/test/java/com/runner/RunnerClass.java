package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basecucumber.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prem\\eclipse-workspace\\Adactin_Cucumber\\src\\test\\java\\com\\feature\\adactin.feature",
glue="com.Stepdefinition")
public class RunnerClass {
public static WebDriver driver;
@BeforeClass
public static void setUp() {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\Adactin_Cucumber\\Driver\\chromedriver.exe");
//	 driver=new ChromeDriver();
	
	driver=BaseClass.browserLaunch("chrome");
}
}
