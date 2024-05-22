package com.PrimerosTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.junit.jupiter.api.Test;


class DBSearch {
	private WebDriver driver;


	@Test //hago llamado a el Junit he informo que lo que viene a contunuacion esun test
    public void test_Digital_booking () throws InterruptedException{
        driver = new ChromeDriver(); // traigo un driver de tipo WebDriver
        driver.get("https://digital-booking-front.digitalhouse.com/"); // llamo a la pagina

        WebElement searchBox = driver.findElement(By.id("ciudad"));// por este id voy a seleccionar mi elemento
        searchBox.sendKeys("tigre");// lo que voy escribir en el input
        searchBox.sendKeys(Keys.ENTER);//y le doy enter para fijarlo

        WebElement searchButtom = driver.findElement(By.id("btn-buscador"));
        searchButtom.click(); // hago click en Buscar
        Thread.sleep(2000); // le doy tiempo para que cargue los resultados de busqueda

        WebElement validarteSearch = driver.findElement(By.className("categoria"));// selecciono el elemento a validar
        String resultado= validarteSearch.getText(); // capturo el texto
        System.out.println("Resultado de la busqueda: "+ resultado); // muestro lo que capture por consola
        assertTrue(resultado.contains("CABAÃ±A\nLa Carmelita")); // comparo el resultado con lo que espero

        driver.quit();


    }
}