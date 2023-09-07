package dev.etech.automation.web.funcs;

import dev.etech.automation.web.common.BaseTest;
import dev.etech.automation.web.pages.HomePage;

public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage();

    public String getTitleNome(){
        return driver.findElement(homePage.getTitleNome()).getText();
    }

    public void clicarCampoSair(){
        driver.findElement(homePage.getCampoSair()).click();
    }

    public String getCampoProcura(){
        return driver.findElement(homePage.getCampoProcura()).getText();
    }


}
