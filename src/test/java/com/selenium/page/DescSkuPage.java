package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.config.BaseConfig;

public class DescSkuPage extends BaseConfig {
	public DescSkuPage (WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*declaramos nuestros elementos*/
	@FindBy (xpath = "(//*[@class='fb-btn fb-btn-primary fb-product-cta__controls--actions--choose full-width-btn'])")
	private WebElement addToCartBtn;
	
	@FindBy (xpath = "(//*[@class='fb-btn fb-btn-primary fb-added-to-basket__cta fb-added-to-basket__cta--basket'])[2]")
	private WebElement goToCartBtn;
	
	/*creamos nuestro metodo*/
	public void clickToCartBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(addToCartBtn));
		addToCartBtn.click();
	}
	public PurchageSumaryPage clickToGoBtn() {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(goToCartBtn));
		action.moveToElement(goToCartBtn).click().perform();
		return new PurchageSumaryPage(driver);
	}
}
