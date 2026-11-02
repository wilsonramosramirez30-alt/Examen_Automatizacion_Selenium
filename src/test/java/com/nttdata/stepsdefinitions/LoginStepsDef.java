package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;


import static com.nttdata.core.DriverManager.*;

public class LoginStepsDef {

    private WebDriver driver;

    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }

    @Dado("estoy en la página de la tienda")
    public void que_me_encuentro_en_la_página_de_login() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion?back=https%3A%2F%2Fqalab.bensg.com%2Fstore%2Fpe%2F");
        screenShot();
    }
    @Y("me logueo con mi correo {string} y clave {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String user, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.ingresoUsuarioYClave(user,password);
        esperaImplicita();
        screenShot();
    }

    @Cuando("navego a la categoria Clothes y subcategoria Men")
    public void navego_a_la_categoria_clothes_y_subcategoria_men() {
        InventorySteps inventarioSteps = new InventorySteps(driver);
        inventarioSteps.categoria();
        inventarioSteps.subcategoria();
        esperaImplicita();
        screenShot();
    }
    @Y("agrego 2 unidades del primer producto al carrito")
    public void agrego_2_unidades_del_primer_producto_al_carrito() {
        InventorySteps inventarioSteps = new InventorySteps(driver);
        inventarioSteps.unidad();
        esperaImplicita();
        inventarioSteps.cantidad();
        esperaImplicita();
        inventarioSteps.agregar();
        esperaImplicita();
        screenShot();
    }

    @Entonces("valido en el popup la confirmación {string} del producto agregado")
    public void valido_que_debería_aparecer_el_título_de(String expectedTitle) {
        String confirmaciondemensaje =  inventorySteps(driver).confirmacion();
        Assertions.assertEquals(expectedTitle, confirmaciondemensaje);
        esperaImplicita();
        screenShot();
    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void valido_en_el_popup_el_monto_total() {

        double montobase =  inventorySteps(driver).montobase();
        double cantidadproducto = inventorySteps(driver).cantidadproducto();
        double montocalculo = (montobase*cantidadproducto);
        double montofinal = inventorySteps(driver).montof();
        Assertions.assertEquals(montocalculo, montofinal, 0.01);
        esperaImplicita();
        screenShot();
    }

    @Cuando("finalizo la compra")
    public void finalizo_la_compra() {
        InventorySteps inventarioSteps = new InventorySteps(driver);
        inventarioSteps.comprar();
        esperaImplicita();
        screenShot();
    }

    @Entonces("valido el titulo de la pagina del {string}")
    public void valido_el_titulo_de_la_pagina_carrito(String expectedTitle) {
        String confirmacioncarrito =  inventorySteps(driver).mensajecarrito();
        Assertions.assertEquals(expectedTitle, confirmacioncarrito);
        esperaImplicita();
        screenShot();
    }
}
