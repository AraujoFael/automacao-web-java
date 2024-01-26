package me.wcaquino.seubarriga.core;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import me.wcaquino.seubarriga.selectors.LoginSelector;
import org.junit.jupiter.api.*;

import static me.wcaquino.seubarriga.core.DriverCenter.*;


public class BaseTest extends BasePage {

    static LoginSelector selector = new LoginSelector();

    @BeforeEach
    public void inicializa(){
        getDriver().get("https://seubarriga.wcaquino.me/login");
        //loginBar("FirstNewTest@ggmail.com", "Teste@123");

    }
    @AfterEach
    public  void finaliza(TestInfo testInfo){
       /* if (getDriver() instanceof TakesScreenshot) {
            String currentTestName = testInfo.getTestMethod().get().getName();
            File screenshotFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            String screenshotFileName = "screenshot_" + currentTestName + ".png";

            try {
                FileHandler.copy(screenshotFile, new File(screenshotFileName));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/

      //KillDriver();


    }




}
