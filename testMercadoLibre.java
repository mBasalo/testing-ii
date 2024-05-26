package PrimerosTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testMercadoLibre {
    public WebDriver driver;

    @Test
    public void testBusquedadML() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.mercadolibre.com.ar/");

        WebElement searchBoxMl = driver.findElement(By.id("cb1-edit"));

        searchBoxMl.sendKeys("iPhone 13");

        WebElement searchButtom = driver.findElement(By.className("nav-search-btn"));
        searchButtom.click();

        WebElement filtroMinimo = driver.findElement(By.xpath("//*[@id=\":Rap7cle6:\"]"));
        WebElement filtroMaximo = driver.findElement(By.cssSelector("#\\:Rcp7cle6\\:"));

        filtroMinimo.sendKeys("256");
        Thread.sleep(500);
        filtroMaximo.sendKeys("256");

        Thread.sleep(500);
        WebElement searchMemory = driver.findElement(By.cssSelector("[data-testid=\"submit-INTERNAL_MEMORY\"]"));
        searchMemory.click();

        WebElement secondOption = driver.findElement(By.xpath("//h2[normalize-space()='Apple iPhone 15 Pro Max (256 GB) - Titanio Natural']"));
        secondOption.click();
        Thread.sleep(500);

        WebElement buyButtom = driver.findElement(By.id(":R15d3a6c4um:"));
        buyButtom.click();

        WebElement textLogin = driver.findElement(By.xpath("//h1[normalize-space()='¡Hola! Para comprar, ingresá a tu cuenta']"));
        System.out.println("Verifico el mensaje de login que sea: " + textLogin.getText());
        driver.quit();
    }
}