package PrimerosTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testGoogle {
    public WebDriver driver;
    @Test
    public void test_BusquedadExitosa() {
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
        driver.quit();
    }

    @Test
    public void test_BusquedadSinDatos() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        System.out.println("INGRESO CORRECTAMENTE A: " + driver.getTitle());

        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("sqdfvgv");
        searchBox.sendKeys(Keys.ENTER);

        searchBox = driver.findElement(By.name("q"));
        System.out.println("SE MANTUVO EL VALOR DE LA BUSQUEDAD COMO: " + searchBox.getAttribute("value"));

        WebElement searchFail = driver.findElement(By.xpath("//p[@role='heading']"));
        System.out.println("VALIDO MENSAJE DE BUSQUEDA SIN DATOS: " + searchFail.getText());
        driver.quit();
    }
}
