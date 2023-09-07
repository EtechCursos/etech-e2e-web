package dev.etech.automation.web.configuration;

import dev.etech.automation.web.common.BaseTest;
import dev.etech.automation.web.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before
    public void beforeTest(){
        super.inicializarDriver(Web.CHROME);
    }
    @After
    public void afterTest(){
        driver.quit();
    }
}
