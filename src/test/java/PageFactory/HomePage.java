package PageFactory;

import Base.BaseSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseSelenium {
    public HomePage(WebDriver driver){
        super(driver);

        //Inicializamos los Webelements
        PageFactory.initElements(driver,this );
    }

    //Centralizar los localizadores
    @FindBy(how = How.NAME, using = "username" )
    private WebElement rut;

    @FindBy(how = How.CSS, using = "\"input[formcontrolname='password']\"" )
    private WebElement password;

    @FindBy(how = How.XPATH, using = "/html/body/modal-container/div/div/login-modal-login/div/div[2]/form/section/button" )
    private WebElement btnIngresar;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Mi Servipag')]" )
    private WebElement btnMiServipag;


    //Definir las acciones de la Página


    public void btnMiServipag(){
      btnMiServipag.click();
      esperarXSegundos(1000);
    }
    public void iniciarSesion(String miRut,String pass){
        rut.sendKeys(miRut);
        password.sendKeys(pass);
        btnIngresar.click();
    }
    public void getTituloPagina(){
        getTituloPagina();
    }

}
