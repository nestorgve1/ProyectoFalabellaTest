/*Página de inicio de sesión*/
package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.config.BaseConfig;

public class SesionPage extends BaseConfig { //Inicio Sesión
	public SesionPage (WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "inputEmail")
	private WebElement inputEmail;
	
	@FindBy (id ="loginPassword")
	private WebElement loginPassword;
	
	@FindBy (id = "loginClick")
	private WebElement loginClick;
	
	//probar haciendolo en una sola clase OJO.
	public HomeUserLogInPage LoginUser() {
		inputEmail.sendKeys("nestorgve@gmail.com");
		loginPassword.sendKeys("15582510fabi");
		loginClick.click();
		return new HomeUserLogInPage(driver);
	}
}