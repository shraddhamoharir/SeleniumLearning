package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonCheckBox {
	@Test
	public void radioButton() {
		//Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
				
		// Open test webpage
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		//Verification of expected url vs actual url
	String expectedUrl = "http://demo.guru99.com/test/radio.html";
	String actualUrl = driver.getCurrentUrl();
	Assert.assertEquals(actualUrl,expectedUrl, "Actual matches expected url");
	
		//Access radio buttons
		WebElement Option1=	driver.findElement(By.id("vfb-7-1"));
		WebElement Option2 = driver.findElement(By.id("vfb-7-2"));
		WebElement Option3 = driver.findElement(By.id("vfb-7-3"));
		
		Option1.click();
		System.out.println("Radio button 1 is clicked");
		Option2.click();
		System.out.println("Radio button 2 is clicked");
		
		Option3.click();
		System.out.println("Radio button 3 is clicked");
		
	   System.out.println("Radio button functions fine");
	   
	   WebElement Check1 = driver.findElement(By.id("vfb-6-0"));
	   WebElement Check2 = driver.findElement(By.id("vfb-6-1"));
	   WebElement Check3 = driver.findElement(By.id("vfb-6-2"));
	   
	   Check1.click();
	   Check2.click();
	   Check3.click();
	  System.out.println("Check Boxes are working fine");
	  
	  //Check whether checkboxes are toggled on or off
	  if(Check1.isSelected()) {
		  System.out.println("Check box 1 is toggled on");
	  }
		  else
			  System.out.println("Checkbox is toggled off");
	    
	   
		
		driver.quit();
		
	}

}
