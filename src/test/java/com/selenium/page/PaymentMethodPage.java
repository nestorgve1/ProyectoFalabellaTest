package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.config.BaseConfig;

public class PaymentMethodPage extends BaseConfig{
	public PaymentMethodPage (WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*Declaramos nuestros elementos*/
	@FindBy (xpath = "(//div[@class='fbra_tab fbra_paymentOptionsTab fbra_paymentOptionsTab__2 fbra_tab--enabled fbra_tab--inactive'])")
	private WebElement clickPaymentMethod;
	@FindBy (xpath = "(//*[@class='fbra_button fbra_test_button fbra_cardBookItem__useCardButton fbra_test_cardBookItem__useCardButton'])[1]")
	private WebElement addCreditCard;
	@FindBy (xpath = "(//*[@class='fbra_button fbra_test_button fbra_continueButton__button fbra_test_continueButton__button'])")
	private WebElement enterOrder;
	
	/*creamos nuestro metodo a utilizar*/
	public void ConfirmPayment() {
		clickPaymentMethod.click();		
		addCreditCard.click();
		enterOrder.click();
	}
}
