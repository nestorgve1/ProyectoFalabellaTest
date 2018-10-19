package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.config.BaseConfig;

public class HomeDeliveryPage extends BaseConfig{
	public HomeDeliveryPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*declaramos los elementos a utilizar*/
	@FindBy (xpath = "(//*[@class='fbra_button fbra_test_button fbra_componentCheckoutAddressBook__useAddressButton fbra_test_componentCheckoutAddressBook__useAddressButton'])[1]")
	private WebElement addHomeDelivery;
	@FindBy (xpath = "(//div[@class='fbra_radioOption fbra_test_radioOption fbra_dateTimeDeliverySlot__slot fbra_test_dateTimeDeliverySlot__slot'])[5]")
	private WebElement selectDate;
	@FindBy (xpath = "(//*[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton'])")
	private WebElement continuebtn;
	/*declaramos el metodo a utilizar*/
	public PaymentMethodPage clickHomeDelivery() {
		addHomeDelivery.click();
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(selectDate));
		action.moveToElement(selectDate).click().perform();
		continuebtn.click();
		return new PaymentMethodPage(driver);
	}
}
