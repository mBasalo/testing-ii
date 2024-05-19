package com.PrimerosTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MLTest {

    public WebDriver driver;

    // Prueba de búsqueda básica en MercadoLibre
    @Test
    public void testBusquedadML() throws InterruptedException {

        // Inicialización del WebDriver y navegación a la página de MercadoLibre
        driver = new ChromeDriver();
        driver.get("https://www.mercadolibre.com.ar/");

        // Búsqueda de un producto utilizando el cuadro de búsqueda y hacer clic en el botón de búsqueda
        WebElement searchBoxMl = driver.findElement(By.id("cb1-edit"));
        searchBoxMl.sendKeys("iPhone 13");
        WebElement searchButton = driver.findElement(By.className("nav-search-btn"));
        searchButton.click();

        // Seleccionar el segundo producto de la lista y hacer clic en el botón de compra
        WebElement secondOption = driver.findElement(By.xpath("//h2[normalize-space()='Apple iPhone 13 Pro Max (512 GB) - Grafito - Distribuidor Autorizado']"));
        secondOption.click();
        Thread.sleep(500);
        WebElement buyButton = driver.findElement(By.id(":R15d3a6c4um:"));
        buyButton.click();

        // Verificar el mensaje de inicio de sesión y cerrar el navegador
        WebElement textLogin = driver.findElement(By.xpath("//h1[normalize-space()='¡Hola! Para comprar, ingresá a tu cuenta']"));
        System.out.println("Verifico el mensaje de login que sea: " + textLogin.getText());
        driver.quit();
    }

    // Prueba de búsqueda con filtros en MercadoLibre
    @Test
    public void testBusquedadMLFiltros() throws InterruptedException {

        // Inicialización del WebDriver y navegación a la página de MercadoLibre
        driver = new ChromeDriver();
        driver.get("https://www.mercadolibre.com.ar/");

        // Búsqueda de un producto utilizando el cuadro de búsqueda y hacer clic en el botón de búsqueda
        WebElement searchBoxMl = driver.findElement(By.id("cb1-edit"));
        searchBoxMl.sendKeys("iPhone 13");
        WebElement searchButton = driver.findElement(By.className("nav-search-btn"));
        searchButton.click();

        // Aplicación de filtros de precio mínimo y máximo
        WebElement filtroMinimo = driver.findElement(By.xpath("//*[@id=\":Rap7cle6:\"]"));
        WebElement filtroMaximo = driver.findElement(By.cssSelector("#\\:Rcp7cle6\\:"));
        filtroMinimo.sendKeys("256");
        Thread.sleep(500);
        filtroMaximo.sendKeys("256");

        // Aplicación de un filtro de memoria interna y cerrar el navegador
        Thread.sleep(500);
        WebElement searchMemory = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[3]/aside/section[2]/div[14]/ul/li[5]/form/div[3]"));
        searchMemory.click();
        driver.quit();
    }
}