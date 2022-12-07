import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumAutomationScript {

    @Test
    public void login() throws InterruptedException {
        //przygotowanie
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        //inicjalizacja  Drivera
        WebDriver driver = new ChromeDriver(options);
        //otwieram konkretną stronę
        driver.get("https://aleksandrafujakfotografia.mypixieset.com/contact/");

        WebElement name = driver.findElement(By.id("name-L0VQOz"));
        name.sendKeys("Aleksandra");
//        driver.findElement(By.xpath("//[@id='e-mail-9P1K3n']")); lub dodaję .var + tab i wychodzi:
        WebElement email = driver.findElement(By.xpath("//*[@id='e-mail-9P1K3n']"));
        email.sendKeys("fujak.aleksandra@gmail.com");
//        WebElement message = driver.findElement(By.cssSelector("#message-1lQn49"));
//        message.sendKeys("Poproszę ofertę na reportaż ślubny.");

        name.clear();
        //inna opcja
        driver.findElement(By.cssSelector("#message-1lQn49")).sendKeys("Poproszę ofertę na reportaż ślubny.");

        Thread.sleep(3000);
        //zamknięcie Drivera
        driver.quit();
    }
}

