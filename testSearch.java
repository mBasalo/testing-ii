package DigitalBooking;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class testSearch {
    public WebDriver driver;

    @Test
    public void test_BusquedaExitosa() throws InterruptedException {
        driver = new ChromeDriver();
        SearchPage searchPage = new SearchPage(driver);
        searchPage.getUrl("https://digital-booking-front.digitalhouse.com/");

        searchBox.sendKeys("punta del este");
        Thread.sleep(2000);

        searchBox.sendKeys(Keys.ENTER);
        //searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement searchButtom = driver.findElement(By.id("btn-buscador"));
        searchButtom.click();
        Thread.sleep(2000);

        WebElement validateSearch = driver.findElement(By.className("categoria"));
        String resultado = validateSearch.getText();
        System.out.println("Resultado de la busqueda: " + resultado);
        assertTrue(resultado.contains("CASA DE PLAYA\nVilla Kantounes Studio Ostria"));

        driver.quit();
    }
}