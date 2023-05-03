package PageFactory;

import Base.BaseSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerfilPage extends BaseSelenium{
    public PerfilPage(WebDriver driver){
        super(driver);

        //Inicializamos los Webelements
        PageFactory.initElements(driver,this );

    }

    //Centralizar los localizadores
    @FindBy(xpath = "//h4[contains(text(),'Hola Matias')]")
    WebElement tituloPerfil;

    @FindBy(css = "#rut")
    WebElement miRut;

    By miNombre = By.xpath("//input[@id='validationCustom01']");
    By miApellido = By.xpath("//input[@id='validationCustom02']");

    @FindBy(xpath = "//button[@id='button-basic']")
    WebElement menu;

    By listaPerfil = By.xpath("//ul[@id='dropdown-basic']/li");

    @FindBy(xpath = "//a[contains(text(),'Cerrar sesión')]")
    WebElement btnCerrarSesion;


}
