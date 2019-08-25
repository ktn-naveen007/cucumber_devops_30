package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	int count=0;
	public WebDriver instance(){
		if(driver == null){
			System.setProperty("webdriver.chrome.driver", "E:\\Girish-Cucumber\\BDD_using_Selenium_Cucumber\\BDD_using_Selenium_Cucumber\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("count=="+ ++count);
		}
		return driver;
	}
}
