import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ParcialTest {
	
    public WebDriver driver;


    @Test
    public void test_LogueoExitosa() throws InterruptedException  {
        driver = new ChromeDriver();
        driver.get("https://opencart.abstracta.us/index.php?route=common/home");
        
        WebElement configAvanzada = driver.findElement(By.id("details-button"));
        configAvanzada.sendKeys(Keys.ENTER);
        
        WebElement accederSitio = driver.findElement(By.id("proceed-link"));
        accederSitio.click();
        
        WebElement miCuenta = driver.findElement(By.className("dropdown"));
        miCuenta.click();
        

        Thread.sleep(1500); 
        WebElement register = driver.findElement(By.xpath("//a[contains(text(), 'Register')]"));
        register.click();
        
        
        Thread.sleep(3000); 
        

        
        
        
        
        
        
        
        
        
        
        
        Thread.sleep(3000); 
        driver.quit();
    }
}
