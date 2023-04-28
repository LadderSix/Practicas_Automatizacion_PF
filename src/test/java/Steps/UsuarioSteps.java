package Steps;

import PageFactory.HomePage;
import PageFactory.MiServipagPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import Pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Base.*;
import org.joda.time.Seconds;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class UsuarioSteps{
    WebDriver driver;
    HomePage homepage;
    MiServipagPage miServipagPage;

    @Given("el usuario se encuentra en la pagina de servipag")
    public void el_usuario_se_encuentra_en_la_pagina_de_servipag() {
        System.setProperty("webdriver.chrome.driver","src//main//resources//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://portal.servipag.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @When("el usuario presiona en boton Mi Servipag")
    public void el_usuario_presiona_en_boton_Mi_Servipag(){
        homepage = new HomePage(driver);
        homepage.btnMiServipag();

    }
    @And("el usuario ingreso rut y password")
    public void el_usuario_ingreso_rut_y_password(){
        String rut = "175553878";
        String pass = "Rojas651";

        homepage.iniciarSesion(rut,pass);
    }
    @Then("el usuario puede ver su informacion")
    public void el_usuario_puede_ver_su_informacion(){
        miServipagPage = new MiServipagPage(driver);
        miServipagPage.irAlPerfil();
    }
}
