package com.PrimerosTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SearchTest {
	
	private WebDriver driver;

	@Test
    public void test_1() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        System.out.println("INGRESO CORRECTAMENTE A: " + driver.getTitle());

        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("Selenium");
        searchBox.sendKeys(Keys.ENTER);

        //WebElement searchButtom = driver.findElement(By.name("btnK"));
        //searchButtom.click();

        searchBox = driver.findElement(By.name("q"));
        System.out.println("SE MANTUVO EL VALOR DE LA BUSQUEDAD COMO: " + searchBox.getAttribute("value"));
    }
}