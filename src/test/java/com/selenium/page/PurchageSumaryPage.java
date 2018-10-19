package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.config.BaseConfig;

public class PurchageSumaryPage extends BaseConfig{
	public PurchageSumaryPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*declaramos los elementos a utilizar*/
	@FindBy (xpath = "(//*[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase'])")
	private WebElement goToPurchage;
	
	/*declaramos el metodo*/
	public HomeDeliveryPage clickToGoPurchage() {
		goToPurchage.click();
		return new HomeDeliveryPage(driver);
	}
}
