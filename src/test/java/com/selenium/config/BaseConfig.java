package com.selenium.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseConfig {
	public WebDriver driver;
	@BeforeMethod()
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "../FalabellaTest/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.falabella.com/falabella-cl/");
		//
		System.out.println("Successfully opened the website https://www.falabella.com/falabella-cl/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod()
	public void teardownTest() throws InterruptedException {
		// Close browser and end the session
		Thread.sleep(10000);
		driver.quit();
	}
}
