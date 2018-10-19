/*Página de Inicio*/
package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.config.BaseConfig;

public class HomePage extends BaseConfig {
	public HomePage(WebDriver driver) {
		super(); //invoca el constructor de la clase superior que es BaseConfig y se utiliza con el extends
		this.driver = driver;
		PageFactory.initElements(driver, this); //pasamos el driver y la clase
	}
	@FindBy (xpath = "(//div[@class='fb-masthead-login__user-info__logged'])") //buscamos nuestro elemento abrir ventana sesion boton
	private WebElement openwindowssesionbtn; //nombramos nuestro objeto de WebElement y lo hacemos privado.
	
	@FindBy (xpath = "(//*[@class='fb-btn fb-btn-primary'])") //buscamos nuestro elemento iniciar sesion
	private WebElement gotoinisesion; //nombramos nuestro objeto de WebElement y lo hacemos privado.
	
	public SesionPage GotoInicioSesion() { //creamos el metodo GotoInicioSesion
		WebDriverWait wait = new WebDriverWait(driver, 5); //indicamos que espere por 5 segundos que cargue la pagina para hacer la acción											   
		wait.until(ExpectedConditions.visibilityOf(openwindowssesionbtn)); //espera hasta que se vea cargada el elemento, puede ser antes de 5seg
		openwindowssesionbtn.click(); //hacemos click en el elemento.
		gotoinisesion.click(); //hacemos click en el elemento.
		return new SesionPage(driver);
	} 
}
