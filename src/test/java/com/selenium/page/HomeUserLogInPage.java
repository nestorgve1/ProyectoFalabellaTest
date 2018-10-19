/*Página de Inicio con el usuario logueado*/
package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.config.BaseConfig;

public class HomeUserLogInPage extends BaseConfig {
	public HomeUserLogInPage (WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	/*creamos nuestro elemento */
	@FindBy (id = "searchQuestionSolr")
	private WebElement searchQuestionSolr;
	
	/*creamos nuestro metodo*/
	public DescSkuPage searchSku() {
		searchQuestionSolr.sendKeys("6054222");
		searchQuestionSolr.submit();
		return new DescSkuPage(driver);
	}
	
}
