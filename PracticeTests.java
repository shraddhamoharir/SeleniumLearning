package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTests {
	@Test
      public void loginTest() {
		
		//Create Driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Test page
		
		String url = "http://demo.guru99.com/test/login.html";
		driver.get(url);
		System.out.println("Test page is open");
		
		//Maximize chrome window
		driver.manage().window().maximize();
		
		//Enter login and password
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("Abcde");
		
		System.out.println("Login & Password entered Now Click");
		//Submit page
		WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();   
        		
				
		//Verification Steps - New url
	    String expectedUrl = "http://demo.guru99.com/test/success.html";
	    String actualUrl = driver.getCurrentUrl();
	    Assert.assertEquals(actualUrl, expectedUrl, "Actual is not same as expected url, test failed");
	 
	  //Success Message
	  		WebElement successMessage = driver.findElement(By.cssSelector(".error-copy"));
		
		String expectedMessage = "Successfully Logged in...";
		String actualMessage = successMessage.getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Actual is not same as expected message, test failed");
		
		driver.quit();
		
						
		
	}
	
	
	

}
