package com.selenium.test;

import org.testng.annotations.Test;
import com.selenium.config.BaseConfig;
import com.selenium.page.DescSkuPage;
import com.selenium.page.HomeDeliveryPage;
import com.selenium.page.HomePage;
import com.selenium.page.SesionPage;
import com.selenium.page.HomeUserLogInPage;
import com.selenium.page.PaymentMethodPage;
import com.selenium.page.PurchageSumaryPage;

public class Test01 extends BaseConfig{
	@Test //llamamos la anotación @Test del WebDriver
	public void PrimeraCompra() {
		HomePage home_page = new HomePage(driver); //instanciamos nuestro metodo homepage
		/* ASI FUNCIONA SIN REDIRECCIONAR
		home_page.InicioSesion();
		home_page.GotoInicioSesion();
		*/
		SesionPage sesion_page = home_page.GotoInicioSesion();
		HomeUserLogInPage home_user_log_in_page = sesion_page.LoginUser();
		DescSkuPage desc_sku_page = home_user_log_in_page.searchSku();
		desc_sku_page.clickToCartBtn();
		PurchageSumaryPage purchage_sumary_page = desc_sku_page.clickToGoBtn();
		HomeDeliveryPage home_delivery_page = purchage_sumary_page.clickToGoPurchage();
		PaymentMethodPage payment_method_page = home_delivery_page.clickHomeDelivery();
		payment_method_page.ConfirmPayment();
	}
}
