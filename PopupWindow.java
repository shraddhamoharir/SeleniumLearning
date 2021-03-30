package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class PopupWindow {
	public void CorrectLogin()
	{
		// Create Driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Open Test page

		String url = "http://demo.guru99.com/Agile_Project/Agi_V1/#";
		driver.get(url);
		System.out.println("Test page is open");

		// Maximize chrome window
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='uid']")));
		//WebElement UserId = driver.findElement(By.name("uid"));
		System.out.println("12345");
		//System.out.println(UserId);
      WebElement UserId = driver.findElement(By.xpath("//input[@name='uid']"));
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		//WebElement Password = driver.findElement(By.name("passowrd"));
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		//UserId.click();
		UserId.sendKeys("1303");
		Password.sendKeys("Guru99");
		WebElement SubmitBtn = driver.findElement(By.name("btnLogin"));
		SubmitBtn.click();
		System.out.println("Login Successfull");
		String expectedUrl = "http://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Expected URl is same as desired");		
		
		driver.quit();
	}

}
