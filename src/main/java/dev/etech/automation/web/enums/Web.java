package dev.etech.automation.web.enums;

import dev.etech.automation.web.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum Web implements AplicacaoWeb {
    CHROME {
        @Override
        public WebDriver getDriver() {
            return new ChromeDriver();
        }
    }
    ;
}
