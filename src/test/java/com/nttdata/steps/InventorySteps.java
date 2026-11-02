package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import com.nttdata.page.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventorySteps {

    private WebDriver driver;

    //constructores
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    public void categoria(){
        this.driver.findElement(InventoryPage.categoria).click();
    }

    public void subcategoria(){
        this.driver.findElement(InventoryPage.subcategoria).click();
    }

    public void unidad(){
        this.driver.findElement(InventoryPage.unidad).click();
    }

    public void cantidad(){
        //this.driver.findElement(InventoryPage.cantidad).clear();
        //this.driver.findElement(InventoryPage.cantidad).sendKeys("2");
        this.driver.findElement(InventoryPage.cantidad).click();
    }

    public void agregar(){
        this.driver.findElement(InventoryPage.agregar).click();
    }


    public String confirmacion(){
        return this.driver.findElement(InventoryPage.mensaje).getText();
    }

    public double montobase() {

        String montobase = this.driver.findElement(InventoryPage.montob).getText();
        return Double.parseDouble(montobase.replace("S/", "").trim());
    }
    public double cantidadproducto() {
        String montocalculado = this.driver.findElement(InventoryPage.montoc).getText();
        return Double.parseDouble(montocalculado.replace("S/", "").trim());
    }
    public double montof(){
        String montofinal = this.driver.findElement(InventoryPage.montof).getText();
        return Double.parseDouble(montofinal.replace("S/", "").trim());
    }

    public void comprar(){
        this.driver.findElement(InventoryPage.comprar).click();
    }

    public String mensajecarrito(){
        return this.driver.findElement(InventoryPage.mensajecarrito).getText();
    }

}
