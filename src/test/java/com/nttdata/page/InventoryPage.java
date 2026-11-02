package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By categoria = By.xpath("//*[@id=\"category-3\"]/a");

    public static By subcategoria = By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[2]/ul/li[1]/a");


    public static By unidad = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[2]/h2/a");

    public static By cantidad = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]");

    public static By agregar = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");

    public static By mensaje = By.xpath("//*[@id=\"myModalLabel\"]");

    public static By montob = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[1]/div/div[2]/p");
    public static By montoc = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[1]/div/div[2]/span[3]/strong");


    public static By montof = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[4]/span[2]");

    public static By comprar = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");

    public static By mensajecarrito = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[1]/h1");

}
