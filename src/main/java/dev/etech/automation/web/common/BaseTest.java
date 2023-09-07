package dev.etech.automation.web.common;

import dev.etech.automation.web.interfaces.AplicacaoWeb;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public static WebDriver driver;
    protected void inicializarDriver(AplicacaoWeb aplicacaoWeb){
        WebDriverManager.chromedriver().setup();
        driver = aplicacaoWeb.getDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
}
