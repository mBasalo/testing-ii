package com.PrimerosTests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDHBookingTest {
    public WebDriver driver;

    @Test
    public void test_LogueoExitosa()  {
        driver = new ChromeDriver();
        driver.get("https://digital-booking-front.digitalhouse.com/login");

        WebElement searchBoxMail = driver.findElement(By.id("email"));
        searchBoxMail.sendKeys("mbasalogutierrez@gmail.com");

        WebElement searchBoxPass = driver.findElement(By.id("password"));
        searchBoxPass.sendKeys("Admin123." + Keys.ENTER); // Simula presionar Enter después de ingresar la contraseña

        System.out.println("Verifico que me loguee");
    }
} 

