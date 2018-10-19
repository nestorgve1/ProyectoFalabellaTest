package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Estructurado_prueba {
	@Test
	public void exampleTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../exampleSelenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.falabella.com/falabella-cl/checkout/delivery?_frr=delivery&_requestid=965907");
		WebElement clickdireccion = driver.findElement(By.xpath("(//*[@class='fbra_button fbra_test_button fbra_componentCheckoutAddressBook__useAddressButton fbra_test_componentCheckoutAddressBook__useAddressButton'])[1]"));
		clickdireccion.click();
	}	
}
