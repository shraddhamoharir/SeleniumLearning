package com.guru99.demo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PracticeFirefox {
@Test
	public void PG1() {

		// Creating a driver
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		//Launching a Webpage
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
		
		//Fetch title
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		
		//Compare Title using conditions
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test is passed");
			}
		
			else {
				System.out.println("Test failed");
			}
	driver.quit();
		
				
	    }
}
